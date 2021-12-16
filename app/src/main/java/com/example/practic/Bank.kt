package com.example.practic

import kotlin.math.max

open class Bank {

    var bank: MutableList<Account> = mutableListOf()


    fun addAccaunt(accaunt: Account) {
        bank.add(accaunt)
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