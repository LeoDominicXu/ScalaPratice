package com.xuzc.actor

import scala.actors.Actor

/**
 * Created by Stronger-pc on 2016/7/2.
 */
case class Cat(name:String,age:Int)
class HiActor extends Actor{
  override def act(): Unit = {
    while(true){
      receive{
        case "Hi" => println("Hello")
        case  p:People => println("my name is "+p.Name+",my idcode is "+p.IdCode+",my old is "+p.getAge)
        case Cat(name,age) =>{}
      }
    }
  }
}
