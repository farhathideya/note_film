package com.example.note_film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class movies extends AppCompatActivity {
    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        img=(ImageView) findViewById(R.id.outer_banks);
        img.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,outer_banks.class);
            startActivity(intent);
        });
        txt=(TextView) findViewById(R.id.outerBanks);
        txt.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,outer_banks.class);
            startActivity(intent);
        });
        img=(ImageView) findViewById(R.id.all_of_us_are_dead);
        img.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,all_of_as_are_dead.class);
            startActivity(intent);
        });
        txt=(TextView) findViewById(R.id.allofusaredead);
        txt.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,all_of_as_are_dead.class);
            startActivity(intent);
        });
        img=(ImageView) findViewById(R.id.la_casa_de_papel);
        img.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,casa.class);
            startActivity(intent);
        });
        txt=(TextView) findViewById(R.id.lacasadepapel);
        txt.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,casa.class);
            startActivity(intent);
        });
        img=(ImageView) findViewById(R.id.peaky_blinders);
        img.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,peaky.class);
            startActivity(intent);
        });
        txt=(TextView) findViewById(R.id.peakyblinders);
        txt.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,peaky.class);
            startActivity(intent);
        });
        img=(ImageView) findViewById(R.id.vinkings);
        img.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,vinkings.class);
            startActivity(intent);
        });
        txt=(TextView) findViewById(R.id.textvinkings);
        txt.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,vinkings.class);
            startActivity(intent);
        });
        img=(ImageView) findViewById(R.id.demon_slayer);
        img.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,demon_slayer.class);
            startActivity(intent);
        });
        txt=(TextView) findViewById(R.id.demonslayer);
        txt.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,demon_slayer.class);
            startActivity(intent);
        });
        img=(ImageView) findViewById(R.id.parasyte);
        img.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,parasyte.class);
            startActivity(intent);
        });
        txt=(TextView) findViewById(R.id.textparasyte);
        txt.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,parasyte.class);
            startActivity(intent);
        });
        img=(ImageView) findViewById(R.id.dahmer);
        img.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,dahmer.class);
            startActivity(intent);
        });
        txt=(TextView) findViewById(R.id.textdahmer);
        txt.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,dahmer.class);
            startActivity(intent);
        });
        img=(ImageView) findViewById(R.id.valkyrie_apocalypse);
        img.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,valkyrie.class);
            startActivity(intent);
        });
        txt=(TextView) findViewById(R.id.valkyrie);
        txt.setOnClickListener(v -> {
            Intent intent = new Intent(movies.this,valkyrie.class);
            startActivity(intent);
        });


    }
}