package com.example.hotel

import android.content.Context
import android.content.Intent
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide.init
import com.squareup.picasso.Picasso


class Adapter(var hotelsList: ArrayList<ModelHotel>?) : RecyclerView.Adapter<Adapter.MyViewHolder>(){

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) { // MyViewHolder хранит тэги корнегого представления каждого элемента списка.
        val nameHotel: TextView = view.findViewById<View>(R.id.nameHotel) as TextView
        val imageView: ImageView = view.findViewById<View>(R.id.imageView) as ImageView
        val description: ModelHotel = ModelHotel()

        init {
            view.setOnClickListener{
                val intent = Intent(view.context, HotelInfo::class.java)
                intent.putExtra("nameHotel", nameHotel.text.toString())
                intent.putExtra("description", description.descriptions)
                view.context.startActivity(intent)
            }
        }
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder { // Создает экземпляр файла макета элемента и владельца представления. OnBindViewHolder – загружает данные в указанной позиции в представления, ссылки на которые хранятся в заданном заполнителе представления.
        val itemsView: View = LayoutInflater.from(parent.context) // LayoutInflater – это класс, который умеет из содержимого layout-файла создать View-элемент. Метод который это делает называется inflate.
        .inflate(R.layout.taskhotel, parent, false)
        return MyViewHolder(itemsView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) { // выполняет привязку объекта
        val itemText: ModelHotel = hotelsList!![position]
        holder.nameHotel.text = itemText.name

        Picasso.get()
            .load(hotelsList!![position].image)
            .error(R.drawable.rotate)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return hotelsList?.size ?: 0
    }

}
