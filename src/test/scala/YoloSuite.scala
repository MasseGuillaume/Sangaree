import org.scalatest.FunSuite

import sangria.ast._
import sangria.parser.QueryParser

import scala.util.Try

import java.nio.file._

class YoloSuite extends FunSuite with DiffAssertions {
  private def slurp(path: String): String =
    new String(Files.readAllBytes(Paths.get(this.getClass.getResource(path).toURI())))

  private def load(path: String): Document = QueryParser.parse(slurp(path)).get

  def check(file: String): Unit = {
    test(file) {
      val schema = load(s"$file.graphql")
      val obtained = Sangaree(schema).toString
      val expected = slurp(s"$file.scala")
      assertNoDiff(obtained, expected)
    }
  }
  check("small")
  check("github")
}
