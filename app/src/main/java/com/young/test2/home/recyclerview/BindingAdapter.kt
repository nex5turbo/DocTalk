package com.young.test2.home.recyclerview

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.young.test2.home.data.HomeRecyclerItem
import com.young.test2.home.data.*

object BindingAdapter {
    @BindingAdapter("items")
    @JvmStatic
    fun loadItems(rv: RecyclerView, items: ArrayList<HomeRecyclerItem>) {
        if (rv.adapter == null) {
            rv.adapter = HomeRecyclerAdapter()
        }
        (rv.adapter as HomeRecyclerAdapter).setData(items)
    }

    @BindingAdapter("expert_items")
    @JvmStatic
    fun loadExpertItems(rv: RecyclerView, items: ArrayList<ExpertItem>) {
        if (rv.adapter == null) {
            rv.adapter = ExpertRecyclerAdapter()
        }
        (rv.adapter as ExpertRecyclerAdapter).setData(items)
    }

    @BindingAdapter("company_items")
    @JvmStatic
    fun loadCompanyItems(rv: RecyclerView, items: ArrayList<CompanyItem>) {
        if (rv.adapter == null) {
            rv.adapter = CompanyRecyclerAdapter()
        }
        (rv.adapter as CompanyRecyclerAdapter).setData(items)
    }

//    @BindingAdapter("image_url")
//    @JvmStatic
//    fun loadImage(iv: ImageView, imageUrl: String) {
//
//    }
}