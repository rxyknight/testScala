package com.roy

/**
 * Primary constructor
 * @author Roy Ren
 */
//In scala, classes and methods are intertwined
class TestClass51(val name:String = "" ,val age:Int = 0){  
  
  println("name="+ name + " age=" + age)
  
}

object Test51 {
  def main(args: Array[String]): Unit = {
    val c = new TestClass51(age = 18)
  }
}