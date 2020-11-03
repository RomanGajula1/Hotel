package com.example.hotel

class ViewModel {
    lateinit var repository: Repository
    var adapter: Adapter = Adapter(repository.listHotel)
}