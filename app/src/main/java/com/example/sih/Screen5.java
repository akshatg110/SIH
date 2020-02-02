package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);
    }
    public void yes5(View view){
        startActivity(new Intent(Screen5.this,FinalF2.class));
    }
    public void no5(View view){
        startActivity(new Intent(Screen5.this,Screen6.class));
    }
}
