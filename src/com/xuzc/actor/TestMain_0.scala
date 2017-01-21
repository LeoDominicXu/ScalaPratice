package com.xuzc.actor

/**
 * Created by Stronger-pc on 2016/7/2.
 */
object TestMain_0 {
  def main(args: Array[String]) {
    val act1 = new HiActor
    act1.start()
    println("消息线程已启动，等待消息中······")
    Thread.sleep(5000)
    println("准备发送消息：Hi")
    act1 ! "Hi"
    val p = new People("001","张三",18)
    act1 ! p
  }
}
