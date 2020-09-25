package com.example.roseantevd.services

import com.example.roseantevd.models.Pin
import com.example.roseantevd.models.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface DestinationService {
    @GET("pin")
    fun getPinList(): Call<List<Pin>>

    @POST("/")
    fun  addUser(@Body  newUser:User) :Call<User>


}