package com.ankit.scala.functions.CompanionObject

object CompainonTest {
  def main(args: Array[String]): Unit = {
    val order = new Order(1, "2013-10-01", 100, "COMPLE")

    val order2 = Order.apply(2, "2013-10-01", 100, "COMPLE")
    val order3 = Order(2, "2013-10-01", 100, "COMPLE")

    println(order)
    println(order2)
    println(order3)


    val order4 = Order("22", "2013-10-01", "100", "COMPLE")

    println(order4)
  }
}
