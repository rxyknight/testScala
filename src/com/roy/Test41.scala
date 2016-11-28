package com.roy

/**
 * Class and Object
 */

class TestClass41{
  var value = 100
  
}

object TestObject41{
  //The instantiation of a class in java is called an object
  //Scales in the use of object object that a separate type
  //Provide similar static fields and static methods, scala does not have static fields and static methods
  var value = 200
}

object Test41 {
  def main(args: Array[String]): Unit = {

		  println(TestObject41.value)

    var c = new TestClass41
    println(c.value)
  }
}