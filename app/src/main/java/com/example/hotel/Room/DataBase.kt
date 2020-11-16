package com.example.hotel.Room

import android.content.Context
import androidx.room.CoroutinesRoom
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.bumptech.glide.load.model.Model
import com.example.hotel.Repository
import com.example.hotel.Room.DAO.IDAO
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@Database(entities = [Model::class], version = 1)
abstract class DataBase : RoomDatabase() {

    abstract fun getMyDao(): IDAO?

    companion object {
        @Volatile
        private var INSTANCE: DataBase? = null

        fun getDataBase(context: Context) : DataBase {

            val Instance = INSTANCE
            if (Instance != null){
                return Instance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DataBase::class.java,
                    "database").build()
                INSTANCE = instance
                return instance
            }


        }
    }
}