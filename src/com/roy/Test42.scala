package com.roy


import scala.beans.BeanProperty

/**
 * Content of a class
 */

class TestClass42{
//  @BeanProperty var value = 100
	private[this] var value = 100
  
}

object Test42 {
  def main(args: Array[String]): Unit = {

    var c = new TestClass42
//    c.value_=(200)      //setValue() method
//    println(c.value)   //getValue() method
    
    //getter and setter
//    c.setValue(1000)
//    println(c.getValue())
    
  }
}