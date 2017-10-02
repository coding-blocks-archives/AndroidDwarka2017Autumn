package com.codingblocks.sendbroadcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by harshit on 01/10/17.
 */

public class FragmentA extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  v = inflater.inflate(R.layout.fragment_a,container,false);
        final EditText editText = v.findViewById(R.id.editTextA);
        Button btn = v.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("EXTRA",input);
                intent.setAction("hellofragmentb");

                getContext().sendBroadcast(intent);

                LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
                //dosomething
            }
        });

        return  v;
    }

}
