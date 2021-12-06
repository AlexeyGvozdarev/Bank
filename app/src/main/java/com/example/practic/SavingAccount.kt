package com.example.practic

class SavingAccount(var minBalance: Int = 0) : Account {
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
        return currentHistory.size
    }

    override fun getCurrencyName(): String {
        return "Ruble !!!!!"
    }

    override fun addMoney(money: Int) {
        if (money < minBalance && currentHistory.sum() == 0) {
            currentHistory.add(0)
            return
        } else {
            currentHistory.add(money)
            succesOperationSum += money
        }
    }

    override fun getBalance(): Int {
        return currentHistory.sum()
    }

    override fun withdraw(money: Int): Int {
        if (currentHistory.sum() - money > minBalance) {
            currentHistory.add(-money)
        } else {
            currentHistory.add(0)
            return 0
        }
        return currentHistory.sum()
    }

    override fun getHistory(): List<Int> {
        return currentHistory
    }
}
