package com.codingblocks.recyclerviewadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getBaseContext(),2);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);

        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        StudentAdapter studentAdapter = new StudentAdapter();

        recyclerView.setAdapter(studentAdapter);

    }

    public class StudentViewHolder extends RecyclerView.ViewHolder{

        TextView name,course,center;

        public StudentViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            center = itemView.findViewById(R.id.center);
            course = itemView.findViewById(R.id.course);
        }
    }

    class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder>{

        @Override
        public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_row,
                    parent,
                    false);
            StudentViewHolder studentViewHolder = new StudentViewHolder(view);
            return studentViewHolder;
        }

        @Override
        public void onBindViewHolder(StudentViewHolder holder, int position) {
            Student currentStudent = arrayList.get(position);
            holder.name.setText(currentStudent.getName());
            holder.course.setText(currentStudent.getCourse());
            holder.center.setText(currentStudent.getCenter());
        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }
    }

}
