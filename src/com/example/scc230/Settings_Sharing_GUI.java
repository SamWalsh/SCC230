package com.example.scc230;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import com.example.scc230.R;

public class Settings_Sharing_GUI extends Activity {

	ImageButton homeTab;
	ImageButton settingsTab;
	ImageButton notificationsTab;
	ImageButton backTab;
	ImageButton tweet;
	ImageButton facebook;

	Intent openLecturerReply = new Intent("android.intent.action.LECTURERREPLY");
	Intent openTimetable = new Intent("android.intent.action.TIMETABLE");
	Intent openSettings = new Intent("android.intent.action.SETTINGS");
	Intent openNotifications = new Intent("android.intent.action.NOTIFICATIONS");
	Intent openTwitter = new Intent("android.intent.action.TWITTER");
	String tweetUrl = "https://twitter.com/intent/tweet?text= test test test &url= " + "https://www.google.com";
	String facebookUrl = "https://facebook.com/ &url= " + "https://www.google.com";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings_sharing__gui);

		homeTab = (ImageButton) findViewById(R.id.imageButtonHome);
		settingsTab = (ImageButton) findViewById(R.id.imageButtonSettings);
		notificationsTab = (ImageButton) findViewById(R.id.imageButtonNotifications);
		backTab = (ImageButton) findViewById(R.id.imageButtonBack);
		tweet = (ImageButton) findViewById(R.id.tweet);
		facebook = (ImageButton) findViewById(R.id.facebook);

		facebook.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				shareFacebook();
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		tweet.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				share();
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

	}

	private void share() {
		Uri uri = Uri.parse(tweetUrl);
		startActivity(new Intent(Intent.ACTION_VIEW, uri));
	}

	private void shareFacebook(){
		Uri uri = Uri.parse(facebookUrl);
		startActivity(new Intent(Intent.ACTION_VIEW, uri));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_settings_sharing__gui, menu);
		return true;
	}

}
