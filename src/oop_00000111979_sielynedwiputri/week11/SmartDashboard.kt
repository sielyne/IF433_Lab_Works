package oop_00000111979_sielynedwiputri.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting", true, 12)
        .apply{}
        .also{homeDevices.add(it)}
}