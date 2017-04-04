package com.example.adrianreda.zadanie3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class Obrazek extends AppCompatActivity
{
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);
        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public void zmienObrazek(View view)
    {
        imageView.setImageResource(R.drawable.obrazek1);
    }

    public void Poprzedni(View view)
    {
        imageView.setImageResource(R.drawable.obrazek2);
    }

    public void Powrot(View view)
    {
        finish();
    }
}