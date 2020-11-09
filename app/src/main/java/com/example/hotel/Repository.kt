package com.example.hotel

class Repository() {

    fun getListHotel(): ArrayList<ModelHotel> {
        val listHotel: ArrayList<ModelHotel> = ArrayList()
        listHotel.add(ModelHotel(0, "Elite Hotel", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionEliteHotel))
        listHotel.add(ModelHotel(1, "Astoria", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionAstoria))
        listHotel.add(ModelHotel(2, "VisPas", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionVisPas))
        listHotel.add(ModelHotel(3, "White House", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionWhiteHouse))
        listHotel.add(ModelHotel(4, "Leninstr", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionLeninstr))
        listHotel.add(ModelHotel(5, "LidoLux", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionLidoLux))
        listHotel.add(ModelHotel(6, "Gurman", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionGurman))
        listHotel.add(ModelHotel(7, "Paulina", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionPaulina))
        return listHotel
    }

}