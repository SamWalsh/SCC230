package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.scc230.R;
import com.jjoe64.graphview.BarGraphView;
import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.GraphViewSeries;

public class Stats_Graph_GUI extends Activity {

	int applicationState = 5;

	ImageButton homeTab;
	ImageButton settingsTab;
	ImageButton notificationsTab;
	ImageButton backTab;

	Intent openLecturerReply = new Intent("android.intent.action.LECTURERREPLY");
	Intent openTimetable = new Intent("android.intent.action.TIMETABLE");
	Intent openSettings = new Intent("android.intent.action.SETTINGS");
	Intent openNotifications = new Intent("android.intent.action.NOTIFICATIONS");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notifications__gui);

		homeTab = (ImageButton) findViewById(R.id.imageButtonHome);
		settingsTab = (ImageButton) findViewById(R.id.imageButtonSettings);
		notificationsTab = (ImageButton) findViewById(R.id.imageButtonNotifications);
		backTab = (ImageButton) findViewById(R.id.imageButtonBack);

		settingsTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openSettings);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		homeTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openTimetable);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		notificationsTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openNotifications);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		backTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});

		BarGraphView graphView = new BarGraphView(
				this
				, "GraphViewDemo"
				);
		graphView.addSeries(new GraphViewSeries(new GraphViewData[] {
				new GraphViewData(1, 2.0d)
				, new GraphViewData(2, 1.5d)
				, new GraphViewData(2.5, 3.0d)
				, new GraphViewData(3, 2.5d)
				, new GraphViewData(4, 1.0d)
				, new GraphViewData(5, 3.0d)
		}));
	
		LinearLayout layout = (LinearLayout) findViewById(R.id.subLayout);
		layout.addView(graphView); 

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_stats_graph__gui, menu);
		return true;
	}

}
