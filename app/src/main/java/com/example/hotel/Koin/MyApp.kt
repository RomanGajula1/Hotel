package com.example.hotel.Koin

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.hotel.Room.DataBase
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    var instance: MyApp? = null
    lateinit var dataBase: DataBase

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule))
        }
    }
}