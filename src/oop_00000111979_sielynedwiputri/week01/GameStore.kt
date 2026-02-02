package oop_00000111979_sielynedwiputri.week01

fun main() {
    val gameTitle: String = "Grounded"
    val price: Int = 550000
    val userNote: String? = null
    val totalPrice: Int = calculateDiscount(price)
    printReceipt(gameTitle, price, totalPrice, userNote)
}

fun calculateDiscount(price: Int): Int = if (price < 500000) (price*90)/100 else (price*80)/100

fun printReceipt(gameTitle: String, price: Int, totalPrice: Int, userNote: String?) {
    println("Struk Pembelian SteamKW")
    println("Game Title : $gameTitle")
    println("Original Price: Rp $price")
    println("Discounted Price: Rp $totalPrice")
    println("Note : ${userNote ?: "Tidak ada catatan"}")
}