package sangaree

import org.scalatest.FunSuite

import sangria.ast._
import sangria.parser.QueryParser

import scala.util.Try

import java.nio.file._

import build.BuildInfo.scalaSourceDirectory

class SangareeSuite extends FunSuite with DiffAssertions {

  private def slurp(path: Path): String = 
    new String(Files.readAllBytes(path))

  private def slurpFromResources(path: String): String =
    slurp(Paths.get(this.getClass.getResource(path).toURI()))

  private def load(path: String): Document = QueryParser.parse(slurpFromResources(path)).get

  def check(file: String): Unit = {
    test(file) {
      val schema = load(s"/$file.graphql")
      val obtained = Generator(schema, file).toString
      val expected = slurp(Paths.get(scalaSourceDirectory).resolve(s"$file.scala"))

      // Files.write(Paths.get(s"obtained/$file.scala"), obtained.getBytes)

      assertNoDiff(obtained, expected)
    }
  }
  check("small")
  check("github")
}
