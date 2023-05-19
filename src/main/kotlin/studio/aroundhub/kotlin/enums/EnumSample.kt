package studio.aroundhub.kotlin.enums

enum class Color(val label: String, val code: String) {
  RED("red", "#FE2E2E"),
  YELLOW("yellow", "#F7FE2E"),
  GREEN("green", "#40FF00"),
  BLUE("blue", "#0000FF");
}

fun main() {
  val red = Color.RED
  println(red)
  println(red.label)
  println(red.code)

  println("[[ color code list ]]")
  for(temp in Color.values()){
    println("${temp.label} is ${temp.code}")
  }
}
