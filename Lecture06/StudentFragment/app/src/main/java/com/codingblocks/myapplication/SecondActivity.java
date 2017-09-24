package com.codingblocks.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by harshit on 24/09/17.
 */

public class SecondActivity extends AppCompatActivity implements MyInterface{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StudentAdapter studentAdapter = new StudentAdapter(Student.getStudents(),this);
    }

    @Override
    public void launchFragment(int position) {
        //leave blank
    }

    @Override
    public void showToast(int posiotion) {
        Toast.makeText(this,"Hello from Position" + posiotion, Toast.LENGTH_SHORT).show();
    }
}
