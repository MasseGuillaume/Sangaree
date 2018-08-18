import sangria.{ast => sangria}
import scala.meta
import scala.meta._

object Sangaree {
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
   
  def fields(fields: Vector[sangria.FieldDefinition]): List[Term.Param] = {
    fields.iterator.map{
      case d: sangria.FieldDefinition =>
        param(d.name, tpe(d.fieldType))
    }.toList
  }

  def definitions(definitions: Vector[sangria.Definition]): List[Stat] = {
    definitions.iterator.map{
      case d: sangria.DirectiveDefinition =>
        ???
      case d: sangria.EnumTypeDefinition =>
        ???
      case d: sangria.EnumTypeExtensionDefinition =>
        ???
      case d: sangria.FragmentDefinition =>
        ???
      case d: sangria.InputObjectTypeDefinition =>
        ???
      case d: sangria.InputObjectTypeExtensionDefinition =>
        ???
      case d: sangria.InterfaceTypeDefinition =>
        ???
      case d: sangria.ObjectTypeDefinition =>
        caseClass(d.name, fields(d.fields))

      case d: sangria.ObjectTypeExtensionDefinition =>
        ???

      case d: sangria.OperationDefinition =>
        ???

      case d: sangria.ScalarTypeDefinition =>
        ???

      case d: sangria.ScalarTypeExtensionDefinition =>
        ???

      case d: sangria.SchemaDefinition =>
        ???

      case d: sangria.SchemaExtensionDefinition =>
        ???

      case d: sangria.UnionTypeDefinition =>
        ???

      case d: sangria.UnionTypeExtensionDefinition =>
        ???

      case d: sangria.InterfaceTypeExtensionDefinition =>
        ???
    }.toList
  }

  def apply(document: sangria.Document): Source = {
    Source(definitions(document.definitions))
  }
}
