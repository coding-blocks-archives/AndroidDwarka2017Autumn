package com.dagger.threads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Counting started");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {

                        for (long i = 0; i < 100000; i++) {
                            Log.e("TAG", "run: " + i);
                        }
//                        textView.setText("Counting Done");
                        textView.post(new Runnable() {
                            @Override
                            public void run() {
                                textView.setText("Counting ");
                            }
                        });
//                        MainActivity.this.runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                textView.setText("Counting done");
//                            }
//                        });


                    }

                });
                t.start();

            }
        });
    }
}
