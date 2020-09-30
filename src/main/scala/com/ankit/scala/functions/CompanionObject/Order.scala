package com.ankit.scala.functions.CompanionObject

class Order(var orderId:Int, var orderSatus: String, var orderCustId:Int, var orderStatus:String) {
  println("I am inside order constructor")
  override def toString = "Order("+ orderId +","+orderSatus +","+ orderSatus +","+orderStatus+")"
}
object Order {
  def apply(orderId: Int, orderSatus: String, orderCustId: Int, orderStatus: String): Order = {
      new Order(orderId, orderSatus, orderCustId, orderStatus);
  }

  def apply(orderId: String, orderSatus: String, orderCustId: String, orderStatus: String): Order = {
    new Order(orderId.toInt, orderSatus, orderCustId.toInt, orderStatus);
  }
}