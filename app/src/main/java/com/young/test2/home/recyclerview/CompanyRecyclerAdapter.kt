package com.young.test2.home.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.young.test2.databinding.CompanyItemBinding
import com.young.test2.home.data.CompanyItem

class CompanyRecyclerAdapter: RecyclerView.Adapter<CompanyRecyclerAdapter.MyViewHolder>() {
    var items = arrayListOf<CompanyItem>()
    lateinit var binding: CompanyItemBinding
    inner class MyViewHolder(val binding: CompanyItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = CompanyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.data = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(data: ArrayList<CompanyItem>) {
        items = data
        notifyDataSetChanged()
    }
}