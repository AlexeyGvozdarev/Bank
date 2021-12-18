package com.example.practic

class BankCard(private var account: Account?)  {

    fun cardWithdraw(money: Int): Int {

        account?.withdraw(money, OperationPlace.BANKOMAT)
        return money
    }

    fun getCardBalance(): Int? {
        return account?.successfullyOperationSum()
    }

    override fun toString(): String {
        return "BankCard(account=$account)"
    }


}