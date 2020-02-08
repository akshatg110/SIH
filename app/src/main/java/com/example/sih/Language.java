package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import java.util.Locale;

public class Language extends AppCompatActivity {
    int l=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        SharedPreferences sharedPreferences=getSharedPreferences("savelang",MODE_PRIVATE);
        l=sharedPreferences.getInt("getLang",2);
        try{
            int l1=getIntent().getExtras().getInt("lan");
            if(l1!=0)
                l=l1;}
        catch (Exception E){

        }

        // Toast.makeText(this, ""+l, Toast.LENGTH_SHORT).show();
        if(l==2){
           // id.setText("who are you ?");
            setLang("en");}
        if(l==1){
          //  id.setText("तुम कौन हो?");
            setLang("hi");}

    }
    public void hindi(View v){
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("lan",1);
        startActivity(intent);
    }
    public void english(View v){
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("lan",2);
        startActivity(intent);
    }
    public void setLang(String langCode){
        Resources res=getResources();
        DisplayMetrics dm=res.getDisplayMetrics();
        Configuration conf=res.getConfiguration();
        conf.setLocale(new Locale(langCode.toLowerCase()));
        res.updateConfiguration(conf,dm);
    }

    public void saveData(){
        l=getIntent().getExtras().getInt("lan");
        SharedPreferences sharedPreferences=getSharedPreferences("savelang", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt("getLang",l);
        editor.apply();
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveData();
        //   Toast.makeText(this, "pu "+l, Toast.LENGTH_SHORT).show();
    }
}
