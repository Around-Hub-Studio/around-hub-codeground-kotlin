package studio.aroundhub.kotlin.condition

import kotlin.random.Random

class IfSample {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val a = Random.nextInt(10)
      val b = Random.nextInt(10)
      println("a는 $a")
      println("b는 $b")

      if (a > b) println("${a}는 ${b}보다 큽니다.")

      if (a < b) println("${b}는 ${a}보다 큽니다.")
      else println("${b}는 ${a}보다 크지 않습니다.")

      if (a < b) println("${b}는 ${a}보다 큽니다.")
      else if (a == b) println("${b}는 ${a}와 같습니다.")
      else println("${b}는 ${a}보다 크지 않습니다.")

      if (a in 1..5) println("${a}는 1~5 사이입니다.")

      val max = if (a < b) {
        println("max is $b")
        b
      } else {
        println("max is $a")
        a
      }
      println(max)
    }
  }
}