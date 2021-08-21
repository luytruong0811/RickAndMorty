package com.example.rickandmorty.episode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.rickandmorty.R;
import com.example.rickandmorty.character.CharacterActivity;
import com.example.rickandmorty.episode.Adapter.EpisodeAdapter;
import com.example.rickandmorty.episode.Adapter.SeasonAdapter;
import com.example.rickandmorty.episode.ViewModel.EpisodeViewModel;
import com.example.rickandmorty.episode.model.Season;
import com.example.rickandmorty.location.LocationActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class EpisodeActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private RecyclerView rvEpisode;
    private List<Season> listSeason;
    private SeasonAdapter seasonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode);

        bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setSelectedItemId(R.id.action_episode);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_episode:
                        return true;
                    case R.id.action_location:
                        startActivity(new Intent(getApplicationContext(), LocationActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.action_character:
                        startActivity(new Intent(getApplicationContext(), CharacterActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        rvEpisode = findViewById(R.id.rv_episode);
        rvEpisode.setHasFixedSize(true);
        EpisodeViewModel episodeViewModel = new ViewModelProvider(this).get(EpisodeViewModel.class);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvEpisode.setLayoutManager(linearLayoutManager);
        episodeViewModel.getListSeasonLiveData().observe(this, seasons -> {
            rvEpisode.setVisibility(View.VISIBLE);
            listSeason = new ArrayList<>();
            listSeason.addAll(seasons);
            if(seasonAdapter == null ) {
                seasonAdapter = new SeasonAdapter(seasons);
                rvEpisode.setAdapter(seasonAdapter);
            }
            seasonAdapter.setSeasons(seasons);
        });
    }
}
