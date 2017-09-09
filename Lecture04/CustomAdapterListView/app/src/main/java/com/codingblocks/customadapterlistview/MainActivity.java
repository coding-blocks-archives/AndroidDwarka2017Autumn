package com.codingblocks.customadapterlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> arrayList = new ArrayList<>();
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        arrayList.add(new Student("Harshit", "Pandora", "Dwarka"));
        arrayList.add(new Student("Naman", "Pandora", "Dwarka"));
        arrayList.add(new Student("Rijul", "Pandora", "Dwarka"));
        arrayList.add(new Student("Tenzin", "Pandora", "Dwarka"));
        arrayList.add(new Student("Vaibhav", "Pandora", "Dwarka"));
        arrayList.add(new Student("Deepak", "Pandora", "Dwarka"));
        arrayList.add(new Student("Ansh", "Pandora", "Dwarka"));
        ListView listView = (ListView) findViewById(R.id.listView);
        StudentAdapter studentAdapter = new StudentAdapter();

        listView.setAdapter(studentAdapter);
    }

    private class StudentAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Student getItem(int i) {
            return arrayList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater layoutInflater = LayoutInflater.from(getBaseContext());
            Student currentStudent = arrayList.get(i);
            if (view == null) {
                //Only create a new view when the view is null
                view = layoutInflater.inflate(R.layout.item_row, viewGroup, false);

//                TextView nameTextView, centerTextView, courseTextView;
//
//                nameTextView = view.findViewById(R.id.name);
//                centerTextView = view.findViewById(R.id.course);
//                courseTextView = view.findViewById(R.id.center);;
//
//                view.setTag(0,nameTextView);
//                view.setTag(1,centerTextView);
//                view.setTag(2,courseTextView);

                StudentViewHolder studentViewHolder = new StudentViewHolder();

                studentViewHolder.nameTV = view.findViewById(R.id.name);
                studentViewHolder.courseTV = view.findViewById(R.id.course);
                studentViewHolder.centerTV = view.findViewById(R.id.center);

                //Storing the memory addressed of TextViews to the view's memory address
                //This reduces time complexity since you don't have to call findViewById again and again
                view.setTag(studentViewHolder);
            }

            StudentViewHolder svh = (StudentViewHolder) view.getTag();

//            TextView name = (TextView) view.getTag(0);


            svh.nameTV.setText(currentStudent.getName());
            svh.centerTV.setText(currentStudent.getCenter());
            svh.courseTV.setText(currentStudent.getCourse());
            return view;

            /*

            Without ViewHolder Pattern

            TextView nameTextView, centerTextView, courseTextView;

            nameTextView = view.findViewById(R.id.name);
            centerTextView = view.findViewById(R.id.course);
            courseTextView = view.findViewById(R.id.center);;


             */

        }
    }

    //Simple class containing the details about all the views to be used in a single row of listView
    class StudentViewHolder{
        TextView nameTV,courseTV,centerTV;
    }

}
