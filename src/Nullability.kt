fun main(args: Array<String>) {

    var name: String = "MartinN"
//    name = null

    var nullableName: String? = "Do I really exist?"
    nullableName = null
    println(nullableName)

    // Null check
    var length = 0
    if(nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }

    println(length)

    // non verbose
    val l = if(nullableName != null) nullableName.length else -1

    // second method: safe call operator ? (optional chaining in JS)

    println(nullableName?.length)


    // Third method: Elvis operator
    val len = nullableName?.length ?: -1
    println(len)

    val noName = nullableName ?: "No one knows me..."
    println(noName)

    // !! - null pointer exceptions
//    println(nullableName!!.length)    // use if you are sure the variable is not null
}