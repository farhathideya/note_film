package com.example.note_film;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class creeCompte extends AppCompatActivity {
    TextView text;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cree_compte);
        btn= (Button) findViewById(R.id.retur);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(creeCompte.this,newlogin.class);
            startActivity(intent);
        });
        btn= (Button) findViewById(R.id.login);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(creeCompte.this,movies.class);
            startActivity(intent);
        });

        TextView username=(TextView) findViewById(R.id.mail);
        TextView password=(TextView) findViewById(R.id.TextPassword);
        TextView confirmpass=(TextView) findViewById(R.id.confrmerPassword);
        @SuppressLint("WrongViewCast") MaterialButton loginbtn=findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwd = password.getText().toString();
                if((username.getText().toString()).equals("admin@gmail.com") && (confirmpass.getText().toString()).equals(passwd)){
                    Intent intent = new Intent(creeCompte.this,movies.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(creeCompte.this, "error verifier votre password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}