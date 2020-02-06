package com.example.sih;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int l=1;
    TextView id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id=(TextView)findViewById(R.id.who);
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
            id.setText("who are you ?");
        setLang("en");}
        if(l==1){
            id.setText("तुम कौन हो?");
            setLang("hi");}

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

    public void Victim(View view) {startActivity(new Intent(MainActivity.this,Victim.class));
    }
    public void setLang(String langCode){
        Resources res=getResources();
        DisplayMetrics dm=res.getDisplayMetrics();
        Configuration conf=res.getConfiguration();
        conf.setLocale(new Locale(langCode.toLowerCase()));
        res.updateConfiguration(conf,dm);
    }
    public void changelang(View v){
        startActivity(new Intent(MainActivity.this,Language.class));
        finish();
    }
    public void saveData(){
        l=getIntent().getExtras().getInt("lan");
        SharedPreferences sharedPreferences=getSharedPreferences("savelang", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt("getLang",l);
        editor.apply();
    }


//    @Override
//    protected void onResume() {
//        super.onResume();
//        SharedPreferences sharedPreferences=getSharedPreferences("savelang",MODE_PRIVATE);
//        l=sharedPreferences.getInt("getLang",2);
//        try{
//            int l1=getIntent().getExtras().getInt("lan");
//            if(l1!=0)
//                l=l1;}
//        catch (Exception E){
//
//        }
//
//        // Toast.makeText(this, ""+l, Toast.LENGTH_SHORT).show();
//        if(l==2)
//            setLang("en");
//        if(l==1)
//            setLang("hi");
//    }

    @Override
    protected void onPause() {
        super.onPause();
        saveData();
      //   Toast.makeText(this, "pu "+l, Toast.LENGTH_SHORT).show();
    }

public void bt(View v){
        startActivity(new Intent(this,Bt.class));
}

    //private class SendReceive extends Thread{
//        private final BluetoothSocket bluetoothSocket;
//        private final InputStream inputStream;
//        private final OutputStream outputStream;
//
//    private SendReceive(BluetoothSocket bluetoothSocket) {
//        this.bluetoothSocket = bluetoothSocket;
//       InputStream tempin=null;
//       OutputStream tempout=null;
//        try {
//            tempin=bluetoothSocket.getInputStream();
//            tempout =bluetoothSocket.getOutputStream();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        inputStream=tempin;
//        outputStream=tempout;
//    }
//    public void run()
//    {
//        byte[] buffer=new byte[1024];
//        int bytes;
//        while(true){
//            try {
//                bytes=inputStream.read(buffer);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

}
