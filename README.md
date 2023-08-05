"# rohini-data-acn" 
http://cpx-vtky2f8anjo.dir.svc.accenture.com:4040/executors/

Spark - Standalone cluster (--master spark://[HOST]:7077)

::::::::::::::::::::::::::::::::::::::::::::::::::NOTES::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
sc - spark context
spark-shell
spark-
SPARK	Open SourceUnified Anlytics Engine		
	Built on top of Apache Hadoop for large scale data processing		
	Single platform to both batch and streaming data		
	It has all features of Hadoop and abstracts for the challenges of Hadoop		
	such as processing huge data both visual and unformatted data in memory ( can store input, in-process data and result)		
	Spark is meant to run on a cluster of machines		
	Hadoop YARN - Yet Another Resource Negotiator		
SPARK FRAMEWORK			
CLUSTER			
	Processing of data at  scale and parallel requires a cluster of machines		
	NODES		
		Capacity can be expanded or reduced by adding or removing cluster nodes	
STORAGE			
	Spark is not constrained by the dependency of hadoop		
	Spark supports the storage systems include Apache Cassandra, S3 and Kudu		
	Spark also supports local file system during development & testing phase		
CLUSTER MANAGER			
	Spark Standalone		
		It is used for development and testing but not for production parameters	
	Hadoop YARN	 	 
		It is used for adding or removing resources with production parameters	
	Apache Mesos		
	Kubernetes		
		These two can be used to orchestrate your spark executions	
SPARK CORE			
		Think as a library which contains distributed task dispatching, basic I/O and data structures inorder to store and manipute data	
	RDD	Resilient Distributed Data Set	
		Core operations revolve around RDD	
		RDD are distributed data structures that can be operated on in parallel	
	SHELL		
			
	APIs		
			
	DRIVER		
			
Platforms That Sit on Top of SPARK CORE			
	SPARK SQL		
	SPARK STREAMING		
	MLlib		
	GraphX		
			
SPARK SQL			
	Includes Data Frames abstraction which supports for semi structured data		
	Enables transformation on data using SQL or SQL like operations		
	Data Frames API is available in Java, Python, Scala, R		
	DATA FRAMES		
		It provides single interface to work with data from several data sources (json, parquet, avro etc)	
Running Spark Application			
	It creates a Driver program with Spark Session		
	Driver program is  by Cluster Master node and responsible for generating tasks.		
	Resources are allocated by Cluster Manager		
	Resources are on the worker nodes. It commnicates wth driver program and spark session		
DRIVER PROGRAM			
	holds whole declaration of all data processing tasks defined in the application		
	Runs on a separate JVM in the spark master node		
			
Services Hosted by Driver			
	DAG Scheduler		
	TASK Scheduler		
	SPARK UI		
			
			
DAG Scheduler			
	Directed A--- Graph		
	The work flow of transformations which needs to be applied on the data		
TASK Scheduler			
	manages individual tasks in transformation		
SPARK UI			
	to keep track of different nodes in the cluster and jobs and applications that running on it		
SERIALIZER			
	To simplifies the communication of objects between various components		
			
SPARK SESSION			
	Created by Spark Application and hosted by Driver Program		
	All spark functionality is accessed through Spark Session		
	Encapsulates SparkContext, HiveContext, SQL Context		
			
Data Processing Tasks			
	1. Defining Transformations		
	2. Creating Execution Stages		
	3. Stages Split into Individual Tasks		
			
STRUCTURED STREAMING			
	To process the streaming data		
	Stream procesing engine built on Spark SQL		
	DataFrame API for stream processing		
	Continuous processing rather than micro batch processing		
	Allows operations based on event time		
	Integrates with event streaming platform such as Kafka		
			
OUTPUT MODES			
	APPEND		
	COMPLETE		
	UPDATE	Transformations are applied on newly modified rows	
			
Supported Streaming Operations			
	Select and Where clauses		
	Aggregation 		
	Window operations on event time as well as time column in data		
	Joins between different Streaming Data Formats		
Unsupported Streaming Operations			
	Aggregations on multiple streaming data 		
	Limit and top N		
	Certain Outer joins		
						
To unpack the zip file from cmd line			
	  --tar -xvzf sparkdownloadfile		
	start-worker.sh spark://Lonycorns-Air.Dlink:7077		
	stop-worker.sh spark://		
	stop-master.sh		
			
To create Config file			
	cp spark-env.sh.template  spark-env.sh		
		Copy the tempate file and reanme 	
	nano spark-env.sh		
		Open the file with nano editor				
			
	spark-submit  --help		
		Used to launch spark applications in a spark cluster	


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

DATA STREAMING:
INGESTION 
PROCESSING AND REACTION: REAL TIME (MILLISECONDS) , NEARLY REAL TIME (SECONDS), BATCH(MINUTES, HOURS, DAYS)
**Apache Kafka**
Apache Kafka is an open-source streaming system.
Kafka is used for building real-time streaming data pipelines that reliably get data between many independent systems or applications.
Kafka uses Zookeeper to store metadata about brokers, topics and partitions.
Kafka Topics
The core abstraction Kafka provides for a stream of records — is the topic.
Each record in a topic consists of a key, a value, and a timestamp.
A topic can have zero, one, or many consumers that subscribe to the data written to it.
The Kafka cluster durably persists all published records using a configurable retention period — no matter if those records have been consumed or not.

Partitions
Each partition in a topic is an ordered, immutable sequence of records that is continually appended to a structured commit log.\\

Each partition has one broker which acts as the “leader” that handles all read and write requests for the partition, and zero or more brokers which act as “followers” that passively replicate the leader. Each broker acts as a leader for some of its partitions and a follower for others so load is well balanced within the cluster.
Kafka Producers and Consumers
Producers publish data to the topics of their choice.
Consumers can subscribe to topics and receive messages. Consumers can act as independent consumers or be a part of some consumer group

Start Kafka environment:
-----Start ZooKeeper services---
%KAFKA_HOME%/bin/windows/kafka-server-start.bat %KAFKA_HOME%/config/server.properties
----Start Kafka server-----
%KAFKA_HOME%/bin/windows/kafka-server-start.bat %KAFKA_HOME%/config/server.properties
-----verify by running jps command----
----Create a Kafka topic-------
%KAFKA_HOME%/bin/windows/kafka-topics.bat --create --topic kontext-events --bootstrap-server localhost:9092
Created topic kontext-events.
------Describe Kafka topic-------
%KAFKA_HOME%/bin/windows/kafka-topics.bat --describe --topic kontext-events --bootstrap-server localhost:9092
Topic: kontext-events   TopicId: CAT_sYTqQpOLc9cXcuLEQw PartitionCount: 1       ReplicationFactor: 1    Configs:
        Topic: kontext-events   Partition: 0    Leader: 0       Replicas: 0     Isr: 0
---------Write some events into the topic-----
%KAFKA_HOME%/bin/windows/kafka-console-producer.bat --topic kontext-events --bootstrap-server localhost:9092
>This is first event
>This is second event
>This is third event
>This is fourth event
>this is fifth event
>thisi is sixth
>seventh event
>eighth
>Terminate batch job (Y/N)? y
---Press Ctrl + C to terminate this Console producer client. ---
------------------Read the events in the topic-----
%KAFKA_HOME%/bin/windows/kafka-console-consumer.bat --topic kontext-events --from-beginning --bootstrap-server localhost:9092
This is first event
This is second event
This is third event
This is fourth event
this is fifth event
thisi is sixth
seventh event
eighth
---Press Ctrl + C to terminate this Console producer client. ---
-------------------------Shutdown Kafka services-------------------------
%KAFKA_HOME%/bin/windows/kafka-server-stop.bat %KAFKA_HOME%/config/server.properties
%KAFKA_HOME%/bin/windows/zookeeper-server-stop.bat %KAFKA_HOME%/config/zookeeper.properties

---SparkSession.readStream---
To read from Kafka for streaming queries






