//class Car constructor(make: String, model: String) {
//    val make = make
//    val model = model
//}

// simplified version: if constructor has no private modifiers
class Car1(val make: String, val model: String, var color: String) {

    fun accelerate() {
        println("Vroom Vroom")
    }

    fun details() {
        println("This is $color $make $model")
    }
}

class Truck1(val make: String, val model: String, val towingCapacity: Int) {
    fun tow() {
        println("Taking the horses to the rodeo")
    }

    fun details() {
        println("The $make $model has a towing capacity of $towingCapacity lbs")
    }
}


fun main(args: Array<String>) {
//    var car = CarDemo("Toyota", "Hillux")
//    println(car.make)

    val car = Car1("Toyota", "Avalon", "red")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.details()

    val truck = Truck1("Ford", "F-150", 1000)
    truck.tow()
    truck.details()
}