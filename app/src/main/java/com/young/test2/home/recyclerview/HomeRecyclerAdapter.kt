package com.young.test2.home.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.young.test2.R
import com.young.test2.databinding.*
import com.young.test2.home.data.HomeRecyclerItem
import com.young.test2.home.data.CompanyList
import com.young.test2.home.data.ConsultItem
import com.young.test2.home.data.ExpertList
import com.young.test2.utils.Constants.COMPANY_TYPE
import com.young.test2.utils.Constants.CONSULT_TYPE
import com.young.test2.utils.Constants.EXPERT_TYPE
import java.lang.RuntimeException



class HomeRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var items: ArrayList<HomeRecyclerItem> = arrayListOf()

    lateinit var companyListBinding: CompanyListBinding
    lateinit var consultItemBinding: ConsultItemBinding
    lateinit var expertListBinding: ExpertListBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            CONSULT_TYPE -> {
                consultItemBinding = ConsultItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                ConsultViewHolder(consultItemBinding)
            }

            EXPERT_TYPE -> {
                expertListBinding = ExpertListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                ExpertViewHolder(expertListBinding)
            }

            COMPANY_TYPE -> {
                companyListBinding = CompanyListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                CompanyViewHolder(companyListBinding)
            }
            else -> {
                throw RuntimeException("viewType error")
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].viewType
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is ConsultViewHolder) {
            holder.binding.data = items[position] as ConsultItem
        } else if (holder is ExpertViewHolder) {
            holder.binding.data = items[position] as ExpertList
        } else if (holder is CompanyViewHolder){
            holder.binding.data = items[position] as CompanyList
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(data: ArrayList<HomeRecyclerItem>) {
        items = data
        notifyDataSetChanged()
    }
    inner class CompanyViewHolder(val binding: CompanyListBinding): RecyclerView.ViewHolder(binding.root)
    inner class ExpertViewHolder(val binding: ExpertListBinding): RecyclerView.ViewHolder(binding.root)
    inner class ConsultViewHolder(val binding: ConsultItemBinding): RecyclerView.ViewHolder(binding.root)
}