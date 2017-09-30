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
        User user = new User("Test","a","b","c","d");

        Intent i = new Intent(this,CountIntentService.class);

        i.putExtra("USER",user);

        startService(i);

    }
}
