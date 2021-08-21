package com.example.rickandmorty.episode.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rickandmorty.R;

public class ListDataAdapter extends RecyclerView.Adapter<ListDataAdapter.ListDataViewHolder> {
    @NonNull
    @Override
    public ListDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListDataViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListDataViewHolder extends RecyclerView.ViewHolder {
        private RecyclerView rvSeason;
        public ListDataViewHolder(@NonNull View itemView) {
            super(itemView);

            rvSeason = itemView.findViewById(R.id.rv_season);
        }
    }
}
