package com.example.practic

class RubleAccaunt : Account {
    var ruble = 0.0
    override fun getCurrencyName(): String {
        return "Ruble"
    }

    override fun addMoney(money: Double) {
        if (money < 0) return

        ruble += money
    }

    override fun getBalance(): Double {

        return ruble
    }

    override fun getMoney(money: Double): Double {
        if (money > ruble) return 0.0
        ruble -= money
        return ruble
    }

}