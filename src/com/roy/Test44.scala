package com.roy

/**
 * Basic content of class
 * @author Administrator
 */

class TestClass44{
  
  private var value = 100
  
  //setter
  def setValue(a:Int) {
    if(a>0)
    this.value = a
  }
  //getter
  def getValue = {
    this.value
  }
}

object Test44 {
  def main(args: Array[String]): Unit = {
       var c = new TestClass44
       c setValue 1000
       println(c.getValue)
  }
}
