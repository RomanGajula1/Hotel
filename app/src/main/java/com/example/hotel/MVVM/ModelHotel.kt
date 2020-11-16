package com.example.hotel.MVVM

import android.widget.ImageView
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "model")
class ModelHotel() {
    var name: String? = null
    var image: String? = null
    var descriptions: String? = null
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

    constructor(id: Int, name: String, image: String, descriptions: String) : this() {
        this.name = name
        this.image = image
        this.descriptions = descriptions
        this.id = id
    }

}