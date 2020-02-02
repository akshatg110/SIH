package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
    }
    public void yes4(View view){
        startActivity(new Intent(Screen4.this,FinalF.class));
    }
    public void no4(View view){
        startActivity(new Intent(Screen4.this,Screen5.class));
    }
}
