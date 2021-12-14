package com.example.practic

class SavingAccount(var minBalance: Int = 0) : Account {
    var currentOperationType = mutableListOf<HistoryItem>()

    override fun getHistoryOperationType(index: Int): OperationType {
        return currentOperationType[index].type
    }

    override fun succesfulyOperationSum(): Int {
        return currentOperationType.sumOf { it.amount }
    }

    override fun getHistoryOperationAmount(index: Int): Int {
        return currentOperationType.map { it.amount }.get(index = index)
    }

    override fun getHistoryOperationCount(): Int {
        return currentOperationType.size
    }

    override fun getCurrencyName(): String {
        return "Dollar"
    }

    override fun addMoney(money: Int, place: OperationPlace) {
        if (money < minBalance && currentOperationType.sumOf { it.amount } == 0) {
            currentOperationType.add(HistoryItem(OperationType.ADD_MONEY_FAIL, 0,place))
            return
        } else {
            currentOperationType.add(HistoryItem(OperationType.ADD_MONEY, money,place))
        }
    }

    override fun getBalance(): Int {
        return currentOperationType.sumOf { it.amount }
    }

    override fun withdraw(money: Int, place: OperationPlace): Int {
        if (currentOperationType.sumOf { it.amount } - money > minBalance) {
            currentOperationType.add(HistoryItem(OperationType.WITHDRAW_MONEY, -money,place))
        } else {
            currentOperationType.add(HistoryItem(OperationType.WITHDRAW_FAIL, 0,place))
            return 0
        }
        return money
    }

    override fun getHistory(): MutableList<HistoryItem> {
        return currentOperationType
    }
    override fun getHistoryOperationPlace(index: Int): OperationPlace {
        return currentOperationType[index].place
    }


}
