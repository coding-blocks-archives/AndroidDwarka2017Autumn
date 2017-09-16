package com.codingblocks.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by harshit on 16/09/17.
 */

class MyHolder extends RecyclerView.ViewHolder{

    TextView authorName,content,date;

    public MyHolder(View itemView) {
        super(itemView);
        authorName = itemView.findViewById(R.id.textViewAuthor);
        content = itemView.findViewById(R.id.textViewContent);
        date = itemView.findViewById(R.id.textViewDate);
    }
}