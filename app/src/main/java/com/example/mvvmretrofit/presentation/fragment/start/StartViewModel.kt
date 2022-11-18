package com.example.mvvmretrofit.presentation.fragment.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmretrofit.data.repository.Repository
import com.example.mvvmretrofit.domain.model.rub.CurrentRub
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {
    //переменная списка
    var repository = Repository()//переменная доступа к репозиторию

    val moneyList: MutableLiveData<Response<CurrentRub >> = MutableLiveData()//переменная списка


    fun getRub(){
        viewModelScope.launch {
            moneyList.value = repository.getRUB()
        }
    }

}