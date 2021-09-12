package com.young.test2.adapter

import com.young.test2.R
import com.young.test2.databinding.CompanyItemBinding
import com.young.test2.data.CompanyItem
import com.young.test2.utils.Display.deviceWidth

class CompanyRecyclerAdapter: BaseAdapter<CompanyItem, CompanyItemBinding>(
    R.layout.company_item
){
    override fun setViewSize() {
        val width = (deviceWidth*0.8).toInt()
        val height = (width*0.7).toInt()
        setSize(binding.companyImageView.layoutParams, width, height)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.data = items[position]
    }

}