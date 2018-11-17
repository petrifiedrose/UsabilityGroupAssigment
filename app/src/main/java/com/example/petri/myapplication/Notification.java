package com.example.petri.myapplication;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by petri on 11/18/2018.
 */

public class Notification extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_button);

        Button btn = (Button) findViewById(R.id.notification);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });



    }

    public void notificationcall(){
        NotificationCompat.Builder notificationBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setSmallIcon(R.drawable.small_icon)

                .setContentTitle("Your daily Habit")
                .setContentText("How's your habits coming along");
                //.setLights(int argb, int onMs, int offMs);

        NotificationManager notificatonManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificatonManager.notify(1, notificationBuilder.build());


    }
}
