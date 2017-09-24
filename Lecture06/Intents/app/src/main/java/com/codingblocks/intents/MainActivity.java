package com.codingblocks.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.editTextMain);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                intent.putExtra("NAME",s);
                startActivity(intent);
                finish();
            }
        });

    }
}
