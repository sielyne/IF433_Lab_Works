package oop_00000111979_sielynedwiputri.week02

import java.util.Scanner

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {
    fun attack(targetName: String) {
        println("$name memukul $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    print("Nama Hero: ")
    val name = sc.nextLine()

    print("Base Damage: ")
    val damage = sc.nextInt()

    val hero = Hero(name = name, baseDamage = damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("1. Lawan")
        println("2. Kabur")
        print("Pilih: ")
        val choice = sc.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("Hero terkena $enemyDamage damage")
                println("HP Hero: ${hero.hp}")
            }
        } else {
            println("Hero kabur!")
            break
        }
    }

    if (hero.hp > enemyHp) {
        println("Hero menang!")
    } else {
        println("Enemy menang!")
    }
}


