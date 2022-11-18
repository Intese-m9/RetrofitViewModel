package com.example.mvvmretrofit.domain.adapter.viewpageradapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mvvmretrofit.presentation.fragment.second.SecondFragment
import com.example.mvvmretrofit.presentation.fragment.start.StartFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
             0 -> StartFragment()
            else -> SecondFragment()
        }
    }
}