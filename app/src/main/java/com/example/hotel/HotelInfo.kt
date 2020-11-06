package com.example.hotel

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.hotel.databinding.ActivityHotelInfoBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


@Suppress("DEPRECATION")
class HotelInfo : AppCompatActivity() {

    private val viewModel by lazy { ViewModelProviders.of(this).get(MyViewModel::class.java) }
    val myViewModel : MyViewModel by viewModel()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_hotel_info)

        val binding : ActivityHotelInfoBinding = DataBindingUtil.setContentView(this, R.layout.activity_hotel_info)

        val intent = intent
        val nameHotel = intent.getStringExtra("nameHotel")
        val description = intent.getStringExtra("description")
        binding.NameHotel.text = nameHotel
        binding.descriptionText.text = description
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}