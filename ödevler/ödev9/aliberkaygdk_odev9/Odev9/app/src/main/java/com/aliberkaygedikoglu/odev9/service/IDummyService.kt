package com.aliberkaygedikoglu.odev9.service

import com.aliberkaygedikoglu.odev9.model.Products
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface IDummyService {

    @GET("products")
    fun getProducts(@Query("limit") limit:Int,@Query("skip") skip:Int):Call<Products>

}