package com.example.practic

interface Account {                 //ИНТЕРФЭЙС СО ВСЕМИ НЕОБХОДИМЫМИ МЕТОДОМИ ДЛЯ РАБОТЫ
    fun getCurrencyName(): String
    fun addMoney(money: Int, place: OperationPlace)
    fun getBalance(): Int
    fun withdraw(money: Int, place: OperationPlace): Int
    fun getHistory(): MutableList<HistoryItem>
    fun getHistoryOperationCount(): Int
    fun getHistoryOperationAmount(index: Int): Int
    fun succesfulyOperationSum(): Int
    fun getHistoryOperationType(index: Int): OperationType
    fun getHistoryOperationPlace(index: Int): OperationPlace
}