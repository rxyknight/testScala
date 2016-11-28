package com.roy

/**
 * Inheritance - Abstract class
 * @author Roy Ren
 */
abstract class person{
  var name:String
  val age:Int
  def show:Int
}

class student extends person {
  //In scala, when you overwrite fields in an abstract class, override can be ignored
  var name:String = "zhangsan"  //An abstract field defined using var can only be overridden with var
  val age:Int = 18  //Use val to define abstract fields that can only be overridden with val
  def show:Int = 100  //Defined using def can be overridden using val or def
}

object Test61 {
  def main(args: Array[String]): Unit = {
    // 1, abstract class does not necessarily have abstract field, only need to add abstract keyword
    // 2, abstract field must be abstract class
    // 3, rewrite the field is the essence of the rewrite field setter, getter method
    var c = new student
    println(c.show)
  }
}