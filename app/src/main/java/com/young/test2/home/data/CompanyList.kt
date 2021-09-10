package com.young.test2.home.data

import com.google.gson.annotations.SerializedName
import com.young.test2.home.HomeRecyclerItem

data class CompanyList(

    @SerializedName("companyList")
    var companyList: List<CompanyItem>? = null,

    val viewType: Int = 2

): HomeRecyclerItem
