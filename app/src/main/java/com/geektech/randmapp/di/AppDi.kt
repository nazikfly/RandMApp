package com.geektech.randmapp.di

import com.geektech.randmapp.ui.home.HomeViewModel
import com.geektech.randmapp.ui.uilist.SharedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    viewModel {
        HomeViewModel(get())
    }
    viewModel {
        SharedViewModel(get())

    }
}
