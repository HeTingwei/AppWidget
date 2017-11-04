package com.example.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class DesktopApp extends AppWidgetProvider {

	final String UPDATE_ACTION = "com.example.appwidget.";

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {

		final int N = appWidgetIds.length;

		// Perform this loop procedure for each App Widget that belongs to this
		// provider
		for (int i = 0; i < N; i++) {
			int appWidgetId = appWidgetIds[i];

			// Create an Intent to launch ExampleActivity
			RemoteViews views = new RemoteViews(context.getPackageName(),
					R.layout.desk_app_layout);

			Intent intent = new Intent();
			intent.setAction(UPDATE_ACTION + "msg1");
			PendingIntent pendingIntent = PendingIntent.getBroadcast(context,
					0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
			views.setOnClickPendingIntent(R.id.deskText, pendingIntent);

			Intent intent1 = new Intent();
			intent1.setAction(UPDATE_ACTION + "msg2");
			PendingIntent pendingIntent1 = PendingIntent.getBroadcast(context,
					0, intent1, PendingIntent.FLAG_UPDATE_CURRENT);
			views.setOnClickPendingIntent(R.id.deskPhoto, pendingIntent1);

			Intent intent2 = new Intent();
			intent2.setAction(UPDATE_ACTION + "msg3");
			PendingIntent pendingIntent2 = PendingIntent.getBroadcast(context,
					0, intent2, PendingIntent.FLAG_UPDATE_CURRENT);
			views.setOnClickPendingIntent(R.id.deskVideo, pendingIntent2);
			appWidgetManager.updateAppWidget(appWidgetId, views);

		}

	}

}