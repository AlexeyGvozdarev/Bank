package com.example.practic

import android.telephony.SignalStrength

fun main() {
    val alex = SavingAccount(2000)

    alex.addMoney(1000)
    alex.addMoney(3000)
    println(alex.getBalance())
    alex.addMoney(1999)
    println(alex.getBalance())
    println(alex.withdraw(999))
    println(alex.withdraw(3000))
    alex.getBalance()


    println(alex.currentOperationType.map { it.amount }.sum())
    println(alex.currentOperationType.map { it.amount }.get(index = 1))
    println(alex.currentOperationType.map { it.type }.get(index = 1))






}




