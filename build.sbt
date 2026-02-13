// resolvers += Resolver.scalaNightlyRepository

ThisBuild / scalaVersion := "2.13.18"
ThisBuild / crossScalaVersions := Seq("2.13.18", "3.8.1")

// ThisBuild / scalaVersion := "2.13.17-bin-98a15e6"

ThisBuild / scalacOptions ++= List("-deprecation")

libraryDependencies += "org.scalameta" %% "munit" % "1.0.3" % Test
