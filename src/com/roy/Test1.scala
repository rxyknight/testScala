package com.roy

/**
 * @author Roy Ren
 */
object Test1 {
  def main(args: Array[String]): Unit = {
    def kankan(i:Int) = if(true) println("111") else i
    def kankan1(i:Int =>Int) = if(true) println("222") else i

    kankan(1/0)
    
  }
}