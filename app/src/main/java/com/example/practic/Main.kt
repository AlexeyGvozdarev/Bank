package com.example.practic

import kotlin.math.max

fun main() {
   val alex = USD()
   alex.addMoney(20000.0)
   println(alex.getBalance())
   alex.getMoney(8000.0)
   println(alex.getBalance())
   alex.getMoney(3000.0)
   println(alex.getBalance())
}

