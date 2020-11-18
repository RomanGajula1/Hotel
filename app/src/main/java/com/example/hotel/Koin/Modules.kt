package com.example.hotel.Koin

import com.example.hotel.HotelInfo
import com.example.hotel.MVVM.HotelInfoViewModel
import com.example.hotel.MVVM.HotelsListViewModel
import com.example.hotel.MainActivity
import com.example.hotel.Repository
import com.example.hotel.Room.DAO.HotelDAO
import com.example.hotel.Room.DataBase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HotelInfoViewModel() }
    single { Repository() }
    single { MainActivity() }
    single { HotelInfo() }
    single { DataBase::class.java }
    single { HotelDAO() }
}