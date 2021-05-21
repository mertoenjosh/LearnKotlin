fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiah", "Han Solo", "Mon Mothma")

    val rebelVehicles = hashMapOf("Solo" to "Milleneum Falcon", "Luke" to "Land Speeder", "Bobba Fett" to "Rocket Pack")
//  FOR ...IN  loop

    // looping through an array
    for (rebel in rebels) {
        println("Name: $rebel")
    }

    // looping through a hashMap
    for ((key, value) in rebelVehicles) {
        println("$key gets around in his $value")
    }

//  WHILE LOOP
    var x = 10

    while(x > 0) {
        println(x)
        x--
    }

}