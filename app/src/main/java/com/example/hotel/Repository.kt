package com.example.hotel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.room.Database
import com.example.hotel.MVVM.ModelHotel
import com.example.hotel.Room.DAO.HotelDAO
import com.example.hotel.Room.DAO.IDAO
import com.example.hotel.Room.DataBase

class Repository(val hotelDao: HotelDAO) {

    fun getListHotel(): ArrayList<ModelHotel> {
        val listHotel: ArrayList<ModelHotel> = ArrayList()
        listHotel.add(ModelHotel(0, "Elite Hotel", "https://bestvietnam.ru/wp-content/uploads/2019/09/%D0%BE%D1%82%D0%B5%D0%BB%D1%8C.jpg", "Offering free Wi-Fi, Elite hotel is located in Balti, 50 metres from the main square and attractions. Free private Parking is available on site"))
        listHotel.add(ModelHotel(1, "Astoria", "https://delo360.ru/wp-content/uploads/upload/iblock/19b/19b53a81cd26ba2a474e8549d8b5230d.jpg", "Offering a bar, barbecue facilities and a terrace, ASTORIA boutique hotel is located in Belzi. It offers a restaurant, a 24-hour front Desk and free Wi-Fi throughout"))
        listHotel.add(ModelHotel(2, "VisPas", "https://q-xx.bstatic.com/xdata/images/hotel/max1024x768/95215007.jpg?k=038b960eb52c1fd4b5b21cb800e94e4bdf657dc7fc2ff937b80638c2bc1af8e2&o=", "Hotel Balas Balti offers a restaurant, bar, shared lounge and garden in Belzi. It offers family rooms and a terrace. Excellent rooms, clean, great food!"))
        listHotel.add(ModelHotel(3, "White House", "https://avatars.mds.yandex.net/get-zen_doc/1549204/pub_5e82443d8ccb2b5864349bb0_5e8244550d0caf3769291a08/scale_1200", "White house is located in the city of Balti. It offers rooms with free Wi-Fi and free private Parking. Beautiful Apartment!"))
        listHotel.add(ModelHotel(4, "Leninstr", "https://pix-feed.com/wp-content/uploads/2018/03/3.jpg", "Leninstr apartments with free Wi-Fi located in the city of Balti. Bike rental is available at the property. I really liked the apartment.Very good location."))
        listHotel.add(ModelHotel(5, "LidoLux", "https://pix-feed.com/wp-content/uploads/2018/03/3.jpg", "Located in Belti, hotel Lidolux offers free Wi-Fi, a restaurant, a fitness centre and a bar."))
        listHotel.add(ModelHotel(6, "Gurman", "https://avatars.mds.yandex.net/get-zen_doc/16074/pub_5b976ee5afa75b00a9930277_5b976fe904327700ab9a8f68/scale_1200", "Featuring free wifi, country house Gurman is located in Balti. Each room has a fully equipped private bathroom with a Hairdryer and a bidet."))
        listHotel.add(ModelHotel(7, "Paulina", "https://pic.voombu.ru/img/hotel/max1280x900/183/183111728.jpg", "The hotel Paulina is located in the town of Falesti. Free Wi-Fi is available. Each room here will provide you with air conditioning and a balcony. An electric kettle is also provided."))
        return listHotel
    }

}