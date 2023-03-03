package studio.aroundhub.kotlin.operator

class ArithmeticOperator {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val a = 1 + 1
      val b = 4 + 8
      val c = 4 * 2
      val d = 4 / 2
      val e = 3 / 2
      val f = 3.0 / 2
      val g = 1.0 / 3
      val h = 5 % 2

      println("a : $a")
      println("b : $b")
      println("c : $c")
      println("d : $d")
      println("e : $e")
      println("f : $f")
      println("g : $g")
      println("h : $h")
    }
  }
}