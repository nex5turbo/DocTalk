package com.young.test2.data

import com.google.gson.annotations.SerializedName

data class DocTag(
    @SerializedName("key")
    var key: Int? = null,

    @SerializedName("name")
    var name: String? = null

)