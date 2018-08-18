package sangaree

import sangria.{ast => sangria}
import scala.meta
import scala.meta._

object Generator {
  def param(name: String, tpe: Type): Term.Param = 
    Term.Param(Nil, Term.Name(name), Some(tpe),None)

  def emptyTemplate: Template = 
    Template(Nil,Nil,Self(Name.Anonymous(),None),Nil)

  def caseClass(name: String, params: List[Term.Param]): Defn.Class = {
    Defn.Class(
      List(Mod.Case()),
      Type.Name(name),
      Nil,
      Ctor.Primary(
        Nil,
        Name.Anonymous(),
        List(params)
      ),
      emptyTemplate
    )
  }

  def option(tpe: meta.Type): meta.Type = 
    Type.Apply(Type.Name("Option"),List(tpe))

  def list(tpe: meta.Type): meta.Type = 
    Type.Apply(Type.Name("List"),List(tpe))
    
  def tpe(t: sangria.Type): meta.Type = {
    t match {
      case sangria.NamedType(name, _) => option(Type.Name(name))
      case sangria.NotNullType(t2, _) => tpe(t2)
      case sangria.ListType(t2, _)    => list(tpe(t2)) 
    }
  }
   
  def fieldsDef(fields: Vector[sangria.FieldDefinition]): List[Term.Param] = {
    fields.iterator.map{
      case d: sangria.FieldDefinition =>
        param(d.name, tpe(d.fieldType))
    }.toList
  }

  def fieldsInput(fields: Vector[sangria.InputValueDefinition]): List[Term.Param] = {
    Nil
  }

  def union(name: String, types: Vector[sangria.NamedType]): Stat = {
    
    def or(l: sangria.NamedType, r: sangria.NamedType): Type.ApplyInfix =
      Type.ApplyInfix(Type.Name(l.name), Type.Name("|"), Type.Name(r.name))

    def orAcc(acc: Type.ApplyInfix, r: sangria. NamedType): Type.ApplyInfix =
      Type.ApplyInfix(acc, Type.Name("|"), Type.Name(r.name))      

    val rhs = 
      types.toList match {
        case Nil => throw new Exception(s"union $name cannot be empty")
        case h :: Nil => Type.Name(h.name)
        case h1 :: h2 :: t0 =>
          t0.foldLeft(or(h1, h2))(orAcc)
      }


    val tpe = Type.Name(name)
    q"type $tpe = $rhs"
  }

  def enum(name: String, values: Vector[sangria.EnumValueDefinition]): List[Stat] = {
    val tName = Type.Name(name)
    val teName = Term.Name(name)
    val parent = Init(tName, Name.Anonymous(), Nil)

    val cases =
      values.iterator.map{v => 
        val valueTName = Term.Name(v.name)
        q"case object $valueTName extends $parent {}"
      }.toList

    q"sealed trait $tName" :: q"object $teName { ..$cases }" :: Nil
  }
  
  def definitions(definitions: Vector[sangria.Definition]): List[Stat] = {
    definitions.iterator.flatMap{
      case d: sangria.DirectiveDefinition =>
        ???

      case d: sangria.EnumTypeDefinition =>
        enum(d.name, d.values)

      case d: sangria.EnumTypeExtensionDefinition =>
        ???

      case d: sangria.FragmentDefinition =>
        ???

      case d: sangria.InputObjectTypeDefinition =>
        Iterator(caseClass(d.name, fieldsInput(d.fields)))
        
      case d: sangria.InputObjectTypeExtensionDefinition =>
        ???

      case d: sangria.InterfaceTypeDefinition =>
        Iterator(caseClass(d.name, fieldsDef(d.fields)))


      case d: sangria.ObjectTypeDefinition =>
        Iterator(caseClass(d.name, fieldsDef(d.fields)))

      case d: sangria.ObjectTypeExtensionDefinition =>
        ???

      case d: sangria.OperationDefinition =>
        ???

      case d: sangria.ScalarTypeDefinition =>
        val tpe = Type.Name(d.name)
        Iterator(q"type $tpe = AnyVal")

      case d: sangria.ScalarTypeExtensionDefinition =>
        ???

      case d: sangria.SchemaDefinition =>
        ???

      case d: sangria.SchemaExtensionDefinition =>
        ???

      case d: sangria.UnionTypeDefinition =>
        // Commit | PullRequest
        Iterator(union(d.name, d.types))

      case d: sangria.UnionTypeExtensionDefinition =>
        ???

      case d: sangria.InterfaceTypeExtensionDefinition =>
        ???
    }.toList
  }

  def apply(document: sangria.Document, packageName: String): Source = {
    val stats = definitions(document.definitions)
    val (typeDef, other) = stats.partition(_.is[Defn.Type])

    val pkg = Term.Name(packageName)

    val po  =
      if (typeDef.nonEmpty) List(q"package object $pkg { ..$typeDef }")
      else Nil

    Source(
      q"import sangaree._" ::
      po :::
      List(q"package $pkg { ..$other }")
    )
  }
}
