import sangria.ast._
import scala.meta._

object Sangaree {
  def apply(document: Document): Source = {
    // TODO


    // schema.definitions.foreach{
    //   case d: DirectiveDefinition                => println("DirectiveDefinition")
    //   case d: EnumTypeDefinition                 => println("EnumTypeDefinition")
    //   case d: EnumTypeExtensionDefinition        => println("EnumTypeExtensionDefinition")
    //   case d: FragmentDefinition                 => println("FragmentDefinition")
    //   case d: InputObjectTypeDefinition          => println("InputObjectTypeDefinition")
    //   case d: InputObjectTypeExtensionDefinition => println("InputObjectTypeExtensionDefinition")
    //   case d: InterfaceTypeDefinition            => println("InterfaceTypeDefinition")
    //   case d: ObjectTypeDefinition               => 
    //     println(d.name)
    //     println(d.interfaces)
    //     println(d.fields)
    //     println(d.directives)
    //     println(d.description)
    //     println(d.comments)
    //     println(d.trailingComments)
    //     println(d.location)

    //   case d: ObjectTypeExtensionDefinition      => println("ObjectTypeExtensionDefinition")
    //   case d: OperationDefinition                => println("OperationDefinition")
    //   case d: ScalarTypeDefinition               => println("ScalarTypeDefinition")
    //   case d: ScalarTypeExtensionDefinition      => println("ScalarTypeExtensionDefinition")
    //   case d: SchemaDefinition                   => println("SchemaDefinition")
    //   case d: SchemaExtensionDefinition          => println("SchemaExtensionDefinition")
    //   case d: UnionTypeDefinition                => println("UnionTypeDefinition")
    //   case d: UnionTypeExtensionDefinition       => println("UnionTypeExtensionDefinition")
    //   case d: InterfaceTypeExtensionDefinition   => println("InterfaceTypeExtensionDefinition")
    // }


    Source(Nil)
  }
}