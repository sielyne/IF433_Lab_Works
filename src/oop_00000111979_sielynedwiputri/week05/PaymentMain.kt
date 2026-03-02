package oop_00000111979_sielynedwiputri.week05

fun main(){
    val eWallet = EWallet("Sielyne", 50000.0)
    val creditCard = CreditCard("Sielyne", 100000.0)

    val metode: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (acc in metode) {
        acc.processPayment(75000.0)
    }
}
