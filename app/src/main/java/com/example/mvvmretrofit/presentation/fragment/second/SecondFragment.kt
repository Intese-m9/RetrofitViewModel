package com.example.mvvmretrofit.presentation.fragment.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofit.R
import com.example.mvvmretrofit.domain.adapter.secondadapter.SecondAdapter
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewModel = ViewModelProvider(this)[SecondViewModel::class.java]//инициализация viewmodel
        val v =  inflater.inflate(R.layout.fragment_second, container, false)
        recyclerView = v.rv_second//инициализация RV
        adapter = SecondAdapter()//инициализация adapter
        recyclerView.adapter = adapter
        viewModel.getUsd()
        viewModel.moneyList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(listOf(it)) }
        }
        return v
    }
}