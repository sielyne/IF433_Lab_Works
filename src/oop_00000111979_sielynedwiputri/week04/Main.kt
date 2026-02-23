package oop_00000111979_sielynedwiputri.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("--- Testing Electric Car ---")
    val electricCar = ElectricCar("Mio", 2, 55)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    println("-------------------------------")
    val manager = Manager("Atara", 20000000)
    val developer = Developer("Naniwa", 10000000, "Kotlin")

    manager.work()
    println("Total bonus manager: Rp. ${manager.calculateBonus()}")

    developer.work()
    println("Total bonus developer : Rp. ${developer.calculateBonus()}")
}