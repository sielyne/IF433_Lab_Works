package oop_00000111979_sielynedwiputri.week02

import java.util.Scanner

class Loan (
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1)
{
    fun calculateFine () = if (loanDuration > 3) (loanDuration - 3)*2000 else 0
}

fun main() {
    val scanner = Scanner( System.`in`)

    println("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    println("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    println("Masukkan lama peminjaman: ")
    var loanDuration = scanner.nextInt()

    if (loanDuration < 0) loanDuration = 1

    val loan = Loan (bookTitle, borrower, loanDuration)

    println("Struk Peminjaman Buku")
    println("Judul Buku : ${loan.bookTitle}")
    println("Nama Peminjam : ${loan.borrower}")
    println("Total Denda: Rp ${loan.calculateFine()}")
}


