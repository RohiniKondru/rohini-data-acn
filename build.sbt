version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.17"

lazy val root = (project in file("."))
  .settings(
    name := "SparkPractice"
  )

val sparkVersion = "3.4.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-streaming" % sparkVersion
libraryDependencies += "org.apache.kafka" %% "kafka" % "3.5.1"
libraryDependencies += "org.apache.spark" %% "spark-sql-kafka-0-10" % "3.0.0"

dependencyOverrides += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"