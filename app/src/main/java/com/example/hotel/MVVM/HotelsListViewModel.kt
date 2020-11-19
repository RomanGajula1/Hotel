package com.example.hotel.MVVM

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.example.hotel.Adapter
import com.example.hotel.Koin.MyApp
import com.example.hotel.Repository
import com.example.hotel.Room.DAO.HotelDAO
import com.example.hotel.Room.DataBase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class HotelsListViewModel(application: Application) : AndroidViewModel(application), KoinComponent {
    private val repository: Repository by inject()
    var readAllData: LiveData<List<ModelHotel>>? = null
    var adapter: Adapter = Adapter(null)
    lateinit var myApp: MyApp
    init {
        readAllData = myApp.instasce.hotelDao?.allList()
    }

    fun getListHotel() : LiveData<List<ModelHotel>>? {
        return readAllData
    }
}