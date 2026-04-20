package oop_00000111979_sielynedwiputri.Week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 1.2, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 15, -3.7, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 13, 4.7, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 17, -5.1, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 25, -6.7, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 11, 8.5, "CLOSED"),

    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory.map {it.pair}.toSet()
}