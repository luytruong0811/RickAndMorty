package com.example.rickandmorty.character;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rickandmorty.R;

import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {

    private List<Character> characters;

    public CharacterAdapter(List<Character> characters) {
        this.characters = characters;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_character, parent,false);
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        Character character = characters.get(position);
        holder.ivAvt.setImageResource(character.getImage());
        holder.tvStatus.setText(character.getStatus());
        holder.tvName.setText(character.getName());
    }

    @Override
    public int getItemCount() {
        if(characters!= null) {
            return characters.size();
        }
        return 0;
    }

    public class CharacterViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivAvt;
        private TextView tvStatus, tvName;
        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAvt = itemView.findViewById(R.id.iv_avt);
            tvStatus = itemView.findViewById(R.id.tv_status);
            tvName = itemView.findViewById(R.id.tv_name);
        }
    }
}
