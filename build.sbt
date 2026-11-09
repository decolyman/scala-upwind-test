name := "scala-upwind-test"
version := "0.1.0"
scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  // SCA Critical: Log4Shell (CVE-2021-44228)
  "org.apache.logging.log4j" % "log4j-core" % "2.14.1",
  // SCA High: Jackson deserialization (CVE-2020-36518)
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.0",
  // Akka HTTP
  "com.typesafe.akka" %% "akka-http" % "10.1.11"
)
