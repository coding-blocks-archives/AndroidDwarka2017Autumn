package com.codingblocks.broadcastreceiver;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

/**
 * Created by harshit on 01/10/17.
 */

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)) {
            Intent intent1 = new Intent();
//            intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            intent1.putExtra("EXTRA","power");
            intent1.setAction("BlahBlah");
            context.startActivity(intent1);
        } else if (intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED)) {

            PendingIntent pi = PendingIntent.getActivity(context,
                    123,
                    new Intent(context, MainActivity.class),
                    PendingIntent.FLAG_UPDATE_CURRENT);

            Notification notification = new NotificationCompat.Builder(context)
                    .setContentTitle("Hola")
                    .setContentText("Hi there, I'm a notification")
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .addAction(new NotificationCompat.Action(R.mipmap.ic_launcher_round,"Hello",pi))
                    .setContentIntent(pi)
                    .build();

            NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);

            notificationManagerCompat.notify(123, notification);

//            notificationManagerCompat.cancel(123);

        }

    }
}