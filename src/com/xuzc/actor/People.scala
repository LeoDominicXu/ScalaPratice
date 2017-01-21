package com.xuzc.actor

import scala.beans.BeanProperty

/**
 * Created by Stronger-pc on 2016/7/2.
 */
class People {
  @BeanProperty var IdCode:String = ""
  @BeanProperty var Name:String = ""
  @BeanProperty var Age:Int = 0
  def this(IdCode:String, Name:String, Age:Int ){
    this()
    this.IdCode = IdCode
    this.Name = Name
    this.Age = Age
  }
}
