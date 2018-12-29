fun main(args: Array<String>) {
    val force = "May the force be with you"
    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far away. . .
        |BuMMM, BUMM, BUMMMMMMM
    """.trimMargin()

    /*for(char in force){
        println(char)
    }*/
    println(force)
    println(rawCrawl)

    //check if we have same string as force -> return true or false
    val contentsEquals = force.contentEquals("May the force be wiht")
    println(contentsEquals)

    //check if it contains what we need or want -> we ignore it if is false
    val contains = force.contains("Be", false)
    println(contains)

    val upper = force.toUpperCase()
    val lower = force.toLowerCase()

    println(upper)
    println(lower)

    println(force.length)

    val subsequense = force.subSequence(4,14)
    println(subsequense)

    
}