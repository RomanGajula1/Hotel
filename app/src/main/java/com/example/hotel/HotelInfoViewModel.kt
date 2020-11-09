package com.example.hotel

import android.content.Intent
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_hotel_info.view.*
import org.koin.core.Koin
import org.koin.core.KoinComponent
import org.koin.core.inject

class HotelInfoViewModel : ViewModel(), KoinComponent {
    private val repository: Repository by inject()
    var comments = MutableLiveData("")
    var nameMusic = MutableLiveData("")
    var descriptionText = MutableLiveData("")
    lateinit var photo : ImageView
    fun loadDetailsHotel(id: Int){
        nameMusic.value = repository.getListHotel()[id].name
        descriptionText.value = repository.getListHotel()[id].descriptions.toString()
        Picasso.get()
            .load(repository.getListHotel()[id].image)
            .into(photo)
    }
}