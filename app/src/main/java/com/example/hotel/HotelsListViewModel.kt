package com.example.hotel

import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent
import org.koin.core.inject

class HotelsListViewModel : ViewModel(), KoinComponent {
    private val repository: Repository by inject()
    val adapter: Adapter = Adapter(null)
    init {
        adapter.hotelsList = repository.getListHotel()
        adapter.notifyDataSetChanged()
    }
}