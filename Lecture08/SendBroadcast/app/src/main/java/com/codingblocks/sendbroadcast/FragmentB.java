package com.codingblocks.sendbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by harshit on 01/10/17.
 */

public class FragmentB extends Fragment {
    TextView textView;
    BroadcastReceiver textReceiver;
    IntentFilter intentFilter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, container, false);

        textView = v.findViewById(R.id.textViewB);

        textReceiver = new TextReceiver();
        intentFilter = new IntentFilter();
        intentFilter.addAction("hellofragmentb");
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        getContext().registerReceiver(textReceiver, intentFilter);
    }

    @Override
    public void onStop() {
        super.onStop();
        getContext().unregisterReceiver(textReceiver);
    }

    public class TextReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            textView.setText(intent.getStringExtra("EXTRA"));
        }
    }

}
