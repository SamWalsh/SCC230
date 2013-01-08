package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Notifications_GUI extends Activity {
	
	int applicationState = 5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notifications__gui);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_notifications__gui, menu);
		return true;
	}

}
