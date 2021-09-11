package com.young.test2.home.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.young.test2.R
import com.young.test2.databinding.CompanyItemBinding
import com.young.test2.databinding.ExpertItemBinding
import com.young.test2.home.data.ExpertItem

class ExpertRecyclerAdapter: RecyclerView.Adapter<ExpertRecyclerAdapter.MyViewHolder>() {
    var items: ArrayList<ExpertItem> = arrayListOf()
    lateinit var binding: ExpertItemBinding
    inner class MyViewHolder(val binding: ExpertItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = ExpertItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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

}