package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);
    }
    public void yes6(View view){
        startActivity(new Intent(Screen6.this,FinalF2.class));
    }
    public void no6(View view){
        startActivity(new Intent(Screen6.this,FinalF2.class));
    }
}
