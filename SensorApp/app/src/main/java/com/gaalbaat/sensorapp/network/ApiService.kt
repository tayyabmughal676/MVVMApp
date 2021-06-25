package com.gaalbaat.sensorapp.network

import com.gaalbaat.sensorapp.model.SensorModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("")
    fun getSensorData(): Call<MutableList<SensorModel>>
}