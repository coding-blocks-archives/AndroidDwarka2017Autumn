package com.codingblocks.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by harshit on 24/09/17.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyHolder> {

    private ArrayList<Student> students;
    private MyInterface myInterface;

    public StudentAdapter(ArrayList<Student> students, MyInterface myInterface) {
        this.myInterface = myInterface;
        this.students = students;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,
                parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.name.setText(students.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView name;

        public MyHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(android.R.id.text1);
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (myInterface instanceof MainActivity) {
                        myInterface.launchFragment(getAdapterPosition());
                    } else if (myInterface instanceof SecondActivity) {
                        myInterface.showToast(getAdapterPosition());
                    }
                    //Do something
                }
            });
        }
    }


}
