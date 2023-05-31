package com.example.coinstatsapp_v1.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coinstatsapp_v1.data.model.CoinModel
import com.example.coinstatsapp_v1.data.repository.CoinRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoinViewModel @Inject constructor(private val repository: CoinRepository) : ViewModel() {

    var coins: MutableLiveData<List<CoinModel>> = MutableLiveData()

    fun installAllCoins() {
        viewModelScope.launch {
            repository.getAllCoins().body()?.coins.let {
                coins.postValue(it)
            }
        }
    }
}