package com.nepplus.orderapp.datas

import java.io.Serializable

class StoreData(
    val name: String,
    val rating: Double,
    val phone: String,  //int로하면 첫번째 0이 날라감
    val logoImageURL: String
) : Serializable {
}