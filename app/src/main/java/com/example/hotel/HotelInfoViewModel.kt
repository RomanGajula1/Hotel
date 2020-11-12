package com.example.hotel

import android.content.Intent
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.core.text.parseAsHtml
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
    var nameHotel = String()
    var descriptionText = String()
    var photo = String()
    fun loadDetailsHotel(id: Int){
        nameHotel = repository.getListHotel()[id].name.toString()
        descriptionText = repository.getListHotel()[id].descriptions.toString()
        photo = repository.getListHotel()[id].image.toString()
    }
}