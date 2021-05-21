// all classes are final by default - cannot be inherited from
open class Vehicle(val make:String, val model: String) {
    open fun accelerate() {
        println("Vroom Vroom")
    }
    fun park() {
        println("Parking the vehicle")
    }
    fun brake() {
        println("STOP")
    }

}

class Car(make:String, model:String, var color: String) : Vehicle(make, model){
    // override: set method as open before overriding
    override fun accelerate() {
        println("Ludacris mode !!")
    }

}

class Truck(make:String, model: String, val towingCapacity: Int) : Vehicle(make, model){

}

fun main(args: Array<String>) {
    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 10000)

}