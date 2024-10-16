package com.kcals.geographica.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kcals.geographica.model.Country
import com.kcals.geographica.network.APIRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CountryVM @Inject constructor(private val repository: APIRepository) : ViewModel() {

    private val _countries = MutableLiveData<List<Country>>()
    val countries : LiveData<List<Country>> get() = _countries

    fun getCountries() {
        viewModelScope.launch {
            try {
                val countryList = repository.getCountries()
                countryList.let {
                    _countries.postValue(it)
                }
            } catch (e: Exception) {
                    Log.e("VM", e.message.toString())
            }
        }
    }
}