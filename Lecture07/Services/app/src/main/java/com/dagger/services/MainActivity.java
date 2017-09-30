package com.dagger.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(this,CountService.class);
//        intent.putExtra("EXTRA","Some Stuff");
//        startService(intent);

        Intent i = new Intent(this,CountIntentService.class);

        startService(i);

    }
}
