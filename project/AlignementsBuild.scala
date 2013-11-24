import sbt._
import sbt.Keys._

object AlignementsBuild extends Build {

  lazy val alignements = Project(
    id = "alignements",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "alignements",
      organization := "org.xikilze",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2",
      libraryDependencies ++= Seq(
        "org.clapper" %% "grizzled-slf4j" % "1.0.1",
        "ch.qos.logback" % "logback-classic" % "1.0.13",
        "org.codehaus.groovy" % "groovy-all" % "2.1.6"
      )
    )
  )
}
