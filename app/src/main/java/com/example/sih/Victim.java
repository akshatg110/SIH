package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Victim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victim);
    }
    public void vyes1(View view){
        startActivity(new Intent(Victim.this,Victim_2.class));
    }
    public void vno1(View view){
        startActivity(new Intent(Victim.this,Screen5.class));
    }
}
