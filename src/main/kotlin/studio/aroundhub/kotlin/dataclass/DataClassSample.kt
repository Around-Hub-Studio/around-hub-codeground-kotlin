package studio.aroundhub.kotlin.dataclass

data class DataClassSample(val name: String, val age: Int)
class NoDataClassSample(val name: String, val age: Int)

fun main() {
  val data1 = NoDataClassSample(name = "flature", age = 10)
  val data2 = NoDataClassSample(name = "flature", age = 10)

  println(data1.hashCode())
  println(data2.hashCode())

  println(data1 == data2) // false
  println(data1.toString())

  val data3 = DataClassSample(name = "flature", age = 10)
  val data4 = DataClassSample(name = "flature", age = 10)

  println(data3.hashCode())
  println(data4.hashCode())

  println(data3 == data4) // true
  println(data3.toString())
  println("name is ${data3.component1()}")
  println("age is ${data3.component2()}")

  val (name, age) = data3
  println(name)
  println(age)

  val data5 = data3.copy()
  val data6 = data3.copy(name = "around hub studio")

  println(data3==data5)
  println(data5==data6)
  println(data5)
  println(data6)
}
