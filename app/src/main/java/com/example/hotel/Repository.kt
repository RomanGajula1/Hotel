package com.example.hotel

class Repository() {

    fun getListHotel(): ArrayList<ModelHotel> {
        var listHotel: ArrayList<ModelHotel> = ArrayList()
        listHotel.add(ModelHotel("Elite Hotel", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionEliteHotel))
        listHotel.add(ModelHotel("Astoria", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionAstoria))
        listHotel.add(ModelHotel("VisPas", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionVisPas))
        listHotel.add(ModelHotel("White House", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionWhiteHouse))
        listHotel.add(ModelHotel("Leninstr", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionLeninstr))
        listHotel.add(ModelHotel("LidoLux", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionLidoLux))
        listHotel.add(ModelHotel("Gurman", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionGurman))
        listHotel.add(ModelHotel("Paulina", "https://www.gstatic.com/webp/gallery/4.sm.jpg", R.string.descriptionPaulina))
        return listHotel
    }

}