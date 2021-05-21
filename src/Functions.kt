fun main(args: Array<String>) {

    fun forceChoke() {
        println("You have failed me for the last time admiral.")
    }

    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("I find your lack of faith disturbing")

    fun calculateNunGoodGuys(rebles: Int, ewoks: Int):Int {
        val goodGuys = rebles + ewoks
        return goodGuys;
    }
    val goodGuys = calculateNunGoodGuys(20, 15)
    println(goodGuys)

    println("Dath vader faced off against ${calculateNunGoodGuys(23,5)} rebel scum")

}