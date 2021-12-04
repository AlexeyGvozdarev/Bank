package com.example.practic

interface Account {                 //ИНТЕРФЭЙС СО ВСЕМИ НЕОБХОДИМЫМИ МЕТОДОМИ ДЛЯ РАБОТЫ
    fun getCurrencyName(): String
    fun addMoney(money: Int)
    fun getBalance(): Int
    fun withdraw(money: Int): Int
}