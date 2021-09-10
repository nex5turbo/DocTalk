package com.young.test2.home.data

import com.google.gson.annotations.SerializedName
import com.young.test2.home.HomeRecyclerItem

data class ExpertList(
    @SerializedName("expertList")
    var expertList: List<ExpertItem>? = null

): HomeRecyclerItem
