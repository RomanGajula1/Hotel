package com.example.hotel.MVVM

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.example.hotel.Adapter
import com.example.hotel.Repository
import com.example.hotel.Room.DAO.HotelDAO
import com.example.hotel.Room.DataBase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class HotelsListViewModel(application: Application) : AndroidViewModel(application), KoinComponent {
    private val repository: Repository by inject()
    var readAllData: LiveData<ArrayList<ModelHotel>>? = null
    val adapter: Adapter = Adapter(null)
    init {
//        val db: DataBase = Room.databaseBuilder(application, DataBase::class.java, "database").allowMainThreadQueries().build()
//        var list: ArrayList<ModelHotel> = db.getMyDao()!!.allList()
        adapter.hotelsList = repository.getListHotel()
        adapter.notifyDataSetChanged()
    }

//    fun addHotel(modelHotel: ModelHotel){
//        viewModelScope.launch(Dispatchers.IO){
//            repository.addHotel(modelHotel)
//        }
//    }
}