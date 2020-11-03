package com.example.hotel

class Repository() {

    lateinit var listHotel: ArrayList<ModelHotel>

    fun getListHotel(){
//        listHotel: ArrayList<ModelHotel> = ArrayList()
        listHotel.add(ModelHotel("Hotel_1", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
        listHotel.add(ModelHotel("Hotel_2", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
        listHotel.add(ModelHotel("Hotel_3", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
        listHotel.add(ModelHotel("Hotel_4", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
        listHotel.add(ModelHotel("Hotel_5", "https://www.gstatic.com/webp/gallery/4.sm.jpg"))
    }

}