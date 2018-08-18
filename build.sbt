scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.sangria-graphql" %% "sangria" % "1.4.2",
  "org.scalameta" %% "scalameta" % "4.0.0-M8",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "com.googlecode.java-diff-utils" % "diffutils" % "1.3.0" % Test
)