name := "$name$"
version := sys.env.getOrElse("VERSION", "0.0.1-RC1")
organization := "io.hiis"
organizationHomepage := Some(new URI("https://www.hiis.io").toURL)
scalaVersion := "$scala_version$"

val tapirCore = "1.11.15"
val circe = "0.14.10"
val scalatest = "3.2.19"

lazy val dependencies = Seq(
  "com.softwaremill.sttp.tapir" %% "tapir-core" % tapirCore,
  "io.circe" %% "circe-core" % circe,
  "io.circe" %% "circe-generic" % circe,
  "io.circe" %% "circe-parser" % circe,
  "org.scalatest" %% "scalatest" % scalatest % Test
)

lazy val compilerOptions = Seq(
  "-unchecked",
  "-deprecation",
  "-encoding",
  "utf8",
  "-feature",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-language:existentials",
  "-language:postfixOps",
  "-Ywarn-value-discard",
  "-Ymacro-annotations",
  "-Ywarn-unused:imports"
)

scalacOptions ++= compilerOptions
libraryDependencies ++= dependencies
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
)

scalafmtOnCompile := true
semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision

resolvers += "hiis-repository-releases" at "https://artifacts.hiis.io/releases"
resolvers += "hiis-repository-private" at "https://artifacts.hiis.io/private"

publishTo := Some(
  "Reposilite" at ("https://artifacts.hiis.io/" + sys.env.getOrElse("REPOSITORY", "private"))
)
credentials += Credentials(
  "Reposilite",
  "artifacts.hiis.io",
  sys.env.getOrElse("DEV_ID", "dev"),
  sys.env.getOrElse("ARTIFACT_TOKEN", "Fail")
)
publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)
versionScheme := Some("early-semver")
mimaPreviousArtifacts := Set(
  "io.hiis" %% "$name$" % sys.env.getOrElse("PREVIOUS_VERSION", "0.0.1-RC.1")
)

addCommandAlias("fix-lint", ";scalafixAll; scalafmtSbt;")
