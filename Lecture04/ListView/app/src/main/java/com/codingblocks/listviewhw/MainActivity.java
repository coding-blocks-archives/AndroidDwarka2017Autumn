package com.codingblocks.listviewhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayListAbout = new ArrayList<>(),
            arrayListCollege = new ArrayList<>(),
            arrayListHobbies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListAbout.add("a");
        arrayListAbout.add("b");
        arrayListAbout.add("c");
        arrayListAbout.add("d");
        arrayListAbout.add("e");
        arrayListAbout.add("f");
        arrayListAbout.add("g");

        arrayListHobbies.add("h");
        arrayListHobbies.add("i");
        arrayListHobbies.add("j");
        arrayListHobbies.add("k");
        arrayListHobbies.add("l");

        arrayListCollege.add("w");
        arrayListCollege.add("x");
        arrayListCollege.add("y");
        arrayListCollege.add("z");
        arrayListCollege.add("m");

        final ListView listView = (ListView) findViewById(R.id.listView);

        Button button1, button2, button3;

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        final ArrayAdapter<String> firstAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                arrayListAbout);

        final ArrayAdapter<String> secondAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                arrayListCollege);

        final ArrayAdapter<String> thirdAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                arrayListHobbies);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setAdapter(firstAdapter);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setAdapter(secondAdapter);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setAdapter(thirdAdapter);
            }
        });

    }
}
