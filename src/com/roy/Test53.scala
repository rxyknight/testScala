package com.roy

/**
 * Higher-order function
 * @author Roy Ren
 */
object Test53 {
  def main(args: Array[String]): Unit = {
    //In scala, function is significant
    def add(a:Int , b:Int) = {
      a + b
    }
    val c = add(3,2)
//    println(c)

    // The request passes an implementation of the function to another function
    // Application scenario: assign a function to another alias; transfer the implementation of the function to another function
    def func1 = add _  //Refers to the implementation of a function passed to another function instead of forgetting to pass the function parameters
//    println(func1(1,3))
    
    def func2 = (x:Int) => {x + 2}  //Anonymous function
//    println(func2(100))
    
    //Define a function that receives a function
    def func3(f:(Int) => Int) = {
      f(100) * 2
    }
    def func4(a:Int) = {
      a + 1
    }
//    println(func3(func4 _))    //Passes an existing function to func3
//    println(func3((x:Int) => x + 10))  //Pass an anonymous function to func3
//    println(func3((x) => x + 10))  //short form 1
//    println(func3( x => x + 10 ))  //short form 2
//    println(func3(_ + 10))  //short form 1

    // The condition for shorthand
    // 1. Anonymous functions as arguments
    // 2. There is only one line of code
    
    def func5(f:(Int,Int) => Int) = {
      f(2,3)
    }
/*    println(func5((x:Int,y:Int) => x + y))
    println(func5((x,y) => x + y)) //short 1
    println(func5(_ + _)) //short 2
*/
    // Summary "_" can represent the meaning
    // 1, which is used to fetch the tuple value
    // 2, representing a placeholder
    // 3, referring to the implementation of a function passed to another function instead of forgetting to pass the function parameters
    // 4, representing every element that qualifies
    
    /*Common Higher-order function*/
    var d = (1 to 10).filter( _ % 2 == 1).map(_ * 3)
    var e = (1 to 10).filterNot( _ % 2 == 1)
    var f = (1 to 10).reduceLeft(_ + _)  //1+2 3+3 6+4 
//    println(f)
//    (1 to 10).map("*" * _).foreach(println _)
    
    //Practice
    def func6(x:Int) = {
      (x:Int) => {
        x + 2
      } * 2
    }
//    println(func6(1))
    println(func6(1)(2))  //Principle of proximity
  }
}