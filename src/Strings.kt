fun main(args: Array<String>) {
    val str = "May the force be with you"
    println(str)

    val str1 = "My dad said 'Leave \"my\" house'..."
    println(str1)

    val str2 = """|I am a
        |Multiline 
        |comment
    """.trimMargin("|")
    println(str2)

//    for ...in loop
    val st = "Martin N Thuo"
    for (char in st) {
        println(char)
    }

//    usefull methods
    val compare = str.contentEquals("May the force be with you")  // check if strings contents are equal
    println(compare)

    val containsStrict = str.contains("FOrce", false)
    println(containsStrict)

    val contains = str.contains("FOrce", true)
    println(contains)

    val lower = str.toLowerCase()
    println(lower)
    val upper = str.toUpperCase()
    println(upper)

//    slice part of a string
    val subString = str.subSequence(4, 13)
    println(subString)

//    template literal

    val man = "Mans Wadder"
    val color = "Black"
    val vehicle="Ninja"

    println("$man rides a $color $vehicle")
    println("$man has ${man.length} characters in it")
}