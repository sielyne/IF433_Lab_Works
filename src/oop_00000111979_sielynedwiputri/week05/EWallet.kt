package oop_00000111979_sielynedwiputri.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance <= amount) return println("Saldo tidak cukup")
        else {
            balance -= amount
            println("Pembayaran berhasil. sisa saldo: Rp. $balance")
        }
    }
    fun topUp(amount: Double) {
        balance += amount
        println("Saldo berhasil ditambahkan. total saldo sekarang: Rp. $balance")
    }
}
