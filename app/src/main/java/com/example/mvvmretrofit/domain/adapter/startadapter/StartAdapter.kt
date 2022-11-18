package com.example.mvvmretrofit.domain.adapter.startadapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofit.R
import com.example.mvvmretrofit.domain.model.rub.CurrentRub
import com.example.mvvmretrofit.domain.model.rub.Quotes
import kotlinx.android.synthetic.main.item_money_layout.view.*
import retrofit2.Response

class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<CurrentRub>()//list add this data

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].source
        holder.itemView.item_sale.text = listStart[position].quotes.RUBEUR.toString()
        holder.itemView.item_sale2.text = listStart[position].quotes.RUBUSD.toString()
    }

    override fun getItemCount(): Int {
        return listStart.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CurrentRub>){
        listStart = list
        notifyDataSetChanged()
    }
}