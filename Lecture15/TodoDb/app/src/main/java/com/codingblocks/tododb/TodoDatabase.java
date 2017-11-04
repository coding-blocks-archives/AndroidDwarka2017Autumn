package com.codingblocks.tododb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by harshit on 04/11/17.
 */

public class TodoDatabase extends SQLiteOpenHelper {


    public static final String TAG = "TodoDatabase";
    public static final String DB_NAME = "mydatabase.db";
    public static final int DB_VERSION = 1;
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String TABLE_NAME = "todo";
    public static final String PK_AUTOINCREMENT = " PRIMARY KEY AUTOINCREMENT ";
    public static final String CREATE_TABLE = "CREATE TABLE ";
    public static final String INTEGER = " INTEGER ";
    public static final String TEXT = " TEXT ";
    public static final String COMMA = " , ";
    public static final String RBR = " ( ";
    public static final String LBR = " ) ";
    public static final String TERM = " ; ";

    public TodoDatabase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public ArrayList<Todo> fetchAllTodos() {
        ArrayList<Todo> todoArrayList = new ArrayList<>();


        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        Cursor c = sqLiteDatabase.query(
                TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                COLUMN_ID + " desc"
        );

        while (c.moveToNext()) {
            int id_index = c.getColumnIndex(COLUMN_ID);
            int id = c.getInt(id_index);
            String title = c.getString(c.getColumnIndex(COLUMN_TITLE));
            String description = c.getString(c.getColumnIndex(COLUMN_DESCRIPTION));
            todoArrayList.add(new Todo(id, title, description));
        }

        return todoArrayList;
    }

    public boolean insertTodo(Todo todo) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_TITLE, todo.getTitle());
        contentValues.put(COLUMN_DESCRIPTION, todo.getDescription());

        long rowInserted = sqLiteDatabase.insert(TABLE_NAME,
                null,
                contentValues);

        Log.e(TAG, "insertTodo: " + rowInserted);

        if (rowInserted == -1) {
            return false;
        }
        return true;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = CREATE_TABLE + TABLE_NAME + RBR + COLUMN_ID + INTEGER +
                PK_AUTOINCREMENT + COMMA +
                COLUMN_TITLE + TEXT + COMMA +
                COLUMN_DESCRIPTION + TEXT + LBR + TERM;
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
