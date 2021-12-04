package com.example.practic

import org.junit.Assert
import org.junit.Test

class SavingAccountTest{
    @Test
    fun getMoreThen10000() {
        val user = SavingAccount(2000)
        user.addMoney(20000)
        Assert.assertTrue(user.withdraw(9000) == 11000)
        user.addMoney(5000)
        Assert.assertTrue(user.getBalance() == 16000)
        Assert.assertTrue(user.withdraw(7000) == 0)
        Assert.assertTrue(user.getBalance() == 16000)
    }
    @Test
    fun firstAmountIsMoreThanMinBalance () {
        val minBalance = 2000
        val account = SavingAccount (minBalance)
        account.addMoney (1000 )
        Assert.assertEquals (0, account.getBalance ())
    }
}