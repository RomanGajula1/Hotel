package com.example.hotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hotel.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val linearLayoutManager = LinearLayoutManager(applicationContext) // Чтобы использовать recyclerView, необходимо создать список LinearLayoutManager(это опрееделённая сетка)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL // Задаём ему ориентацию
        binding.recyclerView.layoutManager = linearLayoutManager

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

//        val listHotel: ArrayList<ModelHotel> = ArrayList()
//        listHotel.add(ModelHotel("Hotel_1", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
//        listHotel.add(ModelHotel("Hotel_2", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
//        listHotel.add(ModelHotel("Hotel_3", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
//        listHotel.add(ModelHotel("Hotel_4", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
//        listHotel.add(ModelHotel("Hotel_5", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
        var viewModel = ViewModel()
        recyclerView.adapter = viewModel.adapter


    }
}