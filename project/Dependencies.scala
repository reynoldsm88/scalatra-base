import sbt._

object Dependencies {

    val slf4jVersion = "1.7.36"
    val logbackVersion = "1.4.0"
    val scalaTestVersion = "3.2.9"
    val scalatraVersion = "2.8.2"
    val jettyWebappVersion = "9.4.48.v20220622"
    val servletApiVersion = "3.1.0"
    val scoptVersion = "4.1.0"
    val betterFilesVersion = "3.9.1"

    val logging = Seq( "org.slf4j" % "slf4j-api" % slf4jVersion,
                       "ch.qos.logback" % "logback-classic" % logbackVersion )
    
    val betterFiles = Seq( "com.github.pathikrit" %% "better-files" % betterFilesVersion )

    val scalatra = Seq( "org.scalatra" %% "scalatra" % scalatraVersion,
                        "org.scalatra" %% "scalatra-scalatest" % scalatraVersion % "test",
                        "org.eclipse.jetty" % "jetty-webapp" % jettyWebappVersion,
                        "javax.servlet" % "javax.servlet-api" % servletApiVersion )

    val scalaTest = Seq( "org.scalatest" %% "scalatest" % scalaTestVersion % "test" )

    val scopt = Seq( "com.github.scopt" %% "scopt" % scoptVersion )

}
