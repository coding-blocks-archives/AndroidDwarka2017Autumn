package com.codingblocks.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyInterface {

    ArrayList<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewStudents);
        students = Student.getStudents();

        StudentAdapter studentAdapter = new StudentAdapter(students,this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(studentAdapter);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,
                        new StudentFragment())
                .commit();

    }


    @Override
    public void launchFragment(int position) {

        Student currentStudent = students.get(position);

//        StudentFragment studentFragment = new StudentFragment();

        Bundle bundle = new Bundle();
        bundle.putString("NAME",currentStudent.getName());
        bundle.putString("NUMBER",currentStudent.getNumber());
        bundle.putString("COURSE",currentStudent.getCourse());

        StudentFragment studentFragment = StudentFragment.newInstance(bundle);

        studentFragment.setArguments(bundle);
        Bundle b = new Bundle();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, studentFragment)
                .commit();
    }

    @Override
    public void showToast(int posiotion) {
        //Leave blank
    }
}
