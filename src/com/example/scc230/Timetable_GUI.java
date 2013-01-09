package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Timetable_GUI extends Activity {

	int applicationState = 2;
	ImageButton homeTab;
	Intent openFeedback = new Intent("android.intent.action.FEEDBACK");

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timetable__gui);
		
		homeTab = (ImageButton) findViewById(R.id.imageButtonHome);
		homeTab.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openFeedback);
				//setContentView(R.layout.activity_timetable__gui);
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
