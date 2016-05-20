package com.example.kaitzer.androidmusicservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start, stop, next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.btnStart);
        stop = (Button) findViewById(R.id.btnStop);
        next = (Button) findViewById(R.id.btnNext);
    }

    public void startService (View v)
    {
        Intent i = new Intent(MainActivity.this, MyService.class);
        startService (i);
    }

    public void stopService (View v)
    {
        Intent i = new Intent(MainActivity.this, MyService.class);
        stopService (i);
    }

    public void gotoNext (View v)
    {
        Intent i = new Intent(MainActivity.this, NextActivity.class);
        startActivity(i);
    }

    /*public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_service_main,menu);
        return true;
    }*/
}
