package oop_00000111979_sielynedwiputri.week06

class SmartLamp(override val id: String, override val name : String) : SmartDevice, Switchable {
    override fun turnOn(){
        println("Smart Lamp dinyalakan. Kondisi: On")
    }
    override fun turnOff(){
        println("Smart Lamp dimatikan. Kondisi: Off")
    }
}