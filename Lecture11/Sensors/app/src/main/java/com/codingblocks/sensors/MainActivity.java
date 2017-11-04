package com.codingblocks.sensors;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

import static com.codingblocks.sensors.R.id.constraintLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    SensorManager sensorManager;
    SensorEventListener sensorEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //AlertDialog with button
        final ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        Button button = (Button) findViewById(R.id.alertBtn);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        final Sensor accelSensor = sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY);

        sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                //Called when the value of sensor changes
                float[] values = event.values;

                Log.e(TAG, "onSensorChanged: X Axis " + values[0] );
                Log.e(TAG, "onSensorChanged: Y Axis " + values[1] );
                Log.e(TAG, "onSensorChanged: Z Axis " + values[2] );

                int newX = (int) ((values[0] / 9.8) * 255);
                int newY = (int) ((values[1] / 9.8) * 255);
                int newZ = (int) ((values[2] / 9.8) * 255);

                constraintLayout.setBackgroundColor(Color.rgb(newX,newY,newZ));

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
                //Called when the accuracy of sensor changes
            }
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Do you want to register Listener?")
                        .setMessage("Please select your choice...")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                sensorManager.registerListener(sensorEventListener,accelSensor,SensorManager.SENSOR_DELAY_NORMAL);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                sensorManager.unregisterListener(sensorEventListener);
                            }
                        })
                        .setCancelable(false)
                        .create();

                alertDialog.show();


            }
        });

//        SensorManager sensorManager = (SensorManager) getSystemService("sensor");

        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);

        for (Sensor s : sensors){
            Log.e(TAG, "-----------------------------" );
            Log.e(TAG, "NAME " + s.getName());
            Log.e(TAG, "VENDOR " + s.getVendor());
            Log.e(TAG, "VERSION " + s.getVersion());
            Log.e(TAG, "ID " + s.getId());
            Log.e(TAG, "MAX_RANGE " + s.getMaximumRange());
            Log.e(TAG, "POWER " + s.getPower());
            Log.e(TAG, "TYPE " + s.getType());
            Log.e(TAG, "MAX_DELAY " + s.getMaxDelay());
            Log.e(TAG, "FIFO_MAX_EVENT_COUNT " + s.getFifoMaxEventCount());
            Log.e(TAG, "-----------------------------" );

        }

        //Can be also done as

//        for (int i = 0 ; i < sensors.size(); i++){
//
//            Sensor s = sensors.get(i);
//
//        }


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Unregister the listener in onDestroy
    }
}
