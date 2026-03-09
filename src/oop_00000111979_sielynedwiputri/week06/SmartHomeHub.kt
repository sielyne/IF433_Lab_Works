package oop_00000111979_sielynedwiputri.week06

class SmartHomeHub() {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice){
        devices.add(device)
    }
    fun turnOfAllSwitches() {
        for(device in devices){
            if(device is Switchable){
                device.turnOff()
            }
        }
    }
}