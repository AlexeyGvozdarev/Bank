package com.example.practic

import android.telephony.SignalStrength

fun main() {
    val alex = SavingAccount(2000)

    alex.addMoney(1000,OperationPlace.BANK)
    alex.addMoney(3000,OperationPlace.BANKOMAT)
    println(alex.getBalance())
    alex.addMoney(1999,OperationPlace.BANK)
    println(alex.getBalance())
    println(alex.withdraw(999,OperationPlace.BANK))
    println(alex.withdraw(3000,OperationPlace.BANKOMAT))
    alex.getBalance()


    println(alex.currentOperationType.map { it.amount }.sum())
    println(alex.currentOperationType.map { it.amount }.get(index = 1))
    println(alex.currentOperationType.map { it.type }.get(index = 1))






}




