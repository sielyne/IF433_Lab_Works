package oop_00000111979_sielynedwiputri.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
