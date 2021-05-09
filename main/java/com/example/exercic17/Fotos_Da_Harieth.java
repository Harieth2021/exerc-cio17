package com.example.exercic17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class Fotos_Da_Harieth extends AppCompatActivity {
    TextView txt1, txt2, txt3;
    ImageView imagem2, imagem3, imagem4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos__da__harieth);
        txt1 = findViewById(R.id.t1);
        txt2 = findViewById(R.id.t2);
        txt3 = findViewById(R.id.t3);
        imagem2 = findViewById(R.id.imageView2);
        imagem3 = findViewById(R.id.imageView3);
        imagem4 = findViewById(R.id.imageView4);


    }
}