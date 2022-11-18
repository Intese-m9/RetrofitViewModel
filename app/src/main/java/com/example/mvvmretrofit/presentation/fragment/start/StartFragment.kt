package com.example.mvvmretrofit.presentation.fragment.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofit.R
import com.example.mvvmretrofit.domain.adapter.startadapter.StartAdapter
import kotlinx.android.synthetic.main.fragment_start.view.*

class StartFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewModel = ViewModelProvider(this)[StartViewModel::class.java]//инициализация viewmodel
        val v = inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView = v.rv_start//инициализация RV
        adapter = StartAdapter()//инициализация adapter
        recyclerView.adapter = adapter
        viewModel.getRub()
        viewModel.moneyList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(listOf(it)) }
        }
        return v
    }
}