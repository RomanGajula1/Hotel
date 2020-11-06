package com.example.hotel

import android.app.Application
import android.content.Context
import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent
import org.koin.core.inject
import org.w3c.dom.Comment


class MyViewModel : ViewModel(), KoinComponent {
    val context: Context = MainActivity()
    var Comments = MutableLiveData("")
    var comment: LiveData<String> = Comments
    private val repository: Repository by inject()
    val adapter: Adapter = Adapter(null)
    init {
        adapter.hotelsList = repository.getListHotel()
        adapter.notifyDataSetChanged()

    }
}