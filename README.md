"# rohini-data-acn" 
http://cpx-vtky2f8anjo.dir.svc.accenture.com:4040/executors/

Spark - Standalone cluster (--master spark://[HOST]:7077)

::::::::::::::::::::::::::::::::::::::::::::::::::NOTES::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
sc - spark context
spark-shell
spark-

scala> sc.parallelize(1 to 10)
scala> res1.collect
res4: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)

Spark Components: GraphX, MLlib, Structured streaming/spark streaming, Spark SQL+DataFrames+Datasets
Core and SQL Engine: Java, Scala, Python, R and SQL - the programs have written in any of these lang are decomposed into byte code

Spark SQL+DataFrames+Datasets: Deals with structured data. submit SQL query on top of data and create temporary or permanent table data. Text, CSV, Json etc
MLlib: algorithms
spark streaming: deals with realtime such as comes from Kafka and static data, data from IOT devices
GraphX: graph Algorithms. To manipulate the graphs. Connected components.

Spark Application: Entry point to every spark application 2 components - Spark Driver and Spark session
Spark Driver: Requests memory, cpu, 
Spark Session:

Cluster manager: Communicates with Executor and Spark Driver and tells driver to submit the task to so and so executor based on availabilitiy
Spark supports 4 cluster managers --> Build In standalone, Kubernetes, Hadoop, maceos, hadoop yarn

Executors: Executor 1, Executor 2.. etc Communicates with Driver and it is responsible for running the job.


scala> sc.range(1,100).collect
res6: Array[Long] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99)

Loading Data Methods:
To pass data through an external file as Key-Value pair or Single object:
scala> sc.sequenceFile("file:///Data/SampleSequenceFile", classOf[Text], classOf[IntWritable])

****Key-Value pair MAP can be achieved with the below one:**** 
String-Int 
scala> sc.sequenceFile[String, Int]("file:///Data/SampleSequenceFile")
res10: org.apache.spark.rdd.RDD[(String, Int)] = MapPartitionsRDD[11] at sequenceFile at <console>:24
scala> .collect

**Single Object File**
scala> sc.objectFile[Int]("file:///Data/SampleObjectFile")
res12: org.apache.spark.rdd.RDD[Int] = MapPartitionsRDD[13] at objectFile at <console>:24
scala> .collect

Method to support any type of data file:
scala> sc.hadoopFile
scala> sc.newApihadoopFile

both method hadoopFile in class SparkContext of type [K, V, F <: org.apache.hadoop.mapred.InputFormat[K,V]](path: String)(implicit km: scala.reflect.ClassTag[K], implicit vm: scala.reflect.ClassTag[V], implicit fm: scala.reflect.ClassTag[F])org.apache.spark.rdd.RDD[(K, V)]
and  method hadoopFile in class SparkContext of type [K, V, F <: org.apache.hadoop.mapred.InputFormat[K,V]](path: String, minPartitions: Int)(implicit km: scala.reflect.ClassTag[K], implicit vm: scala.reflect.ClassTag[V], implicit fm: scala.reflect.ClassTag[F])org.apache.spark.rdd.RDD[(K, V)]

Transformation Methods:
map - collection of collections - multi arrays
flatmap - collection of data in a single array just like flat in a single array

Build & Run the job:
scala> sbt.assembly
// To build the uber jar. Once it is build then run the below command to run the job
scala> spark-submit --class "main.Evaluator" --master "local[*]" "above built jar file path"

Cluster Manager: 3 are there
Hadoop Yarn - yet another resource negotiator
Spark - Standalone cluster (--master spark://[HOST]:7077)
Mesos 







