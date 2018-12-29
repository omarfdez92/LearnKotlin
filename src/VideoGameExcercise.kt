open class Player(var name: String, var age: String, var gender: String){
    open fun attack(){
        println("Hit, Hit, Kick, Kick, Combo Breaker!!!!")
    }

    open fun defent(){
        println("X protection!!!... Ruuuuuuuuuuun!")
    }

    open fun walk(){
        println("Step step walking around")
    }
}

class Warrior(name: String, age: String, gender: String, var weapon: String) : Player(name, age, gender){
    override fun attack() {
        super.attack()
        println("Warrior wins!!! Fatality!!!")
    }

    override fun defent() {
        super.defent()
        println("I have to cover myself, and step back")
    }

    override fun walk() {
        println("Lets find some elf's to kill!")
    }
}

class Villian(name: String, age: String, gender: String,var army:String) : Player(name, age, gender){
    override fun attack() {
        println("You will die today! Kick, magic trick Hit Combo x6")
    }

    override fun defent() {
        println("Damn elf's keep blocking him while i run away!!!")
    }

    override fun walk() {
        println("(step step...) Oh look, there is kratos!")
    }
}

fun main(args: Array<String>) {

    val hero = Warrior("Kratos", "26", "Male", "Death Souls Sword")
    val badGuy = Villian("Baldur","28","Male","Elf's army")

    println("Hello, my name is ${hero.name}, i am ${hero.age} years old ")
    println("Hi there bastard, my name is ${badGuy.name} and im ${badGuy.age} years old ")
    hero.walk()
    badGuy.walk()
    println("There is ${badGuy.name} i will kill him once for all")
    println("${hero.name} finallly we are going to end this!!!")
    println("Behold my ${hero.weapon}")
    println("HAHAHAHa my ${badGuy.army} will destroy you!!!")
    hero.attack()
    println("// All elfs have died //")
    println("${badGuy.name} this will be your end")
    badGuy.defent()
    println("HAHAHAHa you will die!!! ${badGuy.attack()}")
    hero.defent()
    hero.attack()
    println("Daaaaaaaaaaaaaaaamnnnnnnn i loooosssseeeee!!!!")
    hero.attack()

}