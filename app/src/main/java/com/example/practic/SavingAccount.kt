package com.example.practic

class SavingAccount(var minBalance: Int = 0) : Account {
    var currentHistory = mutableListOf<Int>()
    var currentOperationType = mutableListOf<OperationType>()

    fun getHistoryOperationType(index: Int): OperationType {
        val currentIndex = currentOperationType[index]
        return currentIndex
    }

    fun succesfulyOperationSum(): Int {
        return currentHistory.sum()
    }

    fun getHistoryOperationAmount(index: Int): Int {
        val currentIndex = currentHistory[index]
        return currentIndex
    }


    fun getHistoryOperationCount(): Int {
        return currentHistory.size
    }

    override fun getCurrencyName(): String {
        return "Ruble !!!!!"
    }

    override fun addMoney(money: Int) {
        if (money < minBalance && currentHistory.sum() == 0) {
            currentHistory.add(0)
            currentOperationType.add(OperationType.ADD_MONEY_FAIL)
            return
        } else {
            currentHistory.add(money)
            currentOperationType.add(OperationType.ADD_MONEY)
        }
    }

    override fun getBalance(): Int {
        return currentHistory.sum()
    }

    override fun withdraw(money: Int): Int {
        if (currentHistory.sum() - money > minBalance) {
            currentHistory.add(-money)
            currentOperationType.add(OperationType.WITHDRAW_MONEY)
        } else {
            currentHistory.add(0)
            currentOperationType.add(OperationType.WITHDRAW_FAIL)
            return 0
        }
        return currentHistory.sum()
    }

    override fun getHistory(): List<Int> {
        return currentHistory
    }
}
