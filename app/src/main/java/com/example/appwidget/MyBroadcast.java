package com.example.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBroadcast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String str = intent.getAction();

		if (str.endsWith("TEXT")) {
			Intent intent1 = new Intent(context, MainActivity.class);
			intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			intent1.putExtra("data2", 11);
			context.startActivity(intent1);

			// Toast.makeText(context, "Text", Toast.LENGTH_SHORT).show();
		}

		if (str.endsWith("PHOTO")) {
			Intent intent1 = new Intent(context, MainActivity.class);
			intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			intent1.putExtra("data2", 12);
			context.startActivity(intent1);
		}
		if (str.endsWith("VIDEO")) {
			Intent intent1 = new Intent(context, MainActivity.class);
			intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			intent1.putExtra("data2", 13);
			context.startActivity(intent1);
		}

	}

}
