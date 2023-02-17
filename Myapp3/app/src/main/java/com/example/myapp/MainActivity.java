package com.example.myap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myap";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.w(TAG, "This app is stopped");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.e(TAG, "This app is destroyed");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG, "This app is paused");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG, "This app is resumed");
    }

}
