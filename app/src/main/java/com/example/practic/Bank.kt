package com.example.practic

    open class Bank() {

     var bank: MutableList<Account> = mutableListOf()

    fun addAccaunt(accaunt: Account){
        bank.add(accaunt)
    }
    fun getTotalBalance (): Int{
       val sum = bank.sumOf { it.getBalance() }
        return sum
    }

}