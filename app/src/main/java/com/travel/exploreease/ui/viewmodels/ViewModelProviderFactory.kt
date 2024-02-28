package com.travel.exploreease.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.travel.exploreease.domain.repositories.MainRepository

class ViewModelProviderFactory(
    private val repository: MainRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return MainViewModel(repository) as T
    }
}