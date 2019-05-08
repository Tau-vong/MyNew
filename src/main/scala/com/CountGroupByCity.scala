package com

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}


object CountGroupByCity {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder
      .appName("countGroupByCity")
      .master("local[*]")
      .getOrCreate()
    val df = spark
      .read
      .format("parquet")
      .load("/Users/tao.wang/IdeaProjects/MyNew/src/main/resources/tmp/")
    df.createTempView("A")
    import spark.sql
    sql("select * from (select province,city,count(*) as cn from A group by province," +
      "city having city is not null) x order by x.cn desc").show(1000)

//    sql("select * from A where shoulv_userid = '37266'").show(false)

    spark.stop()


  }
}
