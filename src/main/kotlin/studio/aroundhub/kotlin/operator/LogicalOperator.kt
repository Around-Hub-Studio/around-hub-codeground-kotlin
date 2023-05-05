package studio.aroundhub.kotlin.operator

import kotlin.random.Random

class LogicalOperator {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val a = Random.nextInt(10)
      val b = Random.nextInt(10)
      val c = Random.nextInt(10)
      val d = Random.nextInt(10)

      println("a : $a, b : $b, c : $c, d : $d")

      println(a > b && c > d)
      println(a > b || c > d)
      println(!(a > b))
    }
  }
}
