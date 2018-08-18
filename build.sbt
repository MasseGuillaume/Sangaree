lazy val sharedSettings = Seq(
  scalaVersion := "2.12.6"
)

lazy val runtime = project
  .in(file("runtime"))
  .settings(sharedSettings)

lazy val generator = project
  .in(file("generator"))
  .settings(
    libraryDependencies ++= Seq(
      "org.sangria-graphql" %% "sangria" % "1.4.2",
      "org.scalameta" %% "scalameta" % "4.0.0-M8"
    )
  )

lazy val tests = project
  .in(file("tests"))
  .settings(sharedSettings)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % Test,
      "com.googlecode.java-diff-utils" % "diffutils" % "1.3.0" % Test
    ),
    buildInfoPackage := "build",
    buildInfoKeys := Seq[BuildInfoKey](
      "scalaSourceDirectory" -> (scalaSource in (inputs, Compile)).value.toString
    ),
    test in Test := (test in Test).dependsOn(compile in (inputs, Compile)).value
  )
  .enablePlugins(BuildInfoPlugin)
  .dependsOn(generator)

lazy val inputs = project
  .in(file("inputs"))
  .settings(sharedSettings)
  .dependsOn(runtime)
