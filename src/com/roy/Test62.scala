package com.roy

/**
 * Inheritance - Construction order
 * @author Roy Ren
 */
class person1{
  val name:String = "lisi"
  val age:Int = 10 
  lazy val interest:Array[Int] = new Array[Int](age)
  println("person1 class")
}

class student1 extends person1{
  override val age:Int = 20
  println("student1 class")
}


object Test62 {
  def main(args: Array[String]): Unit = {
    val c = new student1
//    println(c.name)   //"lisi"
//    println(c.age)    //20
    println(c.interest.length)

    /* Description */
    // 1, the instance of student1 class, found that student inherited person1
    // 2, the succession of person1 priority call person1 initialization person1 in the field
    // 3, initialized to age found age field to be student1 age rewrite, setter, getter method is empty
    // 4, initialize the interest need to call the age field getter method used to initialize the array, because the getter method is not defined, so the length of 0
    // 5, student1 class initialization, the 20 set into the age field
        
    // Workaround: Add lazy before interest - Causes the field to be initialized at the end of the constructed object
    
  }
  
}