package studio.aroundhub.kotlin.variable

class VariableSample {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val name : String = "Flature"
      val org = "Around Hub Studio"
      var age = 12
      // org = "ThinkGround"
      age = 15

      println("my name is $name")
      println("my organization is $org")
      println("my age is $age")
    }
  }
}