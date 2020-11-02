package com.example.hotel

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.hotel.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso


class Adapter(private var hotelsList: ArrayList<ModelHotel>) : RecyclerView.Adapter<Adapter.MyViewHolder>(){
//
//    lateinit var context: Context
//
//    var binding : ActivityMainBinding = DataBindingUtil.setContentView(context as Activity, R.layout.activity_main)

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) { // MyViewHolder хранит тэги корнегого представления каждого элемента списка.
        val taskHotel: TextView = view.findViewById<View>(R.id.nameHotel) as TextView
        val imageView: ImageView = view.findViewById<View>(R.id.imageView) as ImageView
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder { // Создает экземпляр файла макета элемента и владельца представления. OnBindViewHolder – загружает данные в указанной позиции в представления, ссылки на которые хранятся в заданном заполнителе представления.
        val itemsView: View = LayoutInflater.from(parent.context) // LayoutInflater – это класс, который умеет из содержимого layout-файла создать View-элемент. Метод который это делает называется inflate.
        .inflate(R.layout.taskhotel, parent, false)
        return MyViewHolder(itemsView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) { // выполняет привязку объекта
        val itemText: ModelHotel = hotelsList[position]
        holder.taskHotel.text = itemText.name

        Picasso.get()
            .load(hotelsList[position].image)
            .error(R.drawable.rotate)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return hotelsList.size
    }

}