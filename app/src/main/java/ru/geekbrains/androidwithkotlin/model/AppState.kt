package ru.geekbrains.androidwithkotlin.model

sealed class AppState {
    data class Success(val weatherData: String) : AppState()
    class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
