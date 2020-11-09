package com.example.hotel

import android.widget.ImageView

class ModelHotel() {
    var name: String? = null
    var image: String? = null
    var descriptions: Int? = null
    var id: Int? = null

    constructor(id: Int, name: String, image: String, descriptions: Int) : this() {
        this.name = name
        this.image = image
        this.descriptions = descriptions
        this.id = id
    }

}