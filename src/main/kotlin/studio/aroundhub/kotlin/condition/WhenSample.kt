package studio.aroundhub.kotlin.condition

import kotlin.random.Random

class WhenSample {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val a = Random.nextInt(10)
      val b = Random.nextInt(10)

      when (a) {
        1, 2 -> println("a == 1 or 2")
        3 -> println("a == 3")
        4 -> println("a == 4")
        5 -> println("a == 5")
        in 6..8 -> println("6 <= a <= 8")
        else -> println("else! a == $a")
      }

      when {
        a > b -> println("a > b")
        else -> println("a <= b")
      }
    }
  }
}