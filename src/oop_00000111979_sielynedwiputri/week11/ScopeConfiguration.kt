package oop_00000111979_sielynedwiputri.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    val user = User(name = "Alex", age = 25)
    println(user)

    println("\n=== TEST WITH ===")
    with(user) {
        println("User Detail -> Nama: $name, Umur: $age")
    }

    val newUser = User("Budi", 20).apply {
        age = 21
    }.also {
        println("User baru berhasil dibuat: $it")
    }
}