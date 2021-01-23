package com.laioffer.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// these override mean to add more comments on each step in lifecycle
public class MainActivity extends AppCompatActivity {

    private final static String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "We are at onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "We are at onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "We are at onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "We are at onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "We are at onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "We are at onDestroy()");
    }
}