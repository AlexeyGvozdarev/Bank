package com.example.practic

class RubleAccaunt : Account {
    var ruble = 0
    override fun getCurrencyName(): String {
        return "Ruble"
    }

    override fun addMoney(money: Int) {
        if (money < 0) return

        ruble += money
    }

    override fun getBalance(): Int {

        return ruble
    }

    override fun withdraw(money: Int): Int {
        if (money > ruble) return 0
        ruble -= money
        return ruble
    }

}