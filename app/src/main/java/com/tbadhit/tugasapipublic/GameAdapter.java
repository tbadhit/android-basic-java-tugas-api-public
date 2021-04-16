package com.tbadhit.tugasapipublic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.tbadhit.tugasapipublic.model.ResultsItem;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.MyViewHolder> {

    private List<ResultsItem> resultsItemList;

    public GameAdapter(List<ResultsItem> resultsItemList) {
        this.resultsItemList = resultsItemList;
    }


    @NonNull
    @Override
    public GameAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_game, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.MyViewHolder holder, int position) {
        holder.tvJudul.setText(resultsItemList.get(position).getName());
        holder.tvRating.setText(String.valueOf(resultsItemList.get(position).getRating()));
        holder.tvJudul.setText(resultsItemList.get(position).getReleased());
        Glide.with(holder.itemView).load(resultsItemList.get(position).getBackgroundImage())
                .error(R.drawable.ic_launcher_background)
                .into(holder.imageGame);
    }

    @Override
    public int getItemCount() {
        return resultsItemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageGame;
        TextView tvJudul, tvRating, tvRelease;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageGame = itemView.findViewById(R.id.item_img_game);
            tvJudul = itemView.findViewById(R.id.item_tv_judul);
            tvRating = itemView.findViewById(R.id.item_tv_rating);
            tvRelease = itemView.findViewById(R.id.item_tv_release);
        }
    }
}
