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


    lateinit var listItemHotel: List<ModelHotel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val linearLayoutManager = LinearLayoutManager(applicationContext) // Чтобы использовать recyclerView, необходимо создать список LinearLayoutManager(это опрееделённая сетка)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL // Задаём ему ориентацию
        binding.recyclerView.layoutManager = linearLayoutManager

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val listHotel: ArrayList<ModelHotel> = ArrayList()
        listHotel.add(ModelHotel("Hotel_1", "https://www.freestockimages.ru/architecture?pgid=ivwn77kz-fcef5588-5394-4fde-96a4-377d7584ebba"))
//        listHotel.add(ModelHotel("Hotel_2", R.drawable.ford_mustang_bullitt_2019_2))
//        listHotel.add(ModelHotel("Hotel_3", R.drawable.ford_mustang_bullitt_2019_2))
//        listHotel.add(ModelHotel("Hotel_4", R.drawable.ford_mustang_bullitt_2019_2))
//        listHotel.add(ModelHotel("Hotel_5", R.drawable.ford_mustang_bullitt_2019_2))
        val adapter = Adapter(listHotel)
        recyclerView.adapter = adapter











//        val tags: ArrayList<String> = ArrayList()
////        tags.add("Hotel_1")
////        tags.add("Hotel_2")
//        val adapter = Adapter(tags)
//        binding.recyclerView.adapter = adapter
//        val hotelsList = listOf(
//            ModelHotel("hotel1"),
//            ModelHotel("hotel2"),
//            ModelHotel("hotel3"),
//            ModelHotel("hotel4"),
//            ModelHotel("hotel5")
//        )

    }
}