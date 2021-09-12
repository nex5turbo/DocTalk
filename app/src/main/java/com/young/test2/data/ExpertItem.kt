package com.young.test2.data
import com.google.gson.annotations.SerializedName

data class ExpertItem(
    @SerializedName("companyName")
    var companyName: String? = null,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("profileImagePath")
    var profileImagePath: String? = null,

    @SerializedName("tagList")
    var tagList: ArrayList<DocTag>? = null,

    @SerializedName("typeName")
    var typeName: String? = null,

    val radius: Int = 30

)