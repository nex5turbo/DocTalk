package com.young.test2.home.data

import com.google.gson.annotations.SerializedName

data class CompanyList(

    @SerializedName("companyList")
    var companyList: ArrayList<CompanyItem>? = null,

    override var viewType: Int = 2

): HomeRecyclerItem
