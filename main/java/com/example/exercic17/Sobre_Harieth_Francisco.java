package com.example.exercic17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ImageView;

public class Sobre_Harieth_Francisco extends AppCompatActivity {
    ImageView foto;
    Button btn_vermais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre__harieth__francisco);
        foto=findViewById(R.id.imageView);

        new  Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Sobre_Harieth_Francisco.this, Fotos_Da_Harieth.class);
                startActivity(i);
            }
        }, 3000);


    }
}