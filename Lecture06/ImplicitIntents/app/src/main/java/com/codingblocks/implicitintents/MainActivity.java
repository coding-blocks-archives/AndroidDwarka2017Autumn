package com.codingblocks.implicitintents;

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
        final EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.idBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//
//                Uri uri = Uri.parse("http://" + editText.getText().toString());
//
//                intent.setData(uri);
//
//                startActivity(intent);
//
                Intent newIntent = new Intent();

                newIntent.setAction("hellothisisnewaction");

                startActivity(newIntent);

            }
        });
    }
}
