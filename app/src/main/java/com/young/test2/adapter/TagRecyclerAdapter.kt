package com.young.test2.adapter

import com.young.test2.R
import com.young.test2.data.DocTag
import com.young.test2.databinding.TagItemBinding

class TagRecyclerAdapter: BaseAdapter<DocTag, TagItemBinding>(
    R.layout.tag_item
){
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.data = items[position]
    }
}