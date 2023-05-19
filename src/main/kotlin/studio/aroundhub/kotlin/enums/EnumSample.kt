package studio.aroundhub.kotlin.enums

enum class Color(val label: String, val code: String) {
  RED("red", "#FE2E2E"),
  YELLOW("yellow", "#F7FE2E"),
  GREEN("green", "#40FF00"),
  BLUE("blue", "#0000FF");
}

enum class HttpStatus(val label: String, val code: Int) {
  REDIRECT("redirect", 300) {
    override fun isServerError(): Boolean {
      return false
    }
  },
  BAD_REQUEST("bad request", 400) {
    override fun isServerError(): Boolean {
      return false
    }
  },
  INTERNAL_ERROR("internal error", 500) {
    override fun isServerError(): Boolean {
      return true
    }
  };

  abstract fun isServerError(): Boolean
}

enum class HttpStatus2(val label: String, val code: Int) : CheckStatus {
  REDIRECT("redirect", 300) {
    override fun isServerError(): Boolean {
      return false
    }
  },
  BAD_REQUEST("bad request", 400) {
    override fun isServerError(): Boolean {
      return false
    }
  },
  INTERNAL_ERROR("internal error", 500) {
    override fun isServerError(): Boolean {
      return true
    }
  };
}

interface CheckStatus {
  fun isServerError(): Boolean
}

fun main() {
  val red = Color.RED
  println(red)
  println(red.label)
  println(red.code)

  println()

  println("[[ color code list ]]")
  for (temp in Color.values()) {
    println("${temp.label} is ${temp.code}")
  }

  println()

  println(HttpStatus.BAD_REQUEST)
  println(HttpStatus.BAD_REQUEST.label)
  println(HttpStatus.BAD_REQUEST.code)

  println()

  println(HttpStatus.BAD_REQUEST.isServerError())
  println(HttpStatus.INTERNAL_ERROR.isServerError())

  println(HttpStatus2.BAD_REQUEST.isServerError())
  println(HttpStatus2.INTERNAL_ERROR.isServerError())

}
