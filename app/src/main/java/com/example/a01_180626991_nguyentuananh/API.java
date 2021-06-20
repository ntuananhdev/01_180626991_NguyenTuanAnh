package com.example.a01_180626991_nguyentuananh;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface API {
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();
    API apiService = new Retrofit.Builder()
            .baseUrl("https://60b1e7c562ab150017ae16c5.mockapi.io/api/ontapth01/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(API.class);

    @GET("Empoyees")
    Call<List<Bill>> findAll();

    @POST("Empoyees")
    Call<Bill> addEmployee(@Body Bill bill);


}
