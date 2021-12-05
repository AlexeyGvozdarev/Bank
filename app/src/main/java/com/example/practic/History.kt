package com.example.practic

enum class History(var historyList: MutableList<Int>) {
    ADDHISTORY(historyList = mutableListOf()),
    DRAWHISTORY(historyList = mutableListOf() )
}