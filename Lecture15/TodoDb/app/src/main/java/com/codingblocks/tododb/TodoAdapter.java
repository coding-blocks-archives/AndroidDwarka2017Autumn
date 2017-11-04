package com.codingblocks.tododb;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by harshit on 04/11/17.
 */

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoHolder> {

    private ArrayList<Todo> todos;

    public TodoAdapter(ArrayList<Todo> todoArrayList) {
        todos = todoArrayList;
    }

    @Override
    public TodoAdapter.TodoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TodoHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_todo, parent, false));
    }

    @Override
    public void onBindViewHolder(TodoAdapter.TodoHolder holder, int position) {
        Todo currentTodo = todos.get(position);
        holder.title.setText(currentTodo.getTitle());
        holder.description.setText(currentTodo.getDescription());
    }

    @Override
    public int getItemCount() {
        return todos.size();
    }

    public class TodoHolder extends RecyclerView.ViewHolder {

        TextView title, description;

        public TodoHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.todoTitle);
            description = itemView.findViewById(R.id.todoDescription);

        }
    }
}
