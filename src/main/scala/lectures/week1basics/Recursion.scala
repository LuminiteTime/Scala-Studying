package lectures.week1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorialWithTailRecursion(n: Int): Int = {
    @tailrec
    def loop(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else loop(x - 1, x * accumulator)
    }

    loop(n)
  }

  def repeatWord(word: String, n: Int): String = {
    @tailrec
    def loop(i: Int, acc: String = word): String = {
      if (i <= 1) acc
      else loop(i - 1, s"$word $acc")
    }

    loop(n)
  }

  def powerOfTwo(n: Int): BigInt = {
    @tailrec
    def loop(i: Int, accumulator: BigInt = 1): BigInt = {
      if (i <= 0) accumulator
      else loop(i - 1, accumulator * 2)
    }

    loop(n)
  }

  def fArgs(i: Int): Int = {
    if (i == 0) 0
    else if (i == 1) 1
    else 1
  }

  def increaseNTimes(x: Int, y: Int, n: Int): String = {
    @tailrec
    def loop(i: Int = n, acc: Int = x): Int = {
      if (i <= 0) acc
      else loop(i - 1, acc + y)
    }

    val res: Int = loop()

    def printNTimes(n: Int): String = {
      @tailrec
      def loop1(i: Int = n.toString.length, word: String = n.toString): String = {
        if (i < 2) word
        else loop1(i - 1, s"${n.toString} $word")
      }

      loop1()
    }

    printNTimes(res)
  }

  def reverseLine(line: String = ""): String = {
    val words = line.strip().split(" +").toList

    @tailrec
    def loop(i: Int = 0, res: String = ""): String = {
      if (i >= words.length) res
      else loop(i + 1, s"${words(i)} $res")
    }

    loop()
  }

  println(reverseLine("I like    Scala"))

  //  println(factorialWithTailRecursion(6))
  //  println(repeatWord("hello", 3))
  //  println(powerOfTwo(50))
  //  println(s"${increaseNTimes(fArgs(0), fArgs(1), fArgs(2))} is the result")
}
