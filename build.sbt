name := "test-scalafx"

organization := "com.franklinchen"

version := "1.0.0"

scalaVersion := "2.10.1"

libraryDependencies += "org.scalafx" %% "scalafx" % "1.0.0-M2"

unmanagedJars in Compile += Attributed.blank(
    file(scala.util.Properties.javaHome) / "lib" / "jfxrt.jar")

fork in run := true
