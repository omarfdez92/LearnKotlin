/*
fun main(args: Array<String>) {
    //Simple lambda
    val printMessage = { message: String -> println(message) }
    //same but. . . we have benefits using lambda
    fun printMessage( message: String ){
        println(message)
    }
}*/

fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message) }
    printMessage("Hello Kotlin!")
    printMessage("Hello Again")

    val sumA = { x: Int, y: Int -> x + y }
    println( sumA(5, 6) )

    val sumB : (Int, Int) -> Int = { x,y -> x+y }
    println( sumB(6, 8) )

    //(asynchronus)simple dummy download request funtion.... web data
    fun downloadData(url: String, completion: ()-> Unit){
        //sent a download request
        //we got back data
        //there were no networks errors
        completion()
    }

    //call downloadDataFunction
    downloadData("fakeUrl.com", {
        println("The code in this block, will only run" +
            "after the completion()")
    })

    //now with a little more data
    fun downloadCarFunction(url: String, completion: (Car)-> Unit){
        //sent a download request
        //we got back data
        val tesla = Car("Tesla", "ModelS", "Red")
        completion(tesla)
    }

    downloadCarFunction("fakeUrl.com") {
        tesla -> println(tesla.make)
                println(tesla.model)
                println(tesla.color)
    }
    //to get parameters diferently
    downloadCarFunction("fakeUrl.com") {
        println(it.color)
        println(it.make)
    }

    fun downloadTruckFun(url: String, completion: (Truck?, Boolean) -> Unit){
        //sent a download request
        //we got back data
        val webRequestSuccess = false
        if(webRequestSuccess){
            //receive truck data
            val truck = Truck("Ford", "LOBO", 10000)
            completion(truck, true)
        }else{
            completion(null,false)
        }
    }

    downloadTruckFun("fakeUrl.com"){ truck, success ->
        if (success){
            //do something with our truck
            truck?.tow()
        }else{
            //hande the web request failure
            println("Whooooops!!!!! Something went wrong!")
        }
    }
}