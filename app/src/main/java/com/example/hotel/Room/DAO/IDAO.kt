package com.example.hotel.Room.DAO

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.hotel.MVVM.ModelHotel
import com.example.hotel.Repository

@Dao
interface IDAO {
    @Query("SELECT * FROM model")
    fun allList() : ArrayList<ModelHotel>
    @Insert
    fun create(modelHotel: ModelHotel)
    @Update
    fun update()
    @Delete
    fun deleteHotel(id: Int)


}