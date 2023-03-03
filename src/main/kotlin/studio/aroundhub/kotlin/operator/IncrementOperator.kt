package studio.aroundhub.kotlin.operator

class IncrementOperator {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      var a = 5
      val b = a++
      val c = a
      val d = ++a
      println(a)
      println(b)
      println(c)
      println(d)
      println()

      var e = 5
      println(e)
      println(e++)
      println(++e)
      println(e)
      println(e--)
      println(--e)
    }
  }
}