package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Lecturer_Reply_GUI extends Activity {
	
	int applicationState = 6;
	
	ImageButton notificationsTab;
	Intent openNotifications = new Intent("android.intent.action.NOTIFICATIONS");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lecturer__reply__gui);
		
		notificationsTab = (ImageButton) findViewById(R.id.imageButtonNotifications);
		notificationsTab.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openNotifications);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_lecturer__reply__gui, menu);
		return true;
	}

}
