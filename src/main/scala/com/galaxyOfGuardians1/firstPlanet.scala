package com.galaxyOfGuardians1

import org.apache.spark
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext.getOrCreate
import org.apache.spark.api.java.JavaSparkContext.fromSparkContext

object firstPlanet extends App {
  //println("hello Galaxy of Guardians")

  //Create spark context and run application in local
  val sc = new SparkContext("local", "SparkPractice")

  //Simple Aggregation function
  val rdd = sc.parallelize(Array(5, 10, 15))
  println(rdd.reduce(_ + _))

  val sourceRDD = sc.textFile("C:\\ProgramData\\sparkDatafile.txt")
  println(sourceRDD.collect().length) // returns row count

  sc.sequenceFile[String, Int]("C:\\ProgramData\\sparkDatafile.txt")

}
