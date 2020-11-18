package com.example.hotel

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hotel.MVVM.HotelsListViewModel
import com.example.hotel.MVVM.ModelHotel
import com.example.hotel.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var hotelsListViewModel : HotelsListViewModel = HotelsListViewModel(applicationContext as Application)
        super.onCreate(savedInstanceState)
        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = hotelsListViewModel.adapter

        hotelsListViewModel = ViewModelProvider(this).get(HotelsListViewModel::class.java)
        hotelsListViewModel.getListHotel()?.observe(this, Observer {user ->
            hotelsListViewModel.adapter.setHotel(user)
        })

    }
}