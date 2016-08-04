package com.example.alarmexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// Start the MainActivity
	     Intent i = new Intent(context, MainActivity.class);
	     i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	     context.startActivity(i);

	}

}
