package oop_00000111979_sielynedwiputri.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 12.5))
    coinRepo.add(Coin("ETH", 50.2))
    coinRepo.add(Coin("USDT", 85.7))

    val response = NetworkResponse.ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    println("\n=== COIN ===")
    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("T001", 50.0))
    txRepo.add(Transaction("T002", 120.0))
}