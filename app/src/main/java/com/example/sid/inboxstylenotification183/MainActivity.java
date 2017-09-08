package com.example.sid.inboxstylenotification183;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnShowNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowNotification = (Button) findViewById(R.id.btnShowNotification);
        btnShowNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                //notification title
                inboxStyle.setBigContentTitle("Event Details");
                //contents of notification
                inboxStyle.addLine("Helloo..!");
                inboxStyle.addLine("How are you?");
                inboxStyle.addLine("HIII");
                inboxStyle.addLine("I an fine...");
                inboxStyle.addLine("what about you? all is well?");
                inboxStyle.addLine("Yes,every thing is all right..");

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this).setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("Inbox Style Notification")
                        .setContentText("You may have new message")
                        .setStyle(inboxStyle);
                builder.setStyle(inboxStyle);
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(100,builder.build());
            }
        });
    }
}
