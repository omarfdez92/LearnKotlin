fun main(args: Array<String>) {
    var nullableName: String? = "Do i really exist?"
    //nullableName = null

    val l = if( nullableName != null ) nullableName.length else -1

    //Second method Safe Operator ?
    println( nullableName?.length )

    //Third method Elvis Operator

    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me. . ."

    println(noName)

    // !!
    println(nullableName!!.length) //crashes the app it ges for a nullable exception only use this when 100% that a value is there
}