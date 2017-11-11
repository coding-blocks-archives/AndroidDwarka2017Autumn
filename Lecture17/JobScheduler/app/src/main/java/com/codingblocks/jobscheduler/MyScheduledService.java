package com.codingblocks.jobscheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

/**
 * Created by harshit on 11/11/17.
 */

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MyScheduledService extends JobService{


    @Override
    public boolean onStartJob(JobParameters params) {
        Toast.makeText(getApplicationContext(),"Hi, I'm a scheduled task",Toast.LENGTH_SHORT).show();
        new MyTask().execute("Test");

        //false if you don't need to do any work on a new thread, otherwise true.
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }

    static class MyTask extends AsyncTask<String,Void,Void>{

        @Override
        protected Void doInBackground(String... strings) {
            return null;
        }
    }
}
