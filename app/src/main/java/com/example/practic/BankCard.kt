package com.example.practic

    class BankCard {
    var cardAccaunt = mutableMapOf<String, Account>()

       fun issueCard(cardName: String,account: Account) {
           cardAccaunt.put(cardName,account)
       }


}