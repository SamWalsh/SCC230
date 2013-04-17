package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.scc230.R;

public class Settings_GUI extends Activity {

	ImageButton homeTab;
	ImageButton settingsTab;
	ImageButton notificationsTab;
	ImageButton backTab;
	Button appIntro;
	Button share;
	Button feedback;
	Button termsofuse;
	Button about;
	Button logout;

	Intent openLecturerReply = new Intent("android.intent.action.LECTURERREPLY");
	Intent openTimetable = new Intent("android.intent.action.TIMETABLE");
	Intent openSettings = new Intent("android.intent.action.SETTINGS");
	Intent openNotifications = new Intent("android.intent.action.NOTIFICATIONS");
	Intent openSettingsIntroduction = new Intent("android.intent.action.SETTINGSINTRODUCTION");
	Intent openSettingsSharing = new Intent("android.intent.action.SETTINGSSHARING");
	Intent openSettingsFeedback = new Intent("android.intent.action.SETTINGSFEEDBACK");
	Intent openSettingsTermsofuse = new Intent("android.intent.action.SETTINGSTERMSOFUSE");
	Intent openSettingsAbout = new Intent("android.intent.action.SETTINGSABOUT");
	Intent closeApplication = new Intent("android.intent.action.CLOSE");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings__gui);

		homeTab = (ImageButton) findViewById(R.id.imageButtonHome);
		settingsTab = (ImageButton) findViewById(R.id.imageButtonSettings);
		notificationsTab = (ImageButton) findViewById(R.id.imageButtonNotifications);
		backTab = (ImageButton) findViewById(R.id.imageButtonBack);
		appIntro = (Button) findViewById(R.id.appIntro);
		share = (Button) findViewById(R.id.share);
		feedback = (Button) findViewById(R.id.feedback);
		termsofuse = (Button) findViewById(R.id.termsofuse);
		about = (Button) findViewById(R.id.about);
		logout = (Button) findViewById(R.id.logout);

		logout.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				System.exit(0);
			}
		});

		about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openSettingsAbout);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		termsofuse.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openSettingsTermsofuse);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		feedback.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openSettingsFeedback);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		share.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openSettingsSharing);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		appIntro.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openSettingsIntroduction);
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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_settings__gui, menu);
		return true;
	}

}
