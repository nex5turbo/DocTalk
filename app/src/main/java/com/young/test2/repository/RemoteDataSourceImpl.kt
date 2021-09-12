package com.young.test2.repository

import com.young.test2.data.CompanyList
import com.young.test2.data.ExpertList
import com.young.test2.data.HomeRecyclerItem
import com.young.test2.data.ResponseHome
import com.young.test2.retrofit.DocApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSourceImpl: RemoteDataSource {
    override fun getHomeList(
        onResponse: (ArrayList<HomeRecyclerItem>) -> Unit,
        onFailure: (Throwable) -> Unit
    ) {
        DocApi.getDocService().getHomeList().enqueue(object : Callback<ResponseHome> {
            override fun onResponse(call: Call<ResponseHome>, response: Response<ResponseHome>) {
                val resultList = arrayListOf<HomeRecyclerItem>()
                if (response.isSuccessful) {
                    val body = response.body()!!

                    val expertPosition = body.expertListPosition
                    val companyPosition = body.companyListPosition

                    val consultList = body.consultList
                    val expertList = ExpertList(body.expertList)
                    val companyList = CompanyList(body.companyList)


                    var index = 1
                    for (consult in consultList!!) {
                        if (index == expertPosition) {
                            resultList.add(expertList)
                            index++
                        } else if (index == companyPosition) {
                            resultList.add(companyList)
                            index++
                        }
                        consult.dateToString()
                        resultList.add(consult)
                        index++
                    }
                }
                onResponse(resultList)
            }

            override fun onFailure(call: Call<ResponseHome>, t: Throwable) {
                onFailure(t)
            }
        })
    }
}