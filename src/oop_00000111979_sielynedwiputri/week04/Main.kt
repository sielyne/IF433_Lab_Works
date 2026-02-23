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
}