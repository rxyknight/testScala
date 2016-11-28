package com.roy

/**
 * tuple
 * @author Roy Ren
 */
object Test33 {
  def main(args: Array[String]): Unit = {

    var t = (1,2,3,4,5)
    println(t _2)
    
    var (first,second,third,forth,_) = t
//    println(third)
    
//    println("Hello World!".partition(_.isLower))  //_ stand for every char
    
    //Zipper operation
    var arr1 = Array(1,2,3,4,5)
    var arr2 = Array('a','b','c','d')
    var temp = arr2.zip(arr1)
//    println(temp.mkString(","))
    var map = temp.toMap
    println(map)
  }
}