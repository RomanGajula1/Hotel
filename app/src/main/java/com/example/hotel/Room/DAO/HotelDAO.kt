package com.example.hotel.Room.DAO

import com.example.hotel.MVVM.ModelHotel
import com.example.hotel.Repository

class HotelDAO : IDAO {

    override fun allList(repository: Repository): ArrayList<ModelHotel> {
        return repository.getListHotel()
    }

    override fun create() {

    }

    override fun update() {

    }

    override fun deleteHotel(id: Int) {
        Repository().getListHotel()[id].id = null
    }

}