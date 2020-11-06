package com.example.hotel

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MyViewModel() }
    single { Repository() }
    single { MainActivity() }
    single { HotelInfo() }
}