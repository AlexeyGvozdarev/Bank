package com.example.practic

fun main() {
    val alex = SavingAccount(2000)
    val masha = SavingAccount(2000)
    val andrey = RubleAccaunt()

    alex.addMoney(1000)
    alex.addMoney(3000,OperationPlace.BANKOMAT)
    println(alex.getBalance())
    alex.addMoney(1999)
    println(alex.getBalance())
    println(alex.withdraw(999))
    println(alex.withdraw(3000,OperationPlace.BANKOMAT))
    alex.getBalance()
    masha.addMoney(10000)
    andrey.addMoney(20000)

    println(alex.currentOperationType.map { it.amount }.sum())
    println(alex.currentOperationType.map { it.amount }.get(index = 1))
    println(alex.currentOperationType.map { it.type }.get(index = 1))

    val bankAccount1 = Bank()

    bankAccount1.addAccaunt(alex)
    bankAccount1.addAccaunt(masha)
    bankAccount1.addAccaunt(andrey)

    println("сумма аккаунтов = ${bankAccount1.getTotalBalance()}")

   val card = Bank()

    card.issueCard("alexCard",alex)
    card.issueCard("mashaCard",masha)
    card.issueCard("andreyCard",andrey)

    println(card.cardList)
}




