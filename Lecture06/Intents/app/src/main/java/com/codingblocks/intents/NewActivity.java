package com.codingblocks.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by harshit on 24/09/17.
 */

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.textViewNew);

        String retrievedName = intent.getStringExtra("NAME");

        textView.setText(retrievedName);

    }
}
