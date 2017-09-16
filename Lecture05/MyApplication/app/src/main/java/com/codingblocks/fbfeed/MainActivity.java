package com.codingblocks.fbfeed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Feed> arrayList = new ArrayList<>(), arrayList2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList.add(new Feed("Harshit",
                "This is a demo content.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList.add(new Feed("Harshit",
                "This is a demo content2.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList.add(new Feed("Harshit",
                "This is a demo content3.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList.add(new Feed("Harshit",
                "This is a demo content4.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList.add(new Feed("Harshit",
                "This is a demo content5.\nMulti Lined content.\nMore Lines",
                "13-09-17"));

        arrayList2.add(new Feed("Pandora",
                "This is a demo content.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList.add(new Feed("Pandora",
                "This is a demo content2.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList2.add(new Feed("Pandora",
                "This is a demo content3.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList2.add(new Feed("Pandora",
                "This is a demo content4.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList2.add(new Feed("Pandora",
                "This is a demo content5.\nMulti Lined content.\nMore Lines",
                "13-09-17"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final MyAdapter myAdapter = new MyAdapter(this,arrayList);

        recyclerView.setAdapter(myAdapter);

        Button b = (Button) findViewById(R.id.feedButton);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.addAll(arrayList2);
                myAdapter.notifyDataSetChanged();
            }
        });

    }
}
