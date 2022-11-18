package com.example.mvvmretrofit.presentation.fragment.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmretrofit.data.repository.Repository
import com.example.mvvmretrofit.domain.model.usd.CurrentUsd
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel:ViewModel() {

    var repository = Repository()//переменная доступа к репозиторию
    val moneyList: MutableLiveData<Response<CurrentUsd >> = MutableLiveData()//переменная списка

    fun getUsd(){
        viewModelScope.launch {
            moneyList.value = repository.getUSD()
        }
    }
}