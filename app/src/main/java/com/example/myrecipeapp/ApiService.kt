package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// 4 - Instantiate Retrofit
private val retrofit = Retrofit.Builder()
    .baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

// 5 - Attach api interface
val recipeService = retrofit.create(ApiService::class.java)

// 3 - Define API Interface
interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}