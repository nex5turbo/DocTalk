package com.young.test2.home.data

import com.google.gson.annotations.SerializedName

data class ResponseHome(
    @SerializedName("pageMap")
    var pageMap: PageMap? = null,

    @SerializedName("expertListPosition")
    var expertListPosition: Int? = null,

    @SerializedName("companyListPosition")
    var companyListPosition: Int? = null,

    @SerializedName("consultList")
    var consultList: ArrayList<ConsultItem>? = null,

    @SerializedName("expertList")
    var expertList: ArrayList<ExpertItem>? = null,

    @SerializedName("companyList")
    var companyList: ArrayList<CompanyItem>? = null
){
    data class PageMap(
        @SerializedName("pageNumber")
        var pageNumber: Int? = null,

        @SerializedName("rowPerPage")
        var rowPerPage: Int? = null,

        @SerializedName("pageCount")
        var pageCount: Int? = null,

        @SerializedName("totalCount")
        var totalCount: Int? = null
    )
}
