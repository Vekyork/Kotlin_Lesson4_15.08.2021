package ru.geekbrains.androidwithkotlin.model.repository

import ru.geekbrains.androidwithkotlin.model.data.Weather

class RepositoryImpl : Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorage(): Weather {
        return Weather()
    }
}