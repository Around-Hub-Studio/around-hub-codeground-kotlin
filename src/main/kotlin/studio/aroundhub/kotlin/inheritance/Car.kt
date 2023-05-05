package studio.aroundhub.kotlin.inheritance

open class Car(val name: String, val price: Double, val brand: String) {
  fun introduce() {
    println("this car is $name. this is made by $brand.")
  }

  fun howMuch() {
    println("this car is $price dollars")
  }

  open fun myPurchaseDate() {
    println("you don't buy yet")
  }

  open fun compare(otherCar: Car) {
    println("### comparison between ${this.name} and ${otherCar.name} ###")

    println("### Price ###")
    if (this.price > otherCar.price) {
      println("${this.name} is more expensive than ${otherCar.name}")
    } else {
      println("${otherCar.name} is more expensive than ${this.name}")
    }
    println(">>> ${this.name} is ${this.price} dollars")
    println(">>> ${otherCar.name} is ${otherCar.price} dollars")

    println("### Brand ###")
    if (this.brand == otherCar.brand) {
      println("both of ${this.name} and ${otherCar.name} are same brand '${this.brand}'")
    } else {
      println(">>> ${this.name} is made by ${this.brand}")
      println(">>> ${otherCar.name} is made by ${otherCar.brand}")
    }
  }
}
