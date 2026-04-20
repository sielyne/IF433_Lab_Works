package oop_00000111979_sielynedwiputri.Week09

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable list: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable list: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activateUsers = mutableSetOf("UserA", "UserB")
    activateUsers.add("UserC")
    activateUsers.add("UserA")
    println("Activate Users: $activateUsers")
}
