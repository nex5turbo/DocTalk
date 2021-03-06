package com.young.test2.data

import com.google.gson.annotations.SerializedName

data class CompanyItem(
    @SerializedName("address")
    var address: String? = null,

    @SerializedName("addressEtc")
    var addressEtc: String? = null,

    @SerializedName("companyName")
    var companyName: String? = null,

    @SerializedName("introPath")
    var introPath: String? = null,

    val radius: Int = 1
)