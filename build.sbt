name := "test-scalafx"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/test-scalafx"))

startYear := Some(2013)

description := "Test ScalaFX"

version := "1.0.0"

scalaVersion := "2.10.3"

scalacOptions += "-deprecation"

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.0-M2"

libraryDependencies += "org.specs2" %% "specs2" % "2.2.3" % "test"

unmanagedJars in Compile += Attributed.blank(
    file(scala.util.Properties.javaHome) / "lib" / "jfxrt.jar")

fork in run := true
