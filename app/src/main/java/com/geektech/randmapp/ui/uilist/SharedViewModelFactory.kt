package com.geektech.randmapp.ui.uilist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.geektech.rickandmortyapp.api.BaseRepository

class SharedViewModelFactory(private val repository: BaseRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SharedViewModel(repository) as T
    }
}