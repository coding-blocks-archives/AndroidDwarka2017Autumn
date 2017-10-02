package com.codingblocks.networkfetch;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button b;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        b = new Button(this);
        b.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        b.setText("Download");

        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        constraintLayout.addView(b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyAsyncTask myAsyncTask = new MyAsyncTask();
                myAsyncTask.execute("https://api.github.com/search/users?q=tom");
            }
        });

    }

    ArrayList<User> parseJson(String s) {

        ArrayList<User> users = new ArrayList<>();

        try {
            JSONObject jsonObject = new JSONObject(s);

            JSONArray items = jsonObject.getJSONArray("items");

            for (int i = 0; i < items.length(); i++) {

                JSONObject currentItem = items.getJSONObject(i);

                String id = currentItem.getString("id");
                String score = currentItem.getString("score");
                String login = currentItem.getString("login");
                String url = currentItem.getString("html_url");

                User user = new User(id,login,url,score);

                users.add(user);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return users;

    }

    class MyAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {

            URL url = null;
            //Create a URL Connection
            HttpURLConnection httpURLConnection = null;
            String result = "";


            try {
                url = new URL(strings[0]);
                httpURLConnection = (HttpURLConnection) url.openConnection();


                //Set the request method (POST or GET)
                httpURLConnection.setRequestMethod("GET");

                //Set Read timeout
                httpURLConnection.setReadTimeout(3000);

                //Set Connection timeout
                httpURLConnection.setConnectTimeout(5000);

                //Connect
                httpURLConnection.connect();

                //Throw an exception if the response was not 200
                if (httpURLConnection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    throw new IOException("HTTP error code" + httpURLConnection.getResponseCode());
                }

                //Read the data as InputStread from response
                InputStream inputStream = httpURLConnection.getInputStream();

                //Convert the byteArray into characterStream and stores to the disk
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);


                //Create a BufferedReader from the InputStream which stores the result to a memory, resulting in faster I/O
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                //Create a StringBuilder to store the result
                StringBuilder stringBuilder = new StringBuilder();
                String line;

                //Read the input and stroe it to StringBuilder line by line
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                }

                result = stringBuilder.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            textView.setText(s);

            ArrayList<User> userArrayList = parseJson(s);



            b.setVisibility(GONE);
        }
    }

}
