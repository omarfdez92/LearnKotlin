fun main(args: Array<String>) {

    //immutable list
    val imperials = listOf("Darth Vader", "Emperor", "Boba Fett", "Tarkin", "Stormtroppers")

    println(imperials.sorted())
    println(imperials)
    println(imperials.contains("Luke"))
    println(imperials.last())
    println(imperials[2])
    println(imperials.asReversed())

    println("__________________________________________________________________________________")
    //mutable list
    val rebels = arrayListOf("Leia", "Chewbacca", "Lando", "Luke", "Mon Mothma")

    println(rebels.size)
    rebels.add("Han Solo")
    println(rebels)
    rebels.add(1,"C-3PO")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Mon Mothma")
    println(rebels)

    println("__________________________________________________________________________________")
    //maps immutable
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leia", "This ship doesn't exist"))
    println(rebelVehiclesMap.values)


    println("__________________________________________________________________________________")
    //mutable maps
    val rebelsVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Something")
    rebelsVehicles["Luke"] = "XWing"
    rebelsVehicles.put("Leia", "Tantive IV")
    println(rebelsVehicles)
    rebelsVehicles.remove("Boba Fett")
    println(rebelsVehicles)
    rebelsVehicles.isEmpty()
    println(rebelsVehicles)
    rebelsVehicles.clear()
    println(rebelsVehicles)


}