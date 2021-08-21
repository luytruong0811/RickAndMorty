package com.example.rickandmorty.character;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.rickandmorty.R;
import com.example.rickandmorty.episode.EpisodeActivity;
import com.example.rickandmorty.location.LocationActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CharacterActivity extends AppCompatActivity {
    private ImageView ivFilter;
    private RecyclerView rvCharacter;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        ivFilter = findViewById(R.id.iv_filter);
        rvCharacter = findViewById(R.id.rv_character);
        setRecyclerViewCharacter();
        bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setSelectedItemId(R.id.action_character);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_character:
                        return true;
                    case R.id.action_location:
                        startActivity(new Intent(getApplicationContext(), LocationActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.action_episode:
                        startActivity(new Intent(getApplicationContext(), EpisodeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    private void setRecyclerViewCharacter() {
        rvCharacter.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rvCharacter.setLayoutManager(gridLayoutManager);

        CharacterViewModel characterViewModel = new ViewModelProvider(this).get(CharacterViewModel.class);
        CharacterAdapter characterAdapter = new CharacterAdapter(characterViewModel.getCharactersLiveData().getValue());

        characterViewModel.getCharactersLiveData().observe(this, characters -> {
            characterAdapter.notifyDataSetChanged();
        });

        rvCharacter.setAdapter(characterAdapter);
    }
}