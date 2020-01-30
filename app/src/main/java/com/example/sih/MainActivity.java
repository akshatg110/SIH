package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fire(View view){
        startActivity(new Intent(MainActivity.this,fire.class));
    }
    public void EarthQuake (View view){
        startActivity(new Intent(MainActivity.this,EarthQuake.class));
    }
    public void Tsunami(View view){
        startActivity(new Intent(MainActivity.this,Tsunami.class));
    }
}
