package com.example.practic

import org.junit.Assert
import org.junit.Test

class BankCardTest {
    @Test
    fun cardTest(){
        val alex = SavingAccount(2000)
        val masha = SavingAccount(2000)
        val andrey = RubleAccaunt()

        alex.addMoney(1000)
        alex.addMoney(3000, OperationPlace.BANKOMAT)
        alex.addMoney(1999)
        alex.withdraw(999)
        alex.withdraw(3000, OperationPlace.BANKOMAT)
        masha.addMoney(10000)
        andrey.addMoney(20000)
        val bankAccount1 = Bank()
        bankAccount1.addAccaunt(alex)
        bankAccount1.addAccaunt(masha)
        bankAccount1.addAccaunt(andrey)
        val card_1 = bankAccount1.issueCard()
        Assert.assertTrue(bankAccount1.getTotalBalance() == 34000)
        Assert.assertTrue(card_1.getCardBalance() == 20000)
        card_1.cardWithdraw(3000)
        Assert.assertTrue(bankAccount1.getTotalBalance() == 31000)
        Assert.assertTrue(card_1.getCardBalance() == 17000)

    }
}