package com.example.practic

data class Bank(var bank: MutableList<Account> = mutableListOf()) {
   // var sum = 0

    fun addAccaunt(accaunt: Account){
        bank.add(accaunt)
        //sum += accaunt.getBalance()
    }
    fun getTotalBalance (): Int{
       var sum = bank.sumOf { it.getBalance() }
        return sum
    }
}