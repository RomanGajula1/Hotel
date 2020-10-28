package com.example.hotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hotel.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        val linearLayoutManager = LinearLayoutManager(applicationContext) // Чтобы использовать recyclerView, необходимо создать список LinearLayoutManager(это опрееделённая сетка)
//        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL // Задаём ему ориентацию
//        binding.recyclerView.layoutManager = linearLayoutManager
        val tags = ArrayList<String>()
        tags.add("Hotel_1")
        val adapter = Adapter(tags)
        binding.recyclerView.adapter = adapter









//        val task: TaskHotel = TaskHotel("Burger")
//        val adapter: AdapterTaskHotel = AdapterTaskHotel(task)


    }
}