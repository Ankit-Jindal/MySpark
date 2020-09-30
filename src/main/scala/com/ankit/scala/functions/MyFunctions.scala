package com.ankit.scala.functions

object MyFunctions {
  def main(args: Array[String]): Unit = {

    println(sum( x => x*x, 1,2))
    println(sum( square, 1,2))
  }

  def sum(func: Int => Int, lb:Int, ub:Int) : Int = {
    var result = 0;
    for(i <- (lb to ub)){
      result += func(i)
    }
    result
  }

  def square(x :Int) = x*x
}
