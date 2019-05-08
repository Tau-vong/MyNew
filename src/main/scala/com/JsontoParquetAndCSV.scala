package com

import org.apache.spark.sql.SparkSession

object JsontoParquetAndCSV {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder
      .appName("jsontoParquet")
      .master("local[*]")
      .config(" spark.default.parallelism",1)
      .getOrCreate()
    val df = spark
      .read
      .format("json")
      .load("/Users/tao.wang/IdeaProjects/MyNew/src/main/resources/1.json")
//    df.write.format("parquet").save("/Users/tao.wang/IdeaProjects/MyNew/src/main/resources/tmp/")
    df.write.format("csv").option("delimiter","^")
      .save("/Users/tao.wang/IdeaProjects/MyNew/src/main/resources/tmp0/")
    df.printSchema()
    df.show()
    spark.stop()
  }

}
