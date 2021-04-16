package com.tbadhit.tugasapipublic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.tbadhit.tugasapipublic.api.ApiConfig;
import com.tbadhit.tugasapipublic.model.ResponseGame;
import com.tbadhit.tugasapipublic.model.ResultsItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvGame = findViewById(R.id.rv_blog);
        rvGame.setHasFixedSize(true);
        rvGame.setLayoutManager(new LinearLayoutManager(this));

        ApiConfig.service.getListGame().enqueue(new Callback<ResponseGame>() {
            @Override
            public void onResponse(Call<ResponseGame> call, Response<ResponseGame> response) {
                if (response.isSuccessful()) {
                    ResponseGame responseGame = response.body();

                    List<ResultsItem> dataGame = responseGame.getResults();

                    GameAdapter gameAdapter = new GameAdapter(dataGame);
                    gameAdapter.notifyDataSetChanged();
                    rvGame.setAdapter(gameAdapter);

                }
            }

            @Override
            public void onFailure(Call<ResponseGame> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}