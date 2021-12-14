package com.example.practic

enum class OperationType {
    ADD_MONEY,
    WITHDRAW_MONEY,
    ADD_MONEY_FAIL,
    WITHDRAW_FAIL;

    override fun toString(): String {
        return "OperationType()"
    }

}