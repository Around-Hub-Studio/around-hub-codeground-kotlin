package studio.aroundhub.kotlin.operator

class AssignmentOperator {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      var a = 5
      println(a)
      a += 5
      println(a)
      a *= 2
      println(a)
      a /= 2
      println(a)
      a %= 3
      println(a)
    }
  }
}