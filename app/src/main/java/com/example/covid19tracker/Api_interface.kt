package com.example.covid19tracker

import retrofit2.Call
import retrofit2.http.GET

interface Api_interface {
    @GET("countries")
    fun getcountry_data(): Call<List<ModelClass?>?>?

    companion object {
        const val base_url = "https://corona.lmao.ninja/V3/covid-19/"
    }
}