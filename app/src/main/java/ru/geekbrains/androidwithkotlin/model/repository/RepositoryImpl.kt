package ru.geekbrains.androidwithkotlin.model.repository

import ru.geekbrains.androidwithkotlin.model.data.Weather
import ru.geekbrains.androidwithkotlin.model.data.getRussianCities
import ru.geekbrains.androidwithkotlin.model.data.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorageRus(): List<Weather> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalStorageWorld(): List<Weather> {
        return getWorldCities()
    }
}