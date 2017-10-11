package com.example.home.wifitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.net.wifi.WifiManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEnable, btnDisable;
    WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnable = (Button) findViewById(R.id.btnEnable);
        btnDisable = (Button) findViewById(R.id.btnDisable);

        btnEnable.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                wifiManager.setWifiEnabled(true);
                if (wifiManager.isWifiEnabled()){
                    // Toast wifi is enabled
                    Toast.makeText(getApplicationContext(), "Wifi is enabled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDisable.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                wifiManager.setWifiEnabled(false);
                if (wifiManager.isWifiEnabled()){
                    // Toast wifi is disabled
                    Toast.makeText(getApplicationContext(), "Wifi is disabled", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}