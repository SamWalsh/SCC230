package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import com.example.scc230.R;

public class LoginScreen extends Activity {

	int applicationState = 1;
	Button logIn;
	Intent openTimetable = new Intent("android.intent.action.TIMETABLE");
	EditText editTextUsername;
	EditText editTextPassword;
	TextWatcher usernameInput;
	TextWatcher passwordInput;
	ImageButton homeTab;
	ImageButton settingsTab;
	ImageButton notificationsTab;
	ImageButton backTab;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_screen);

		editTextUsername = (EditText) findViewById(R.id.editTextUsername);
		editTextPassword = (EditText) findViewById(R.id.editTextPassword);
		homeTab = (ImageButton) findViewById(R.id.imageButtonHome);
		settingsTab = (ImageButton) findViewById(R.id.imageButtonSettings);
		notificationsTab = (ImageButton) findViewById(R.id.imageButtonNotifications);
		backTab = (ImageButton) findViewById(R.id.imageButtonBack);

		logIn = (Button) findViewById(R.id.buttonLogIn);

		logIn.setEnabled(true);

		logIn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if(editTextUsername.getText().toString().length() != 0 && editTextPassword.getText().toString().length() != 0){
					startActivity(openTimetable);
				}else{
					Toast.makeText(getApplicationContext(), 
		                    "Please enter a username & password", Toast.LENGTH_SHORT).show();
				}
			}
		});

		homeTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), 
						"Please log in", Toast.LENGTH_SHORT).show();
			}
		});

		settingsTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), 
						"Please log in", Toast.LENGTH_SHORT).show();
			}
		});

		notificationsTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), 
						"Please log in", Toast.LENGTH_SHORT).show();
			}
		});

		backTab.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), 
						"Please log in", Toast.LENGTH_SHORT).show();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login_screen, menu);
		return true;
	}

}
