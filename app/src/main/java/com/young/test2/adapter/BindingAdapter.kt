package com.young.test2.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.young.test2.data.HomeRecyclerItem
import com.young.test2.data.CompanyItem
import com.young.test2.data.DocTag
import com.young.test2.data.ExpertItem
import com.young.test2.utils.Constants.NO_IMAGE_URL

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

    @BindingAdapter("tag_items")
    @JvmStatic
    fun loadTagItems(rv: RecyclerView, items: ArrayList<DocTag>) {
        if (rv.adapter == null) {
            rv.adapter = TagRecyclerAdapter()
        }
        (rv.adapter as TagRecyclerAdapter).setData(items)
    }

    @BindingAdapter("image_url", "radius")
    @JvmStatic
    fun loadImage(iv: ImageView, imageUrl: String?, radius: Int) {
        if (!imageUrl.isNullOrEmpty()) {
            Glide.with(iv.context)
                .load(imageUrl)
                .transform(RoundedCorners(radius))
                .into(iv)
        } else {
            Glide.with(iv.context)
                .load(NO_IMAGE_URL)
                .transform(RoundedCorners(radius))
                .into(iv)
        }
    }
}