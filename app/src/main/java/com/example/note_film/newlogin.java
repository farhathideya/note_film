package com.example.note_film;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class newlogin extends AppCompatActivity {
    Button btn;
    TextView text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newlogin);

        text=(TextView) findViewById(R.id.modePasseOublier);
        text.setOnClickListener(v -> {
            Intent intent = new Intent(newlogin.this,newlogin.class);
            startActivity(intent);
        });
        text=(TextView) findViewById(R.id.cree);
        text.setOnClickListener(v -> {
            Intent intent = new Intent(newlogin.this,creeCompte.class);
            startActivity(intent);
        });
        btn=(Button)findViewById(R.id.login1);

        TextView username=(TextView) findViewById(R.id.mail);
        TextView password=(TextView) findViewById(R.id.Password);
        @SuppressLint("WrongViewCast") MaterialButton loginbtn=findViewById(R.id.login1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((username.getText().toString()).equals("admin@gmail.com") && (password.getText().toString()).equals("admin")){
                    Intent intent = new Intent(newlogin.this,movies.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(newlogin.this, "error verifier votre password", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}