package com.example.practic

import android.util.Log
import org.junit.Assert.assertTrue
import org.junit.Test

class RubleAccountTests {

    @Test
    fun add50rub() {
        val alex = RubleAccaunt()
        alex.addMoney(50)
        assertTrue(alex.getBalance() == 50)
    }

    @Test
    fun add50And25Rub() {
        val andrey = RubleAccaunt()
        andrey.addMoney(50)
        andrey.addMoney(25)
        assertTrue(andrey.getBalance() == 75)
    }

    @Test
    fun addNegative50Ruble() {
        val patrik = RubleAccaunt()
        patrik.addMoney(-50)
        assertTrue(patrik.getBalance() == 0)
    }

    @Test
    fun get20Ruble() {
        val masha = RubleAccaunt()
        masha.addMoney(80)
        assertTrue(masha.getBalance() == 80)
        masha.withdraw(60)
        assertTrue(masha.getBalance() == 20)
    }

    @Test
    fun getNegative20Ruble() {
        val masha = RubleAccaunt()
        masha.addMoney(10)
        assertTrue(masha.getBalance() == 10)
        assertTrue(masha.withdraw(20) == 0)
        assertTrue(masha.getBalance() == 10)
    }
}
//  создать новый тип счета.
//1 позволяет пополнять не меньше чем 100
//2 позволяет снимать произвольную сумму  . в минус нельзя
//  создать класс имплементриррованый от Аккаунт но при создании указать не снижаемый остаток например 10 000 -долден приниматься в конструкторе
//1 первое пополнение счета не меньше 10 000 - поле лимит затем на любые