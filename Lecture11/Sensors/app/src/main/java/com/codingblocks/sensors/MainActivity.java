package com.codingblocks.sensors;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    SensorManager sensorManager;
    SensorEventListener sensorEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

//        SensorManager sensorManager = (SensorManager) getSystemService("sensor");

        final ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

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

        sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                //Called when the value of sensor changes
                float[] values = event.values;

                Log.e(TAG, "onSensorChanged: X Axis " + values[0] );
                Log.e(TAG, "onSensorChanged: Y Axis " + values[1] );
                Log.e(TAG, "onSensorChanged: Z Axis " + values[2] );

//                constraintLayout.setBackgroundColor(Color.rgb());

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
                //Called when the accuracy of sensor changes
            }
        };

        Sensor accelSensor = sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY);

        sensorManager.registerListener(sensorEventListener,accelSensor,SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Unregister the listener in onDestroy
        sensorManager.unregisterListener(sensorEventListener);
    }
}
