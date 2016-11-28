package com.roy

/**
 * How to use if condition
 * @author Roy Ren
 * 
 */
object Test21 {
  def main(args: Array[String]): Unit = {
    
//    val resutlt = judge1(-100)
//    println(resutlt)
    
    val resutlt2 = judge2(100)
    println(resutlt2)
  }
  /*
   * there is no xx?xx:xx operator in scala, use if instead
   */
  def judge1(x:Int) = {
    val c = if(x > 0) 1 else "Roy Ren"
    c
  }

  /*
   * Everything must be considered.
   */
  def judge2(x: Int) = {
    if(x>0){
      1
    }else if(x<0){
      -1
    }
      0
  }
  
}