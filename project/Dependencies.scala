import sbt._

object Dependencies {
  val akkaVersion = "2.5.0"

  val akkaDependencies = Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion
  )
}