package com.codingblocks.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by harshit on 04/11/17.
 */
@Dao
public interface TodoDao {

    @Insert
    public void insertTodo(Todo... todo);

    @Query("SELECT * FROM todo")
    public List<Todo> getAllTodos();

    @Delete
    public void deteleTodo(Todo todo);
}
