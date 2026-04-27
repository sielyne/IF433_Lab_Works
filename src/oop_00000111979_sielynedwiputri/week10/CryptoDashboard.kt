package oop_00000111979_sielynedwiputri.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 12.5))
    coinRepo.add(Coin("ETH", 50.2))
    coinRepo.add(Coin("USDT", 85.7))
}