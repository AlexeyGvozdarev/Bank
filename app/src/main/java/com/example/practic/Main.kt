package com.example.practic

fun main() {
   val alex = SavingAccount(2000)
   alex.addMoney(1000)
   alex.addMoney(3000)
   println(alex.getBalance())
   alex.addMoney(1999)
   println(alex.getBalance())
   println(alex.withdraw(999))
   println(alex.withdraw(3000))
   alex.getBalance()
   println(History.ADDHISTORY.historyList)
   println(History.DRAWHISTORY.historyList)
//   alex.getMoney(8000)
//   println(alex.getBalance())
//   alex.getMoney(3000)
//   println(alex.getBalance())
}

