package com.example.practic

import org.junit.Assert.assertTrue
import org.junit.Test

class RubleAccountTests {

    @Test
    fun add50rub() {
        val alex = RubleAccount()
        alex.addMoney(50)
        assertTrue(alex.getBalance() == 50)
        assertTrue(alex.getHistoryOperationType(0) == OperationType.ADD_MONEY)
        assertTrue(alex.getHistoryOperationPlace(0) == OperationPlace.ATM)
    }

    @Test
    fun add50And25Rub() {
        val andrey = RubleAccount()
        andrey.addMoney(50)
        andrey.addMoney(25)
        assertTrue(andrey.getBalance() == 75)
        assertTrue(andrey.getHistoryOperationAmount(1) == 25)
    }

    @Test
    fun addNegative50Ruble() {
        val patrik = RubleAccount()
        patrik.addMoney(-50,OperationPlace.BANKOMAT)
        assertTrue(patrik.getBalance() == 0)
        assertTrue(patrik.getHistoryOperationType(0) == OperationType.ADD_MONEY_FAIL)
    }

    @Test
    fun get20Ruble() {
        val masha = RubleAccount()
        masha.addMoney(80)
        assertTrue(masha.getBalance() == 80)
        assertTrue(masha.withdraw(60,OperationPlace.BANKOMAT) == 60)
        assertTrue(masha.getBalance() == 20)
    }

    @Test
    fun getNegative20Ruble() {
        val masha = RubleAccount()
        masha.addMoney(10)
        assertTrue(masha.getBalance() == 10)
        assertTrue(masha.withdraw(20,OperationPlace.BANKOMAT) == 0)
        assertTrue(masha.getBalance() == 10)
        assertTrue(masha.getHistoryOperationType(1) == OperationType.WITHDRAW_FAIL)
        assertTrue(masha.getHistoryOperationAmount(1) == 0)
    }
}
//  создать новый тип счета.
//1 позволяет пополнять не меньше чем 100
//2 позволяет снимать произвольную сумму  . в минус нельзя
//  создать класс имплементриррованый от Аккаунт но при создании указать не снижаемый остаток например 10 000 -долден приниматься в конструкторе
//1 первое пополнение счета не меньше 10 000 - поле лимит затем на любые