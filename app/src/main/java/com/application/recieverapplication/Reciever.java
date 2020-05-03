package com.application.recieverapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/*
Created by Pranali Gaikwad
*/
/**/
/*
*
*
* */
public class Reciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("SMS","onRecieve method");
        Toast.makeText(context,"Broadcast Receiver triggered..!",Toast.LENGTH_SHORT).show();
    }
}
