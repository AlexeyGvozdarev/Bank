package com.example.practic

class BankCard(var account: Account?) : Bank() {

    fun cardWithdraw(money: Int): Int {

        account?.withdraw(money, OperationPlace.BANKOMAT)
        bank.remove(account)
        account?.let { bank.add(it) }
        return money
    }

    fun getCardBalance(): Int? {
        return account?.succesfulyOperationSum()
    }

    override fun toString(): String {
        return "BankCard(account=$account)"
    }


}