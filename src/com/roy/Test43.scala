package com.roy

/**
 * Associated object
 * @author Roy Ren
 */

class TestObject43{
  def display = {
    TestObject43.value
  }
}


object TestObject43{
  private var value = 200
}

object Test43 {
  def main(args: Array[String]): Unit = {
//    println(TestObject43.value)
    var c = new TestObject43
    println(c.display)
  }
}