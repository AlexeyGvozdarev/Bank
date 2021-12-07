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

   println(alex.currentHistory)
   println(alex.getHistoryOperationType(4))
   println(alex.currentOperationType)

//   alex.getMoney(8000)
//   println(alex.getBalance())
//   alex.getMoney(3000)
//   println(alex.getBalance())
}

