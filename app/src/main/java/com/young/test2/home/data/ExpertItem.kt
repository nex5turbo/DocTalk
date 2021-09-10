package com.young.test2.home.data
import com.google.gson.annotations.SerializedName
import com.young.test2.home.HomeRecyclerItem

data class ExpertItem(
    @SerializedName("companyName")
    var companyName: String? = null,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("profileImagePath")
    var profileImagePath: String? = null,

    @SerializedName("tagList")
    var tagList: List<DocTag>? = null,

    @SerializedName("typeName")
    var typeName: String? = null

)