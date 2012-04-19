import sbt._
import Keys._

object MinimalBuild extends Build {

  lazy val buildVersion =  "2.0.1"

  lazy val typesafe = "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
  lazy val typesafeSnapshot = "Typesafe Snapshots Repository" at "http://repo.typesafe.com/typesafe/snapshots/"

  lazy val root = Project(id = "play-mini-scala-sample", base = file("."), settings = Project.defaultSettings).settings(
    version := buildVersion,
    organization := "com.example",
    resolvers += typesafe,
    resolvers += typesafeSnapshot,
    libraryDependencies += "com.typesafe" %% "play-mini" % buildVersion,
    libraryDependencies += "play" %% "play-test" % buildVersion,
    libraryDependencies += "org.specs2" %% "specs2" % "1.7.1",
    mainClass in (Compile, run) := Some("play.core.server.NettyServer")
  )
}
