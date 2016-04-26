package com.example.lexi.myapplication;

import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int res = checkCallingOrSelfPermission("android.permission.GET_ACCOUNTS");
        Log.e("Permission: ", (res == PackageManager.PERMISSION_GRANTED) + "");
    }
}
