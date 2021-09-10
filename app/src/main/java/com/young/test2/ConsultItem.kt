package com.young.test2

import com.google.gson.annotations.SerializedName

data class ConsultItem(
    @SerializedName("seq")
    var seq: Int? = null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("context")
    var content: String? = null,

    @SerializedName("regDate")
    var regDate: Long? = null,

    @SerializedName("answerCnt")
    var answerCnt: Int? = null,

    @SerializedName("tagList")
    var tagList: List<DocTag>? = null

): HomeRecyclerItem

