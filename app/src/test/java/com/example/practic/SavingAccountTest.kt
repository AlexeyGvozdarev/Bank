package com.example.practic

import org.junit.Assert
import org.junit.Test

class SavingAccountTest {
    @Test
    fun overDraw() {
        val user = SavingAccount(2000)
        user.addMoney(20000,OperationPlace.BANKOMAT)
        Assert.assertTrue(user.withdraw(9000) == 9000)
        user.addMoney(5000,OperationPlace.BANKOMAT)
        Assert.assertTrue(user.getBalance() == 16000)
        Assert.assertTrue(user.withdraw(7000) == 7000)
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
        account.addMoney(2000,OperationPlace.BANKOMAT)
        val operationCount = account.getHistoryOperationCount()
        Assert.assertEquals(2, operationCount)
    }

    @Test
    fun getAccountHistoryEquals2() {
        val account = SavingAccount(1000)
        account.addMoney(1000)
        account.addMoney(2000,OperationPlace.BANKOMAT)
        val operationCount = account.getHistoryOperationCount()
        Assert.assertEquals(2, operationCount)
        Assert.assertEquals(1000, account.getHistoryOperationAmount(0))
        Assert.assertEquals(2000, account.getHistoryOperationAmount(1))
        Assert.assertTrue(account.successfullyOperationSum() == 3000)
        Assert.assertTrue(account.getHistoryOperationType(1) == OperationType.ADD_MONEY)
        Assert.assertTrue(account.getHistoryOperationPlace(1) == OperationPlace.BANKOMAT)
    }
    @Test
    fun getTotalBalanceEquals(){
        val acc1 = SavingAccount(1000)
        val acc2 = RubleAccount()
        val acc3 = Bank()
        acc1.addMoney(2000)
        acc2.addMoney(3000)
        acc3.addAccount(acc1)
        acc3.addAccount(acc2)

        Assert.assertTrue(acc3.getTotalBalance() == 5000)
    }


}