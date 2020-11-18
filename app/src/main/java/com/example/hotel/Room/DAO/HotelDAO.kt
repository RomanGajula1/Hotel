package com.example.hotel.Room.DAO

import androidx.lifecycle.LiveData
import com.example.hotel.MVVM.ModelHotel
import com.example.hotel.Repository

class HotelDAO : IDAO {

    override fun allList(): LiveData<List<ModelHotel>> {
        val repository: Repository? = null
        return repository!!.getAllHotel()
    }

    override fun create(modelHotel: ModelHotel) {

    }

    override fun update() {

    }

    override fun deleteHotel(id: Int) {
        Repository().getAllHotel()
    }

}