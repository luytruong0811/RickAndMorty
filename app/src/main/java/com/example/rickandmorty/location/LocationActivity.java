package com.example.rickandmorty.location;

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
import com.example.rickandmorty.character.CharacterActivity;
import com.example.rickandmorty.character.CharacterAdapter;
import com.example.rickandmorty.character.CharacterViewModel;
import com.example.rickandmorty.episode.EpisodeActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LocationActivity extends AppCompatActivity {
    private ImageView ivFilter;
    private RecyclerView rvLocation;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        ivFilter = findViewById(R.id.iv_filter);

        rvLocation = findViewById(R.id.rv_location);
        setRecyclerViewLocation();

        bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setSelectedItemId(R.id.action_location);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_location:
                        return true;
                    case R.id.action_character:
                        startActivity(new Intent(getApplicationContext(), CharacterActivity.class));
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

    private void setRecyclerViewLocation() {
        rvLocation.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rvLocation.setLayoutManager(gridLayoutManager);

        LocationViewModel locationViewModel = new ViewModelProvider(this).get(LocationViewModel.class);
        LocationAdapter locationAdapter = new LocationAdapter(locationViewModel.getLocationsLiveData().getValue());

        locationViewModel.getLocationsLiveData().observe(this, characters -> {
            locationAdapter.notifyDataSetChanged();
        });

        rvLocation.setAdapter(locationAdapter);
    }
}