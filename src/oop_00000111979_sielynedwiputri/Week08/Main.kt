package oop_00000111979_sielynedwiputri.Week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}
