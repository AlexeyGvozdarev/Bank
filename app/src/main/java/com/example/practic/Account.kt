package com.example.practic

interface Account {
    fun getCurrencyName(): String
    fun addMoney(money: Int)
    fun getBalance(): Int
    fun withdraw(money: Int): Int
}