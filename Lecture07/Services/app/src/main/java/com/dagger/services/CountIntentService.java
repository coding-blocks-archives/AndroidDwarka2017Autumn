package com.dagger.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by harshitdwivedi on 30/09/17.
 */

public class CountIntentService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     **/


    public CountIntentService() {
        super("MyService");
    }


    @Override
    public void setIntentRedelivery(boolean enabled) {
        super.setIntentRedelivery(enabled);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        for (int i=0;i<1000000;i++){
            Log.e("TAG", "run: " + i);
        }
    }
}
