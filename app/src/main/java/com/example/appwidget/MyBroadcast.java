package com.example.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBroadcast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String str = intent.getAction();

		Intent intent1 = new Intent(context, MainActivity.class);
		intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		intent1.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

		if (str.endsWith("msg1")) {
			intent1.putExtra("data", 1);
		}
		if (str.endsWith("msg2")) {
			intent1.putExtra("data", 2);
		}
		if (str.endsWith("msg3")) {
			intent1.putExtra("data", 3);
		}
		context.startActivity(intent1);

	}

}
