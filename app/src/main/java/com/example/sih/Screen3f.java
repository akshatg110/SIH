package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen3f extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3f);
    }
    public void yes3(View view){
        startActivity(new Intent(Screen3f.this,Screen4.class));
    }
    public void no3(View view){
        startActivity(new Intent(Screen3f.this,FinalF.class));
    }
}
