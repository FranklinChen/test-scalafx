name := "test-scalafx"

organization := "com.franklinchen"

version := "1.0.0"

scalaVersion := "2.10.2-RC2"

libraryDependencies += "org.scalafx" %% "scalafx" % "1.0.0-M4"

libraryDependencies += "org.specs2" %% "specs2" % "2.0-RC1" % "test"

unmanagedJars in Compile += Attributed.blank(
    file(scala.util.Properties.javaHome) / "lib" / "jfxrt.jar")

fork in run := true
