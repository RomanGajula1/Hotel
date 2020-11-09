package com.example.hotel

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HotelInfoViewModel() }
    single { Repository() }
    single { MainActivity() }
    single { HotelInfo() }
    viewModel { HotelsListViewModel() }
}