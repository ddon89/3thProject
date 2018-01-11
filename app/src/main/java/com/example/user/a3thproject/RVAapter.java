package com.example.user.a3thproject;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RVAapter extends RecyclerView.Adapter<RVAapter.GameMap_ViewHolder> {

    List<GameMap_VO> game_maps;

    public RVAapter(List<GameMap_VO> game_maps) {
        this.game_maps = game_maps;
        Log.v("cardviewTest", "RVAapter IN");
    }//constructor

    @Override
    public GameMap_ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Log.v("cardviewTest", "onCreateViewHolder IN");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_map_cardview, viewGroup, false);
        GameMap_ViewHolder gameMap_viewHolder = new GameMap_ViewHolder(view);
        return gameMap_viewHolder;
    }

    @Override
    public void onBindViewHolder(GameMap_ViewHolder gameMap_viewHolder, int position) {
        Log.v("cardviewTest", "onBindViewHolder IN");
        gameMap_viewHolder.map_name.setText(game_maps.get(position).getMap_name());
        gameMap_viewHolder.master_name.setText(game_maps.get(position).getMap_name());
        gameMap_viewHolder.map_image.setImageResource(R.drawable.map_title_02);
    }

    @Override
    public int getItemCount() {
        Log.v("cardviewTest", "getItemCount IN : " + game_maps.size());
        return game_maps.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class GameMap_ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView map_name;
        TextView master_name;
        ImageView map_image;


        public GameMap_ViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardview);
            map_name = itemView.findViewById(R.id.map_name);
            master_name = itemView.findViewById(R.id.master_name);
            map_image = itemView.findViewById(R.id.ex_photo);
        }//constractor
    }//GameMap_ViewHolder




}//RVAapter
