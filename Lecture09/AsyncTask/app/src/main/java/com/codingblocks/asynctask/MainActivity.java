package com.codingblocks.asynctask;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn);
        final MyAsyncTask myAsyncTask = new MyAsyncTask();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myAsyncTask.cancel(true);

                if (myAsyncTask.getStatus() == AsyncTask.Status.FINISHED)
                    myAsyncTask.execute(10000000000L, 200000L, 300000L);
            }
        });

    }

    private class MyAsyncTask extends AsyncTask<Long, Long, String> {

        ProgressDialog progressDialog;

        //Main/UI thread
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Counting...");
            progressDialog.setTitle("Please Wait");
//            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        //Main/UI Thread
        @Override
        protected void onProgressUpdate(Long... values) {
            super.onProgressUpdate(values);
            progressDialog.setMessage("Counting done till " + values[0]);
        }

        //New Background Thread
        @Override
        protected String doInBackground(Long... integers) {
            Long input = integers[0];

            for (long i = 0; i < input; i++) {

                if (i % 1000000 == 0)
                    publishProgress(i);
            }
            return "Counting Done";
        }

        //Main/UI Thread
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            progressDialog.hide();
        }
    }

}
