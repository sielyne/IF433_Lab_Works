package oop_00000111979_sielynedwiputri.week06

class SmartLamp(override val id: String, override val name : String) : SmartDevice, Switchable {
    override fun turnOn(){
        println("Lampu dinyalakan. Kondisi: On")
    }
    override fun turnOff(){
        println("Lampu dimatikan. Kondisi: Off")
    }
}