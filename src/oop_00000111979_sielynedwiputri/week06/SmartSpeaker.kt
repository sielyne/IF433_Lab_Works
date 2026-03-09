package oop_00000111979_sielynedwiputri.week06

class SmartSpeaker(override val id: String, override val name : String) : SmartDevice, Switchable {
    override fun turnOn(){
        println("Smart Speaker $name dinyalakan. Kondisi: On")
    }
    override fun turnOff(){
        println("Smart Speaker $name dimatikan. Kondisi: Off")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}