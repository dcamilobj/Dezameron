name := """Dezameron"""
organization := "co.edu.udea.dae"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

libraryDependencies += guice
libraryDependencies  += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.1.0"

herokuAppName in Compile := "dezameron-dae"
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "co.edu.udea.dae.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "co.edu.udea.dae.binders._"
