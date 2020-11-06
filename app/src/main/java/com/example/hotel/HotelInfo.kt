package com.example.hotel

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hotel.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_hotel_info.*
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class HotelInfo : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_info)

//        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_hotel_info)

        val intent = intent
        val nameHotel = intent.getStringExtra("nameHotel")
        val description = intent.getStringExtra("description")
        NameHotel.text = nameHotel
        descriptionText.text = description

    }
}