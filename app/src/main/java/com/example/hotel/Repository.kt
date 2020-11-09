package com.example.hotel

class Repository() {

    fun getListHotel(): ArrayList<ModelHotel> {
        val listHotel: ArrayList<ModelHotel> = ArrayList()
        listHotel.add(ModelHotel(0, "Elite Hotel", "https://www.gstatic.com/webp/gallery/4.sm.jpg", "Offering free Wi-Fi, Elite hotel is located in Balti, 50 metres from the main square and attractions. Free private Parking is available on site"))
        listHotel.add(ModelHotel(1, "Astoria", "https://www.gstatic.com/webp/gallery/4.sm.jpg", "Offering a bar, barbecue facilities and a terrace, ASTORIA boutique hotel is located in Belzi. It offers a restaurant, a 24-hour front Desk and free Wi-Fi throughout"))
        listHotel.add(ModelHotel(2, "VisPas", "https://www.gstatic.com/webp/gallery/4.sm.jpg", "Hotel Balas Balti offers a restaurant, bar, shared lounge and garden in Belzi. It offers family rooms and a terrace. Excellent rooms, clean, great food!"))
        listHotel.add(ModelHotel(3, "White House", "https://www.gstatic.com/webp/gallery/4.sm.jpg", "White house is located in the city of Balti. It offers rooms with free Wi-Fi and free private Parking. Beautiful Apartment!"))
        listHotel.add(ModelHotel(4, "Leninstr", "https://www.gstatic.com/webp/gallery/4.sm.jpg", "Leninstr apartments with free Wi-Fi located in the city of Balti. Bike rental is available at the property. I really liked the apartment.Very good location."))
        listHotel.add(ModelHotel(5, "LidoLux", "https://www.gstatic.com/webp/gallery/4.sm.jpg", "Located in Belti, hotel Lidolux offers free Wi-Fi, a restaurant, a fitness centre and a bar."))
        listHotel.add(ModelHotel(6, "Gurman", "https://www.gstatic.com/webp/gallery/4.sm.jpg", "Featuring free wifi, country house Gurman is located in Balti. Each room has a fully equipped private bathroom with a Hairdryer and a bidet."))
        listHotel.add(ModelHotel(7, "Paulina", "https://www.gstatic.com/webp/gallery/4.sm.jpg", "The hotel Paulina is located in the town of Falesti. Free Wi-Fi is available. Each room here will provide you with air conditioning and a balcony. An electric kettle is also provided."))
        return listHotel
    }

}