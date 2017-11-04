package com.codingblocks.tododb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TodoDatabase todoDatabase = new TodoDatabase(this);
        final EditText title = findViewById(R.id.editText), description = findViewById(R.id.editText2);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewTodo);

        final ArrayList<Todo> todoArrayList = todoDatabase.fetchAllTodos();
        final TodoAdapter todoAdapter = new TodoAdapter(todoArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(todoAdapter);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Todo todo = new Todo(title.getText().toString(), description.getText().toString());
                todoDatabase.insertTodo(todo);
                todoArrayList.clear();
                todoArrayList.addAll(todoDatabase.fetchAllTodos());
                todoAdapter.notifyDataSetChanged();
            }
        });
    }
}
