fun main(args: Array<String>) {
//  Lambda expression: function literal
    val printMessage = { message: String -> println(message)}

    printMessage("Hello KT")

    val sumA = { x:Int, y:Int -> x +y}
    println(sumA(3,5))

    val sumB : (Int, Int) -> Int = {x,y -> x+y}
    println(sumB(4,2))

    fun downloadData(ulr: String, completion: () -> Unit) {
        // sent a download request
        // we got back data
        // there were no network
        completion()
    }
    // call downloadDataFunction
    downloadData("git.com", {
        println("The code in this block will only run" +
                "after completion")
    })

    fun downloadCarData(url:String, completion: (Car) -> Unit) {
        // send a dowload request
        // got back car data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }
//    downloadCarData("fakeurl.com"){ car ->
//        println(car.color)
//        println(car.make)
//    }

    // in case the lambda has one parameter use 'it'
    downloadCarData("fakeurl.com"){
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        // make web request
        // we get the results back
        val webRequestSuccess = true
        if(webRequestSuccess) {
            // received truck data
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeurl.com") { truck, success ->
        if (success) {
            // do something with truck7
            truck?.tow()
        } else {
            // handle request error
            println("OOPS,,Something went wrong")
        }
    }
}