package com.example.hotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hotel.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        val myViewModel : ViewModel by viewModel()

        super.onCreate(savedInstanceState)
        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        var viewModel = MyViewModel()
        recyclerView.adapter = viewModel.adapter


    }
}