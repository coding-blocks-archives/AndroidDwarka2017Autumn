package com.codingblocks.fragmentdynamic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonA = (Button) findViewById(R.id.addA);
        Button buttonB = (Button) findViewById(R.id.addB);


        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//
//                FragmentTransaction tr = fragmentManager.beginTransaction();
//
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//                tr.add(R.id.container,new FragmentA());
//
////                tr.add(R.id.container,new FragmentB());
//
//                tr.commit();

                getSupportFragmentManager().beginTransaction().add(R.id.container,new FragmentB()).commit();

                //Do this
//                ListView l;
//
//                l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                    }
//                });

            }
        });


        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
