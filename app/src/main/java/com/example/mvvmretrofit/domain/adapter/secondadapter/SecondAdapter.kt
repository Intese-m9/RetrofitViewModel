package com.example.mvvmretrofit.domain.adapter.secondadapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofit.R
import com.example.mvvmretrofit.domain.model.usd.CurrentUsd
import kotlinx.android.synthetic.main.item_money_layout.view.*
import kotlinx.coroutines.NonDisposableHandle
import kotlinx.coroutines.NonDisposableHandle.parent

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.StartViewHolder>() {

    var listSecond = emptyList<CurrentUsd>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listSecond[position].source
        holder.itemView.item_sale.text = listSecond[position].quotes.USDEUR.toString()
        holder.itemView.item_sale2.text = listSecond[position].quotes.USDRUB.toString()
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CurrentUsd>){
        listSecond = list
        notifyDataSetChanged()
    }
}