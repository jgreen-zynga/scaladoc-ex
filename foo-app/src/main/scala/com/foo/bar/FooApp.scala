package com.foo.bar

/**
  * Created by jgreen on 10/16/16.
  */
object FooApp extends App {

  /**
    * Some method
    * @return A [[com.foo.bar.Bar]]
    */
  def bar = new Bar()

  def int : Int = 0

  println("Hello World")
}

class WTF extends Bar {

}