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

    // Возвращает сумму которую сняли
    override fun withdraw(money: Int): Int {
        if (currentCount - money > minBalance) currentCount -= money
        return currentCount
    }
}
//override fun addMoney(money: Double) {
//    currentCount += money
//    if (currentCount < 2000.0) return
//    minBalance = currentCount
//}
//override fun getMoney(money: Int): Int {
//    currentCount -= money
//    if (currentCount < 2000) return minBalance
//    minBalance = currentCount
//    return minBalance
//}