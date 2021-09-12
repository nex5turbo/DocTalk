package com.young.test2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.young.test2.data.DocTag
import com.young.test2.databinding.TagItemBinding

class TagRecyclerAdapter: RecyclerView.Adapter<TagRecyclerAdapter.MyViewHolder>() {
    lateinit var binding: TagItemBinding
    private var items: ArrayList<DocTag> = arrayListOf()
    inner class MyViewHolder(val binding: TagItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = TagItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.data = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun setData(data: ArrayList<DocTag>) {
        items = data
        notifyDataSetChanged()
    }
}