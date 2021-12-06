package com.example.practic

class SavingAccount(var minBalance: Int = 0) : Account {
    var currentCount = 0
    var historyCount = 0
    var succesOperationSum = 0
    var currentHistory = mutableListOf<Int>()

    fun succesfulyOperationSum(): Int{
        return succesOperationSum
    }

    fun getHistoryOperationAmount(index: Int): Int{
        val currentIndex = currentHistory[index]
        return  currentIndex
    }


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
            succesOperationSum += money
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
        return currentHistory
    }
}
