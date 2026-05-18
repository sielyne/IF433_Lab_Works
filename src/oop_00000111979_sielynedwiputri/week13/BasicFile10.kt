package oop_00000111979_sielynedwiputri.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file  = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("Fle berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkan konfigurasi baru.")
    println("Teks berhasil di-append.")
}
