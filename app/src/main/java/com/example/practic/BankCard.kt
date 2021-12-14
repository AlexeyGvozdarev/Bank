package com.example.practic

open class BankCard {
      open var cardList: MutableMap<String,Account> = mutableMapOf()
      override fun toString(): String {
            return "BankCard(cardList=$cardList)"
      }

}