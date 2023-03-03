package studio.aroundhub.kotlin.operator

import kotlin.random.Random

class ComparisonOperator {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val a = Random.nextInt(10)
      val b = Random.nextInt(10)
      println("a : $a")
      println("b : $b")

      println(a > b)
      println(a >= b)
      println(a < b)
      println(a <= b)
      println(a == b)
      println(a != b)
    }
  }
}