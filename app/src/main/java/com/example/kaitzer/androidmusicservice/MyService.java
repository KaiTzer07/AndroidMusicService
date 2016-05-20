package com.example.kaitzer.androidmusicservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by KaiTzer on 16-May-16.
 */
public class MyService extends Service {
    MediaPlayer myPlayer;
    @Override
    public void onCreate()
    {
        Toast.makeText(this, "Service created", Toast.LENGTH_SHORT).show();
        Log.e("MyService", "onCreate");
        myPlayer = MediaPlayer.create(this, R.raw.song);
        myPlayer.setLooping(false); //set looping
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        //Let it continue running until it's stopped
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        Log.e("MyService", "onStartCommand");
        myPlayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy()
    {
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();
        myPlayer.stop();
        Log.e("MyService", "onDestroy");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
