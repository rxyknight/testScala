package com.roy

import scala.collection.mutable.ArrayBuffer
import java.util.ArrayList

/**
 * Array
 * @author Roy Ren
 */
object Test31 {
  def main(args: Array[String]) = {
    //define
    var arr1 = new Array[Int](3)
//    for(i <- arr1){
//      println(i)
//    }
    
    //another way of definition
    var arr2 = Array(1,2,3,4,5,6,"HAHA")
//    for(i <- arr2){
//      println(i)
//    }
    
    var arr3 = Array(1,2,3,4,5,6)
//    println(arr3.min)
//    println(arr3.max)
//    println(arr3.sum)
//    println(arr2.mkString(","))  //Arrays.toString(arr)
//    println(arr2.mkString("[",",","]"))  //Arrays.toString(arr)
    
    var arr4 = Array(1,2,3,4,5,6)
//    for(i <- 0 to arr4.length - 1){
//      println(arr4(i))
//    }
    
    //generate new array by using for
    var arr5 = for(i <- arr4) yield i + 1
//    println(arr5.mkString(","))
    
    var arr6 = Array("dbd","sdfs","yeres","bc")
//    println(arr6.min)
//    println(arr6.max)
    
    var arr7 = Array(1,5,8,2,4)
    var arr8 = arr7.sorted  //排序  升序
    var arr9 = arr6.sorted  //排序  升序  按照字典排序
//    println(arr9.mkString(","))
    
    /*an array that can be changed*/
    var arr10 = ArrayBuffer(1,2,3,4,5)
    arr10 += 9
    var arr11 = arr7.toBuffer
    arr11 ++= arr10
    
//    println(arr11.mkString(","))
    
    /*Using java API*/
    var list = new ArrayList[Int](3)
    list.add(100)
    list.add(101)
    list.add(102)
    for(i <- 0 until list.size()){
      println(list.get(i))
    }
  }
}