fun main(args: Array<String>) {
     fun bestDarthVaderLine(){
         println("You failed me for the last time... Admiral!")
     }
    bestDarthVaderLine()

    fun helpVader(line: String){
        println(line)
    }

    helpVader("I AM... YOUR FATHER")

    fun killByDarthVader(rebels: Int, ewoks: Int): Int{
        val totalKilled = rebels + ewoks
        return totalKilled
    }

    println("Darth vader killed ${killByDarthVader(10,25)} Rebels ")
}