package com.example.practic

class SavingAccount(var minBalance: Int = 0) : Account {
    var currentCount = 0
    var currentHistory = mutableListOf<Int>()
    var historyCount = 0

    fun getHistoryOperationCount(): Int{
        return historyCount
    }

    override fun getCurrencyName(): String {
        return "Ruble !!!!!"
    }

    override fun addMoney(money: Int) {
        if (money < minBalance && currentCount == 0) {
            currentHistory.add(0)
            return
        } else {
            currentCount += money
            currentHistory.add(money)
            historyCount++
        }
    }

    override fun getBalance(): Int {
        return currentCount
    }

    override fun withdraw(money: Int): Int {
        if (currentCount - money > minBalance) {
            currentCount -= money
            currentHistory.add(money)
            historyCount++
        } else {
            currentHistory.add(0)
            return 0
        }
        return currentCount
    }

    override fun getHistory(): List<Int> {
        TODO("Not yet implemented")
    }
}
//override fun addMoney(money: Int) {
//    if (money < minBalance && currentCount == 0) return
//    else currentCount += money
//}
//override fun withdraw(money: Int): Int {
//    if (currentCount - money > minBalance) currentCount -= money
//    else return 0
//    return currentCount
//}