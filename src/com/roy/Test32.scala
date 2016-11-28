package com.roy

/**
 * map
 * @author Roy Ren
 */
object Test32 {
  def main(args: Array[String]): Unit = {
    //(zhangsan,15000)Key-value
    var map1 = Map[String,Int]("zhangsan"->15000,"lisi"->16000,"wangwu"->9000)
    var map2 = Map[String,Int](("zhangsan",15000),("lisi"->16000),"wangwu"->9000)
//    for(i <- map2){
//      println(i)
//    }
/*    if(map1.contains("zhaoliu"))
    println(map1("zhaoliu"))
    println(map1.getOrElse("zhangsan", "none"))
*/    
    
//    for(i <- map2.keys){
//      println(map2(i))
//    }
//    for((k,v) <- map2){
//      println(k + "-->" + v)
//    }
    
    //k,v exchange
    var map3 = for((k,v) <- map2)yield((v,k))
//    println(map3)
    
    map1 += ("zhangsan"->16000)
//    println(map1)
    
    var map4 = scala.collection.mutable.Map[String,Int]("zhangsanfeng" ->15000,"zhangwuji" -> 6000)
    map4("zhangsanfeng") = 19000
    map4 -= ("zhangsanfeng")
//    map4.remove("zhangsan")
    println(map4)
    
  }
}