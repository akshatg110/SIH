package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Victim_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victim_5);
    }
    public void vyes5(View view){
        startActivity(new Intent(Victim_5.this,FinalF.class));
    }
    public void vno5(View view){
        startActivity(new Intent(Victim_5.this,Victim_6.class));
    }
}
