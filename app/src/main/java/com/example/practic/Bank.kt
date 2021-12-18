package com.example.practic

class Bank {

    private var bank: MutableList<Account> = mutableListOf()


    fun addAccount(account: Account) {
        bank.add(account)
    }

    fun getTotalBalance(): Int {
        val sum = bank.sumOf { it.getBalance() }
        return sum
    }

    fun issueCard(): BankCard {
        val cardName = bank.maxByOrNull { it.getBalance() }
        val card = BankCard(cardName)
        return card
    }

    override fun toString(): String {
        return "Bank(bank=$bank)"
    }


}