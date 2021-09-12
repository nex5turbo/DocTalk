package com.young.test2.adapter

import android.app.ActionBar
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.young.test2.databinding.ExpertItemBinding
import com.young.test2.data.ExpertItem
import com.young.test2.utils.Display.getWidth

class ExpertRecyclerAdapter: RecyclerView.Adapter<ExpertRecyclerAdapter.MyViewHolder>() {
    var items: ArrayList<ExpertItem> = arrayListOf()
    lateinit var binding: ExpertItemBinding
    inner class MyViewHolder(val binding: ExpertItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = ExpertItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        var width = (getWidth()*0.5).toInt()
        var height = ViewGroup.LayoutParams.WRAP_CONTENT
        setSize(binding.root.layoutParams, width, height)

        width = (width*0.8).toInt()
        height = width
        setSize(binding.expertImageView.layoutParams, width, height)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.data = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(data: ArrayList<ExpertItem>) {
        items = data
        notifyDataSetChanged()
    }

    private fun setSize(lp: ViewGroup.LayoutParams, width: Int, height: Int) {
        lp.width = width
        lp.height = height
    }
}