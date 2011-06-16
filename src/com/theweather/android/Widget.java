package com.theweather.android;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

public class Widget extends AppWidgetProvider {
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		 RemoteViews remoteViews = new RemoteViews(context.getPackageName(),R.layout.widget);
	     remoteViews.setTextViewText(R.id.TextView1, "string");
	     appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
	}
};