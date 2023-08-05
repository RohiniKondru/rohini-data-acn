package com.galaxyOfGuardians1
import org.apache.spark.sql.SparkSession

object kafkaStreamingDemo extends Serializable {

  def main(args: Array[String]): Unit = {
    //KAFKA
    // Subscribe to 1 topic defaults to the earliest and latest offsets
    val appName = "Kafka Examples"
    val master = "local[3]"
    val spark = SparkSession.builder().master(master).appName(appName).getOrCreate()
    val kafka_servers = "localhost:9092"

    val df = spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", kafka_servers)
      .option("subscribe", "kontext-events")
      .load()

    df.printSchema()
    val query = df.selectExpr("CAST(key AS STRING)", "CAST(value AS STRING)").writeStream.format("console").start()
    //query.awaitTermination()

    // Write key-value data from a DataFrame to a specific Kafka topic specified in an option
    /*df.selectExpr("CAST(key AS STRING)", "CAST(value AS STRING)")
      .write
      .format("kafka")
      .option("kafka.bootstrap.servers", kafka_servers)
      .option("topic", "kontext-events")
      .save()*/
  }
}
