package com.roy

/**
 * @author Roy Ren
 */
object Test11 {
  def main(args: Array[String]): Unit = {
    //    println("hello world!")

//    add1(1,2)
    //First way to call function
        var c = add2(1,3)
        println(c)

    //Second way to call function
//    var c = add2(b = 1, a = 3)
//    println(c)
  }
  /*
   * Function definition
   * no return value
   */
  def add1(a: Int, b: Int) {
    println(a + b)
  }

  /*
   * Have return value：
   * 1. There must be = between () and {}
   * 2. Last row is return value
   *
   */
  def add2(a: Int, b: Int) = {
    a + b
  }

  def add3(a: Int, b: Int) = {
    "a=" + a + " b=" + b
  }

}