package com.example.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.example.model.Ping200Response

interface DefaultApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *
     * @return [Call]<[Ping200Response]>
     */
    @GET("ping")
    fun ping(): Call<Ping200Response>

}
