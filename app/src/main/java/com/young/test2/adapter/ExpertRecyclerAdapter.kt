package com.young.test2.adapter

import android.view.ViewGroup
import com.young.test2.R
import com.young.test2.databinding.ExpertItemBinding
import com.young.test2.data.ExpertItem
import com.young.test2.utils.Display.deviceWidth

class ExpertRecyclerAdapter: BaseAdapter<ExpertItem, ExpertItemBinding>(
    R.layout.expert_item
){
    override fun setViewSize() {
        var width = (deviceWidth*0.5).toInt()
        var height = ViewGroup.LayoutParams.WRAP_CONTENT
        setSize(binding.root.layoutParams, width, height)

        width = (width*0.8).toInt()
        height = width
        setSize(binding.expertImageView.layoutParams, width, height)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.data = items[position]
    }
}