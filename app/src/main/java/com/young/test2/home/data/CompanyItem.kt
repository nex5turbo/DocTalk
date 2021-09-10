package com.young.test2.home.data

import com.google.gson.annotations.SerializedName
import com.young.test2.home.HomeRecyclerItem

data class CompanyItem(
    @SerializedName("address")
    var address: String? = null,

    @SerializedName("addressEtc")
    var addressEtc: String? = null,

    @SerializedName("companyName")
    var companyName: String? = null,

    @SerializedName("introPath")
    var introPath: String? = null

)