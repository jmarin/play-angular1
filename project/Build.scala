import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-angular1"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "org.webjars" %% "webjars-play" % "2.1.0-2",
    "org.webjars" % "angularjs" % "1.1.5-1",
    "org.webjars" % "bootstrap" % "2.3.2"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )

}
