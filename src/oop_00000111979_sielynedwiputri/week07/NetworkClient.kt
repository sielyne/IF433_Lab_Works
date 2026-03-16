package oop_00000111979_sielynedwiputri.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connected to $url...")
    }
}