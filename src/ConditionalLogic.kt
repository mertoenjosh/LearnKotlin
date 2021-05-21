fun main(args: Array<String>) {
    val a = 2
    val b = 5

    if (a == b) {
        println("A equals B")
    } else {
        println("A not equal B")
    }

    val temp = 30
    if (temp < 10) {
        println("Mahn am freezing")
    } else if (temp >= 10 && temp < 30) {
        println("The weather is good today")
    } else {
        println("I think its hot today")
    }

    val isHungry = false
    val isBored = true

    if(isHungry || isBored) {
        println("Lets get Pizza")
    }

//      WHEN STATEMENT (switch in JS)
    val x = 1

    when (x) {
        1 -> println("X = 1")
        2 -> println("X = 2")
        else -> println("X is not 1 or 2")
    }

    fun vaderIsFeeling(mood: String = "angry"){
        if (mood == "angry") {
            println("Run for the hills, Vader is $mood")
        } else {
            println("Whatever you do don't make him angry")
        }
    }
    vaderIsFeeling()
    vaderIsFeeling("happy")
}

