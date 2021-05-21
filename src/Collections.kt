fun main(args: Array<String>) {

    // immutable list
    val imperials = listOf("Emperor", "Darth Vader", "Bobba Fett", "Tarkin")
    println(imperials)

    println(imperials.sorted())  // sorts the list
    // accessing its elements
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Luke"))

    // mutable array
    val rebels = arrayListOf("Leiah", "Han Solo", "Mon Mothma")

    println(rebels.size)
    rebels.add("Chewbacca") // adds at the end of the list
    println(rebels)
    rebels.add(0, "Lando") // adds at a specified index
    println(rebels)
    println(rebels.indexOf("Leiah"))

    rebels.remove("Han Solo")
    println(rebels)

    // immutable maps
    val rebelVehicleMap = mapOf("Solo" to "Milleneum Falcon", "Luke" to "Land Speeder")

    println(rebelVehicleMap["Solo"])
    println(rebelVehicleMap.get("Solo"))
    println(rebelVehicleMap.getOrDefault("solo", "This ship doesn't exist"))
    println(rebelVehicleMap.keys)
    println(rebelVehicleMap.values)

    // mutable hashmap
    val rebelVehicles = hashMapOf("Solo" to "Milleneum Falcon", "Luke" to "Land Speeder", "Bobba Fett" to "Rocket Pack")

    rebelVehicles["Luke"] = "XWing" // change value of Luke
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Bobba Fett")
    println(rebelVehicles)
    println(rebelVehicles.isEmpty())
    rebelVehicles.clear()
    println(rebelVehicles)

}