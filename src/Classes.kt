/* class Car( var make: String, val model: String, var color: String){

     fun accelerate(){
         println("Vroom, Vroom, pfff pfff Vroooooooom")
     }

     fun details(){
         println("This is a $color Vochito")
     }

 }

 class Truck(var make: String, var model: String, val towingCapacity: Int){

     fun tow(){
         println("Taking the horses to the rodeo! EEEEEjaaaa")
     }

     fun details(){
         println("The $make $model has a towing capacity of $towingCapacity lbs")
     }
 }*/

open class Vehicle(var make: String, var model: String){

    //to override a parent class method we put an open
    open fun accelerated(){
        println("Vroom Vrooom Vrooooooooooom!")
    }

    fun parked(){
        println("Careful back there!")
    }

    fun brake(){
        println("STOP!")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerated() {
//        super.accelerated() //this gives you what you have on the parent class value
        println("We are going LUDICROUS mode!")
    }
}

class Truck(make: String, model: String, var towingCapacity: Int) : Vehicle(make, model){

    fun tow(){
        println("Headed out to the mountains!")
    }
}

 fun main(args: Array<String>) {
     /*val car = Car("Volkswagen","Sedan", "Red")
     println("The ${car.color} ${car.make} ${car.model} is mine")
     car.accelerate()
     car.details()

     val truck = Truck("Toyota", "Avalon", 10000)
     truck.tow()
     truck.details()*/

     val tesla = Car("Tesla","ModelS", "Red")
     tesla.accelerated()

     val lobo = Truck("Ford", "LOBO", 10000)
     lobo.accelerated()
 }