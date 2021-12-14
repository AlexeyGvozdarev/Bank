package com.example.practic

 class HistoryItem(var type: OperationType, var amount: Int,var place: OperationPlace) {
  override fun toString(): String {
   return "HistoryItem(type=$type, amount=$amount, place=$place)"
  }
 }