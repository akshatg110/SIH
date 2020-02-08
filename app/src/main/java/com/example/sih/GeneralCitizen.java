package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GeneralCitizen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_citizen);
    }
    public void uncon(View v){
       startActivity(new Intent(GeneralCitizen.this,unconciousness.class));
    }
    public void breath(View v){
        startActivity(new Intent(GeneralCitizen.this,breathlessness.class));
    }
}
