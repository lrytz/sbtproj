// resolvers += "scala-integration" at "https://scala-ci.typesafe.com/artifactory/scala-integration/"

ThisBuild / scalaVersion := "2.13.14"

// ThisBuild / scalaVersion := "2.13.12-bin-286f8d7"

ThisBuild / scalacOptions ++= List("-deprecation")

ThisBuild / develocityConfiguration := {
  val previousConfig = develocityConfiguration.value
  val previousBuildScan = previousConfig.buildScan
  previousConfig
    .withProjectId(ProjectId("java8-test"))
    .withServer(previousConfig.server.withUrl(Some(url("https://develocity.scala-lang.org"))))
    .withBuildScan(
      previousBuildScan
        .withPublishing(Publishing.onlyIf(_ => true))
        .withBackgroundUpload(false)
        .tag("Local")
        .withObfuscation(previousBuildScan.obfuscation.withIpAddresses(_.map(_ => "0.0.0.0")))
    )
}
