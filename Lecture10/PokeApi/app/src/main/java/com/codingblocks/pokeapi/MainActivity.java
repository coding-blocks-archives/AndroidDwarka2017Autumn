package com.codingblocks.pokeapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    String pokeResult = "";
    TextView pokemonName;
    ImageView pokeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btnGo);
        final EditText editText = (EditText) findViewById(R.id.editTextName);
        pokemonName = (TextView) findViewById(R.id.pokeName);
        pokeImage = (ImageView) findViewById(R.id.pokeImage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String baseUrl = "http://pokeapi.co/api/v2/pokemon/";
                String input = editText.getText().toString();

                String url = baseUrl + input;
                makeNetworkCall(url);

            }
        });

    }

    private void makeNetworkCall(String url) {
        OkHttpClient client = new OkHttpClient();

        final Request request = new Request.Builder()
                .url(url)
                .build();


        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("TAG", "onFailure: " + call.request().url() );
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                pokeResult = response.body().string();
                Log.e("TAG", "onResponse: " + pokeResult);

                Gson gson = new Gson();
                final Pokemon pokemon = gson.fromJson(pokeResult,Pokemon.class);

                //Sending objects in Intents using GSON

//                String data = gson.toJson(pokemon);

//                Intent i = new Intent();

//                i.putExtra("POKEMON",data);

//                Pokemon pokemon1 = gson.fromJson(receivedData,Pokemon.class);
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pokemonName.setText(pokemon.getName());
                        Picasso.with(getBaseContext())
                                .load(pokemon.getSprites().getBack_default())
                                .placeholder(R.mipmap.ic_launcher)
                                .error(R.mipmap.ic_launcher_round)
                                .into(pokeImage);

                    }
                });

            }
        });


    }
}
