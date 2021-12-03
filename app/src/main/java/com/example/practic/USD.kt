package com.example.practic

class USD(var usd: Double = 0.0) : Account {
    var currentUSD = usd
    override fun getCurrencyName(): String {
        return "Ruble !!!!!"
    }

    override fun addMoney(money: Double) {
        currentUSD += money
        if (currentUSD < 10000.0) return
        usd = currentUSD
    }

    override fun getBalance(): Double {
        return usd
    }

    override fun getMoney(money: Double): Double {
        currentUSD -= money
        if (currentUSD < 10000.0) return usd
        usd = currentUSD
        return usd
    }
}