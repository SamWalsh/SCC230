package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.example.scc230.R;

public class Timetable_GUI extends Activity {

	int applicationState = 2;
	ImageButton homeTab;
	ImageButton settingsTab;
	ImageButton notificationsTab;
	ImageButton backTab;
	Intent openFeedback = new Intent("android.intent.action.FEEDBACK");

	Intent openLecturerReply = new Intent("android.intent.action.LECTURERREPLY");
	Intent openTimetable = new Intent("android.intent.action.TIMETABLE");
	Intent openSettings = new Intent("android.intent.action.SETTINGS");
	Intent openNotifications = new Intent("android.intent.action.NOTIFICATIONS");


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timetable__gui);
		
		Toast.makeText(getApplicationContext(), 
				"Click HOME tab to go to Feedback page", Toast.LENGTH_LONG).show();

		homeTab = (ImageButton) findViewById(R.id.imageButtonHome);
		settingsTab = (ImageButton) findViewById(R.id.imageButtonSettings);
		notificationsTab = (ImageButton) findViewById(R.id.imageButtonNotifications);
		backTab = (ImageButton) findViewById(R.id.imageButtonBack);

		homeTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openFeedback);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		settingsTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openSettings);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		notificationsTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					startActivity(openNotifications); //memory error? not working
					finish();
				}catch(NullPointerException e){
					System.out.println(e.getMessage());
				}
				
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		backTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_timetable__gui, menu);
		return true;
	}

}
