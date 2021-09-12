package com.young.test2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<
        I: Any,
        B: ViewDataBinding>(
            private val layoutId: Int
        ): RecyclerView.Adapter<BaseAdapter<I, B>.MyViewHolder>() {

    var items: ArrayList<I> = arrayListOf()
    lateinit var binding: B

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),layoutId, parent, false)
        setViewSize()

        return MyViewHolder(binding)
    }

    open fun setViewSize(){}

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(data: ArrayList<I>) {
        items = data
        notifyDataSetChanged()
    }

    protected fun setSize(lp: ViewGroup.LayoutParams, width: Int, height: Int) {
        lp.width = width
        lp.height = height
    }

    inner class MyViewHolder(val binding: B): RecyclerView.ViewHolder(binding.root)
}