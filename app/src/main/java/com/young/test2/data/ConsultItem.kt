package com.young.test2.data

import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat
import java.util.*

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
    var tagList: List<DocTag>? = null,

    var regDateString: String? = null,

    override var viewType: Int = 0

): HomeRecyclerItem {
    fun dateToString() {
        if (regDate == null) return
        val date = Date(regDate!!)
        val format = SimpleDateFormat("yyyy.MM.dd")
        regDateString = format.format(date)
    }
}

