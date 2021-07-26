package ru.geekbrains.androidwithkotlin.model.repository

import ru.geekbrains.androidwithkotlin.model.data.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}