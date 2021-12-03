package com.example.practic

interface Account {
    fun getCurrencyName(): String
    fun addMoney(money: Double)
    fun getBalance(): Double
    fun getMoney(money: Double): Double
}