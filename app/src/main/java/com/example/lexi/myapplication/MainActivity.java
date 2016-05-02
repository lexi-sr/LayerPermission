package com.example.lexi.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
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
        String permissions[] = new String[1];
        permissions[0] =  Manifest.permission.GET_ACCOUNTS;
        ActivityCompat.requestPermissions(this, permissions, 0);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        int res = checkCallingOrSelfPermission("android.permission.GET_ACCOUNTS");
        Log.e("2: ", (res == PackageManager.PERMISSION_GRANTED) + "");
    }
}
