fun main(args: Array<String>) {
    val lukeReturns = "I won't fail you, I'm not afraid"

    fun lukeQuote(line: String): String{
        println("The best luke quote is -> $line <- ")
        return line
    }

    lukeQuote(lukeReturns)
}