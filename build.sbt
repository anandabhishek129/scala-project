name := "shubhamprac"

version := "1.0"


scalaVersion in ThisBuild := "2.12.8"

scalacOptions += "-Ypartial-unification"



libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % Test

resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
