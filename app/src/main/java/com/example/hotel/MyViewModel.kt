package com.example.hotel

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent
import org.koin.core.inject


class MyViewModel : ViewModel(), KoinComponent {
    var context: Context = MainActivity()
    var comments = MutableLiveData("")
    private val repository: Repository by inject()
    val adapter: Adapter = Adapter(null)
    init {
        adapter.hotelsList = repository.getListHotel()
        adapter.notifyDataSetChanged()
    }

}