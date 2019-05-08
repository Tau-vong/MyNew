package com

import org.apache.spark.{SparkConf, SparkContext}

object CountGroupByCityWithRdd {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("countGroupByCityWithRdd")
      .setMaster("local[*]")
    val sc = new SparkContext(conf)
    val d = sc.textFile("/Users/tao.wang/IdeaProjects/MyNew/src/main/resources/tmp0/")
    d.map(d=>d.split("\\^",-1))
      .filter(arr=>arr.length>=45)
      .filter(arr=>arr(6)!="")
      .map(arr=>((arr(30),arr(6)),1))
      .reduceByKey(_ + _)
      .sortBy(_._2,false)
      .collect()
      .foreach(println)
//    d.map(d=>d.split("\\^",-1))
//      .filter(arr=>arr.length>=45)
//      .filter(arr=>arr(6)!="")
//      .map(arr=>((arr(30),arr(6)),1))
//      .reduceByKey(_ + _)
//      .sortByKey(false)
//      .collect()
//      .foreach(println)

    sc.stop()

  }

}
