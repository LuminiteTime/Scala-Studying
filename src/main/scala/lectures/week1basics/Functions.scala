package lectures.week1basics

object Functions extends App{
  def aCondition(): Boolean = true

  def someFunc(x: Int, y: => Int): Int = {
    x * 2
  }
  
  def multiply(value: Int): Int = value * 2
}
