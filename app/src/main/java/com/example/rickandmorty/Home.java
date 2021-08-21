package com.example.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rickandmorty.character.CharacterActivity;

public class Home extends AppCompatActivity {
    private TextView tvStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvStart = findViewById(R.id.tv_start);

        tvStart.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, CharacterActivity.class);
            startActivity(intent);
            finish();
        });
    }
}