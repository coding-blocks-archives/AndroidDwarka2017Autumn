package com.codingblocks.masterdetail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputStream inputStream = null;

    }

    private String downloadUrl() throws IOException {


        //Get the URL from input param
        String url1 = "https://www.google.com";

        String result = "";
        try {
            URL url = new URL(url1);
            //Create a URL Connection
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
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
            //Save the result to a string
            result = stringBuilder.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  result;
    }

}
