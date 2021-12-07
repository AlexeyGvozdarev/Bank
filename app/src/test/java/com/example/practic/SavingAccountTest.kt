package com.example.practic

import org.junit.Assert
import org.junit.Test

class SavingAccountTest {
    @Test
    fun overDraw() {
        val user = SavingAccount(2000)
        user.addMoney(20000)
        Assert.assertTrue(user.withdraw(9000) == 11000)
        user.addMoney(5000)
        Assert.assertTrue(user.getBalance() == 16000)
        Assert.assertTrue(user.withdraw(7000) == 9000)
        Assert.assertTrue(user.withdraw(8000) == 0)
    }

    @Test
    fun firstAmountIsMoreThanMinBalance() {
        val minBalance = 2000
        val account = SavingAccount(minBalance)
        account.addMoney(1000)
        Assert.assertEquals(0, account.getBalance())
    }

    @Test
    fun accountHistoryCountEquals2() {
        val account = SavingAccount(1000)
        account.addMoney(1000)
        account.addMoney(2000)
        val operationCount = account.getHistoryOperationCount()
        Assert.assertEquals(2, operationCount)
    }

    @Test
    fun getAccountHistoryEquals2() {
        val account = SavingAccount(1000)
        account.addMoney(1000)
        account.addMoney(2000)
        val operationCount = account.getHistoryOperationCount()
        Assert.assertEquals(2, operationCount)
        Assert.assertEquals(1000, account.getHistoryOperationAmount(0))
        Assert.assertEquals(2000, account.getHistoryOperationAmount(1))
        Assert.assertTrue(account.succesfulyOperationSum() == 3000)

    }

}