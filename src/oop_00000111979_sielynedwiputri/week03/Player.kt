package oop_00000111979_sielynedwiputri.week03

class Player (val username: String, ) {
    private var xp: Int = 0
    val level: Int get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP harus bernilai positif!")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Selamat! $username naik ke level $newLevel.")
        }
    }
}

fun main() {
    val player = Player("Blanch")
    //println(player.xp)

    player.addXp(50)
    player.addXp(60)

    println("Current Level: ${player.level}")
}