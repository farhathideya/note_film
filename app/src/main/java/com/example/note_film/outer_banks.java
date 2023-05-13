package com.example.note_film;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;


public class outer_banks extends AppCompatActivity  {

        RatingBar ratingBar;
        ImageView CropImageView;
        Button btn;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_outer_banks);

            ratingBar = (RatingBar) findViewById(R.id.ratingBar);
            btn = (Button) findViewById(R.id.submit);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s = String.valueOf(ratingBar.getRating());
                    Toast.makeText(getApplicationContext(), s+" Note enregistrée avec succès", Toast.LENGTH_SHORT).show();
                }
            });

        }
}
