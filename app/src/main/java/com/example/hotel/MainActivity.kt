package com.example.hotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hotel.MVVM.HotelsListViewModel
import com.example.hotel.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val instance: MainActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        val hotelsListViewModel : HotelsListViewModel by viewModel()
        super.onCreate(savedInstanceState)
        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = hotelsListViewModel.adapter


    }
}