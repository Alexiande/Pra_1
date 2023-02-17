package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toastdisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        toastdisplay=findViewById ( R.id.myapp);
        toastdisplay.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Toast.makeText ( MainActivity.this, "Hello", Toast.LENGTH_LONG ).show ();

            }
        } );
    }
}