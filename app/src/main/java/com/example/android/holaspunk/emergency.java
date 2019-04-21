package com.example.android.holaspunk;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.AndroidConfig;
import com.google.firebase.messaging.AndroidNotification;
import com.google.firebase.messaging.ApnsConfig;
import com.google.firebase.messaging.Aps;
import com.google.firebase.messaging.ApsAlert;
import com.google.firebase.messaging.BatchResponse;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.MulticastMessage;
import com.google.firebase.messaging.Notification;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.SendResponse;
import com.google.firebase.messaging.TopicManagementResponse;
import com.google.firebase.messaging.WebpushConfig;
import com.google.firebase.messaging.WebpushNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class emergency extends FirebaseMessagingService {

    double[] latlonf = new double[4] ;
    public void newfun () {

        double[] latlon = new double[2] ;

        AccessingFirebase af = new AccessingFirebase();
        latlon = af.getmydevicelocaton();

        double x = 5/1100 ;
        double y = 5/1110 ;

        latlonf[0] = latlon[0] + y ;
        latlonf[1] = latlon[0] - y ;
        latlonf[2] = latlon[1] + x ;
        latlonf[3] = latlon[1] - x ;

        //if the user is in or not code

        public class FirebaseMessagingSnippets {

            public void sendToToken() throws FirebaseMessagingException {
                // [START send_to_token]
                // This registration token comes from the client FCM SDKs.
                devicegrp ob = new devicegrp() ;

                String[] registrationToken = ob.gettoken();

                Builder = ;
                Bundle b = new Bundle() ;
                b.putChar("key",'p');
                // See documentation on defining a message payload.
                Message message = Message.
                        .setData(b)
                        .setToken(registrationToken)
                        .build();

            }

            Messagi

        }

    }
}
