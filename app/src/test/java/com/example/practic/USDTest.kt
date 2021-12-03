package com.example.practic

import org.junit.Assert
import org.junit.Test

class USDTest{
    @Test
    fun getMoreThen10000() {
        val user = USD()
        user.addMoney(20000.0)
        Assert.assertTrue(user.usd == 20000.0)
        Assert.assertTrue(user.getMoney(9000.0) == 11000.0)
        user.addMoney(5000.0)
        Assert.assertTrue(user.getBalance() == 16000.0)
        Assert.assertTrue(user.getMoney(7000.0) == 16000.0)
    }
}