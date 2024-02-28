package com.travel.exploreease.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.travel.exploreease.data.models.GetCafes
import com.travel.exploreease.data.models.GetExperiences
import com.travel.exploreease.domain.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: MainRepository
) : ViewModel() {

    private val _getCafes: MutableLiveData<GetCafes> = MutableLiveData<GetCafes>()
    val cafes: LiveData<GetCafes> = _getCafes

    private val _getExperiences: MutableLiveData<GetExperiences> = MutableLiveData<GetExperiences>()
    val experiences: LiveData<GetExperiences> = _getExperiences

    init {
        getCafes()
        getExperiences()
    }

    private fun getCafes() {
        viewModelScope.launch {
            val response = repository.getCafes()
            if (response.isSuccessful) {
                _getCafes.postValue(response.body())
            }
        }
    }

    private fun getExperiences() {
        viewModelScope.launch {
            val response = repository.getExperiences()
            if (response.isSuccessful) {
                _getExperiences.postValue(response.body())
            }
        }
    }
}