package com.example.wearherapp

sealed class Screen(val route: String) {
    object Home: Screen(route = "MainActivity")
    object Map: Screen(route = "MapActivity")
}

sealed class ResultState<out T>{
    data class Success<out R>(val data:R):ResultState<R>()
    data class Failure<out R>(val msg:Throwable):ResultState<Nothing>()
    object Loading : ResultState<Nothing>()
}