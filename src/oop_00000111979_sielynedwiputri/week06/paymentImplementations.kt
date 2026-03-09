package oop_00000111979_sielynedwiputri.week06

class Gopay : PaymentMethod{
    override fun pay(amount: Double) { println("$amount via Gopay Server") }
}

class CreditCard : PaymentMethod{
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
}