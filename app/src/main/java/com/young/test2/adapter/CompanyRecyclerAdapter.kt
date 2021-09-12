package com.young.test2.adapter

import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.young.test2.databinding.CompanyItemBinding
import com.young.test2.data.CompanyItem
import com.young.test2.utils.Display
import com.young.test2.utils.Display.getWidth

class CompanyRecyclerAdapter: RecyclerView.Adapter<CompanyRecyclerAdapter.MyViewHolder>() {
    var items = arrayListOf<CompanyItem>()
    lateinit var binding: CompanyItemBinding
    inner class MyViewHolder(val binding: CompanyItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = CompanyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        val width = (getWidth()*0.8).toInt()
        val height = (width*0.7).toInt()
        setSize(binding.companyImageView.layoutParams, width, height)

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

    private fun setSize(lp: ViewGroup.LayoutParams, width: Int, height: Int) {
        lp.width = width
        lp.height = height
    }
}