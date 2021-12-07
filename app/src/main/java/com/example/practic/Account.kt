package com.example.practic

interface Account {                 //ИНТЕРФЭЙС СО ВСЕМИ НЕОБХОДИМЫМИ МЕТОДОМИ ДЛЯ РАБОТЫ
    fun getCurrencyName(): String
    fun addMoney(money: Int)
    fun getBalance(): Int
    fun withdraw(money: Int): Int
    fun getHistory(): List<Int>
    fun getHistoryOperationCount(): Int
    fun getHistoryOperationAmount(index: Int): Int
    fun succesfulyOperationSum(): Int
    fun getHistoryOperationType(index: Int): OperationType
}