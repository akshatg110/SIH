package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
    }
    public void yes1(View view){
        startActivity(new Intent(fire.this,Screen2f.class));
    }
    public void no1(View view){
        startActivity(new Intent(fire.this,Screen5.class));
    }
}
