package com.example.hotel.MVVM

import android.widget.ImageView
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "model")
class ModelHotel() {
    @ColumnInfo(name = "name")
    var name: String? = null
    @ColumnInfo(name = "image")
    var image: String? = null
    @ColumnInfo(name = "descriptions")
    var descriptions: String? = null
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

    @Ignore
    constructor(id: Int, name: String, image: String, descriptions: String) : this() {
        this.name = name
        this.image = image
        this.descriptions = descriptions
        this.id = id
    }

}