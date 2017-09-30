package com.codingblocks.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by harshit on 24/09/17.
 */

public class StudentFragment extends Fragment {

    Student student;

    public static StudentFragment newInstance(Bundle bundle) {
        StudentFragment fragment = new StudentFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    public StudentFragment() {
    }

//    public StudentFragment(Student student) {
//        this.student = student;
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_student, container, false);

        if (getArguments() == null) {
            return view;
        } else {
            Bundle bundle = getArguments();

            TextView name, course, number, city, batch;
            name = (TextView) view.findViewById(R.id.name);
            course = (TextView) view.findViewById(R.id.course);
            number = (TextView) view.findViewById(R.id.number);
            city = (TextView) view.findViewById(R.id.city);
            batch = (TextView) view.findViewById(R.id.batch);

            name.setText(bundle.getString("NAME"));
            city.setText(student.getCity());
            number.setText(student.getNumber());
            batch.setText(student.getBatch());
            course.setText(student.getCourse());

            return view;
        }
    }
}
