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
        else ruble -= money


        return money
    }

    override fun getHistory(): List<Int> {
        TODO("Not yet implemented")
    }

    override fun getHistoryOperationCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getHistoryOperationAmount(index: Int): Int {
        TODO("Not yet implemented")
    }

    override fun succesfulyOperationSum(): Int {
        TODO("Not yet implemented")
    }

    override fun getHistoryOperationType(index: Int): OperationType {
        TODO("Not yet implemented")
    }

}