package com.dagger.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by harshitdwivedi on 30/09/17.
 */

public class CountService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("TAG", "onCreate: was called");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000000;i++){
                    Log.e("TAG", "run: " + i);
                }
            }
        }).start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopSelf();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
