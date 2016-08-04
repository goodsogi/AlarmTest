package com.example.alarmexample;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setupAlarm();
	}

	private void setupAlarm() {
		AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
		Intent intent = new Intent(getBaseContext(), AlarmReceiver.class);
		PendingIntent pendingIntent = PendingIntent
				.getBroadcast(MainActivity.this, 0, intent,
						PendingIntent.FLAG_UPDATE_CURRENT);


		// Getting current time and add the seconds in it
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 3);

		alarmManager.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),
				pendingIntent);

		// Finish the currently running activity
		MainActivity.this.finish();

	}

}
