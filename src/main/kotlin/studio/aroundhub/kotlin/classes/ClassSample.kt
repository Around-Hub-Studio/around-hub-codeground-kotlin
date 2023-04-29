package studio.aroundhub.kotlin.classes

fun main() {
  val aMan = Person()
  aMan.sayHello()
  aMan.introduce()

  aMan.age = 55
  println("sorry, my real age is ${aMan.age}")

  println("=========================================")

  val jedi = PersonWithConstructor("jedi", 150)
  val flature = PersonWithConstructor("flature")
  val harry = PersonWithConstructor(name = "harry", age = 25, etc = "추가값")

  flature.sayHello()
  flature.introduce()

  jedi.sayHello()
  jedi.introduce()

  harry.sayHello()
  harry.introduce()
}
