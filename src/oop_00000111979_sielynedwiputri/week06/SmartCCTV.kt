package oop_00000111979_sielynedwiputri.week06

class SmartCCTV(override val id: String, override val name : String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name dinyalakan. Kondisi: On")
        startRecord()
    }
    override fun turnOff() {
        println("CCTV $name dimatikan. Kondisi: Off")
        stopRecord()
    }

    override fun startRecord() {
        println("Mulai merekam.")
    }
}