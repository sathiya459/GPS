package com.example.sathya_g.mine;

/**
 * Created by Sathya-G on 23-Jul-16.
 */

import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.preference.PreferenceManager;


public class InitiateOnBootClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Intent pushIntent = new Intent(context, LocationService.class);
            context.startService(pushIntent);
        }
    }
}