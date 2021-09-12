package com.young.test2.data

import com.google.gson.annotations.SerializedName

data class ExpertList(
    @SerializedName("expertList")
    var expertList: ArrayList<ExpertItem>? = null,

    override var viewType: Int = 1
): HomeRecyclerItem
