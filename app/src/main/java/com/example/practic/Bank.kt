package com.example.practic

class Bank: BankCard() {
    override var cardList: MutableMap<String,Account> = mutableMapOf()

     var bank: MutableList<Account> = mutableListOf()

    fun addAccaunt(accaunt: Account){
        bank.add(accaunt)
    }
    fun getTotalBalance (): Int{
       val sum = bank.sumOf { it.getBalance() }
        return sum
    }
    fun issueCard (cardName: String,accaunt: Account): Account? {

      return  cardList.put(cardName,accaunt)
    }

    override fun toString(): String {
        return "Bank(cardList=$cardList, bank=$bank)"
    }

}