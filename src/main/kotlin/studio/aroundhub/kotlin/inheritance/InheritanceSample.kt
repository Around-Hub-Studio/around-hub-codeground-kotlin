package studio.aroundhub.kotlin.inheritance

import java.time.LocalDate

fun main() {
  val gv70 = MyCar("GV70", 80.50, "Hyundai", LocalDate.now().minusDays(5))
  val gv80 = MyCar("GV80", 100.50, "Hyundai", LocalDate.now())

  gv70.introduce()
  gv70.howMuch()
  gv70.myPurchaseDate()

  println("======")
  gv80.introduce()
  gv80.howMuch()
  gv80.myPurchaseDate()

  println("======")
  gv80.compare(gv70)
}
