package com.tbadhit.tugasapipublic.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiConfig {
    private static String baseURL = "https://api.rawg.io/api/";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static ApiService service = retrofit.create(ApiService.class);
}
