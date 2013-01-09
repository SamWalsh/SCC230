package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Feedback_GUI extends Activity {

	int applicationState = 3;
	ImageButton settingsTab;
	Intent openLecturerReply = new Intent("android.intent.action.LECTURERREPLY");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback__gui);
		
		settingsTab = (ImageButton) findViewById(R.id.imageButtonSpanner);
		settingsTab.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openLecturerReply);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_feedback__gui, menu);
		return true;
	}

}
