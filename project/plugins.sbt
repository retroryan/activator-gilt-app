// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/maven-releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.3")

// Use to generate play routes from an api.json file
addSbtPlugin("play-api-routesgen" % "play-api-routesgen" % "1.0-SNAPSHOT")
