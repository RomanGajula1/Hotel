package com.example.hotel

import android.widget.ImageView

class ModelHotel() {
    var name: String? = null
    var image: String? = null
    var descriptions: String? = null
    var id: Int? = null

    constructor(id: Int, name: String, image: String, descriptions: String) : this() {
        this.name = name
        this.image = image
        this.descriptions = descriptions
        this.id = id
    }

}