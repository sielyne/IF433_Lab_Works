package oop_00000111979_sielynedwiputri.week01

fun main() {
    val gameTitle: String = "Grounded"
    val price: Int = 550000
    val totalPrice: Int = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int = if (price < 500000) (price*90)/100 else (price*80)/100
