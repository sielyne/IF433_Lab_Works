package oop_00000111979_sielynedwiputri.week06

fun main() {
    val lamp = SmartLamp("1", "Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
    println("=== Activate Security Mode ===")
    hub.activateSecurityMode()

    println()
    println("=== Turn Off All Devices ===")
    hub.turnOffAllSwitches()
}