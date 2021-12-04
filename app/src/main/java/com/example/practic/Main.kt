package com.example.practic

fun main() {
   val alex = SavingAccount(2000)
   alex.addMoney(3000)
   println(alex.getBalance())
   alex.addMoney(1999)
   println(alex.getBalance())
   println(alex.getMoney(999))
   alex.getBalance()
//   alex.getMoney(8000)
//   println(alex.getBalance())
//   alex.getMoney(3000)
//   println(alex.getBalance())
}

