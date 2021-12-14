package com.example.practic

class RubleAccaunt : Account {
    var rubleList = mutableListOf<HistoryItem>()

    override fun getCurrencyName(): String {
        return "Ruble"
    }

    override fun addMoney(money: Int, place: OperationPlace) {
        if (money < 0) {
            rubleList.add(HistoryItem(OperationType.ADD_MONEY_FAIL, 0,place))
            return
        } else rubleList.add(HistoryItem(OperationType.ADD_MONEY, money,place))
    }

    override fun getBalance(): Int {
        return rubleList.sumOf { it.amount }
    }

    override fun withdraw(money: Int, place: OperationPlace): Int {
        if (money > rubleList.sumOf { it.amount }) {
            rubleList.add(HistoryItem(OperationType.WITHDRAW_FAIL, 0, place))
            return 0
        } else rubleList.add(HistoryItem(OperationType.WITHDRAW_MONEY, -money,place))
        return money
    }

    override fun getHistory(): MutableList<HistoryItem> {
        return rubleList
    }

    override fun getHistoryOperationCount(): Int {
        return rubleList.size
    }

    override fun getHistoryOperationAmount(index: Int): Int {
        return rubleList[index].amount
    }

    override fun succesfulyOperationSum(): Int {
        return rubleList.sumOf { it.amount }
    }

    override fun getHistoryOperationType(index: Int): OperationType {
        return rubleList[index].type
    }

    override fun getHistoryOperationPlace(index: Int): OperationPlace {
        return rubleList[index].place
    }

    override fun toString(): String {
        return "RubleAccaunt(rubleList=$rubleList)"
    }

}