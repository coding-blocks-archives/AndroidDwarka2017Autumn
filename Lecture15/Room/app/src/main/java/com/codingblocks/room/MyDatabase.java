package com.codingblocks.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by harshit on 04/11/17.
 */
@Database(entities = {Todo.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {

    public abstract TodoDao todoDao();

}
