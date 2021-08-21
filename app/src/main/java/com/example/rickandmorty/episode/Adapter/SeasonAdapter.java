package com.example.rickandmorty.episode.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rickandmorty.R;
import com.example.rickandmorty.episode.model.Season;

import java.util.List;

public class SeasonAdapter extends RecyclerView.Adapter<SeasonAdapter.SeasonViewHolder> {

    private List<Season> seasons;

    public SeasonAdapter(List<Season> seasons) {
        this.seasons = seasons;
        notifyDataSetChanged();
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

    @NonNull
    @Override
    public SeasonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_season_episode,parent,false);
        return new SeasonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SeasonViewHolder holder, int position) {
        Season season = seasons.get(position);
        holder.tvSeason.setText(season.getSeason());

    }

    @Override
    public int getItemCount() {
        if(seasons != null) {
            return seasons.size();
        }
        return 0;
    }

    public class SeasonViewHolder extends RecyclerView.ViewHolder {
        private TextView tvSeason;
        public SeasonViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSeason = itemView.findViewById(R.id.tv_season);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }
}
