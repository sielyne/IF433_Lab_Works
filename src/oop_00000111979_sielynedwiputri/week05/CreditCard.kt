package oop_00000111979_sielynedwiputri.week05

class CredicCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if(amount + usedAmount <= limit) {
            usedAmount += amount
            println("Pemakaian Credit Card berhasil! akumulasi saldo terpakai: Rp. $usedAmount ")
        } else println("Transaksi melebihi limit, proses ditolak.")
    }
}