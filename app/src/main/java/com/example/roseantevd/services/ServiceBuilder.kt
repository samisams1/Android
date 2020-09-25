package com.example.roseantevd.services

import android.provider.ContactsContract.CommonDataKinds.Website.URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.gson.GsonConverterFactory.*
import retrofit2.http.Url
import java.lang.reflect.Type
import java.lang.reflect.TypeVariable
import java.nio.file.attribute.AclEntry

object ServiceBuilder {

    private const val URL = "http://10.0.2.2:3000/"

    // create OkHttp Client
    private val okHttp: OkHttpClient.Builder = OkHttpClient.Builder()

    // create val builder
    private val builder: Retrofit.Builder = Retrofit.Builder().baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp.build())

    // Create Retrofit Instance
    private val retrofit: Retrofit = builder.build()

    fun <T> buildService(serviceType: Class<T>):T{
        return  retrofit.create(serviceType)
    }



}
