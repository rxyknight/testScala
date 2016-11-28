package com.roy

/**
 * Secondary constructor
 * @author Roy Ren
 */

class TestClass52(){  
  var name:String = "" 
  var age:Int = 0
  
  def this(name:String){
    this()
    this.name = name
  }
  
  def this(name:String , age:Int){
    this(name)
    this.age = age
  }
//  println("name="+ name + " age=" + age)
  
}

object Test52 {
  def main(args: Array[String]): Unit = {
    val c = new TestClass52("zhangsan",20)
    println(c.name)
    println(c.age)
  }
}