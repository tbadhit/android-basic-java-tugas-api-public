package com.tbadhit.tugasapipublic.api;

import com.tbadhit.tugasapipublic.model.ResponseGame;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("games")
    Call<ResponseGame> getListGame();
}
