package oop_00000111979_sielynedwiputri.week03

import kotlin.compareTo

class Weapon (val name: String, damage: Int) {

    var damage: Int = damage
        set(value) {
            if (value < 0) {
                println("WARNING: Damage tidak boleh negatif! Nilai tetap sama.")
            } else if (value > 1000) {
                println("WARNING: Damage tidak boleh lebih dari 1000! Nilai damage akan di-set ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }
    val tier: String get() =
        if (damage > 800) { "Legendary"}
        else if (damage > 500){ "Epic"}
        else {"Common"}
}


