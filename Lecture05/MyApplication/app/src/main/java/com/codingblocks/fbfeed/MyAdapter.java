package com.codingblocks.fbfeed;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by harshit on 16/09/17.
 */

class MyAdapter extends RecyclerView.Adapter<MyHolder>{


//        @Override
//        public int getItemViewType(int position) {
//            if(position == 0)
//                return 1;
//            else
//                return 0;
//        }

    private Context context;
    private ArrayList<Feed> feeds;

    MyAdapter(Context context, ArrayList<Feed> arrayList) {
        this.context = context;
        this.feeds = arrayList;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_feed,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Feed currentFeed = feeds.get(position);

        holder.authorName.setText(currentFeed.getName());
        holder.content.setText(currentFeed.getContent());
        holder.date.setText(currentFeed.getDate());

    }

    @Override
    public int getItemCount() {
        return feeds.size();
    }
}