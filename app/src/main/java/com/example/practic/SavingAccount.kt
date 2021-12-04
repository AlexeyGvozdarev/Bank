package com.example.practic

class SavingAccount(var minBalance: Int = 0) : Account {
    var currentCount = 0
    override fun getCurrencyName(): String {
        return "Ruble !!!!!"
    }

    override fun addMoney(money: Int) {
        if (money < minBalance && currentCount == 0) return
        else currentCount += money
    }

    override fun getBalance(): Int {
        return currentCount
    }

    override fun withdraw(money: Int): Int {
        if (currentCount-money > minBalance) currentCount -=money
        else return 0
        return currentCount
    }
}
