import sbt._
import Dependencies._

organization in ThisBuild := "com.github.reynoldsm88"
name := "scalatra-base"
scalaVersion in ThisBuild := "2.12.7"

resolvers in ThisBuild ++= Seq( "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases",
                                "Spray IO Repository" at "https://repo.spray.io/",
                                "Maven Central" at "https://repo1.maven.org/maven2/",
                                "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/",
                                "JCenter" at "https://jcenter.bintray.com",
                                "Local Ivy Repository" at s"file://${System.getProperty( "user.home" )}/.ivy2/local/default" )

lazy val root = ( project in file( "." ) ).settings( libraryDependencies ++= logging ++ scalatra ++ scalaTest )

mainClass in(Compile, run) := Some( "Main" )

enablePlugins( JavaAppPackaging )

// don't run tests when build the fat jar, use sbt test instead for that (takes too long when building the image)
test in assembly := {}

assemblyMergeStrategy in assembly := {
    case PathList( "META-INF", "MANIFEST.MF" ) => MergeStrategy.discard
    case PathList( "reference.conf" ) => MergeStrategy.concat
    case x => MergeStrategy.last
}
