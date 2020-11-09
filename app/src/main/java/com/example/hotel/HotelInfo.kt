package com.example.hotel

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.hotel.databinding.ActivityHotelInfoBinding
import com.squareup.picasso.Picasso
import org.koin.androidx.viewmodel.ext.android.viewModel


@Suppress("DEPRECATION")
class HotelInfo : AppCompatActivity() {

    val hotelInfoViewModel : HotelInfoViewModel by viewModel()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityHotelInfoBinding = DataBindingUtil.setContentView(this, R.layout.activity_hotel_info)

        var id = intent.getIntExtra("id", 0)

        hotelInfoViewModel.loadDetailsHotel(id)

        binding.lifecycleOwner = this
        binding.viewModel = hotelInfoViewModel
    }
}