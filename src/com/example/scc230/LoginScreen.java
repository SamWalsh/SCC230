package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends Activity {
	
	int applicationState = 1;
	Button logIn;
	Intent openTimetable = new Intent("android.intent.action.TIMETABLE");
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_screen);
		
		logIn = (Button) findViewById(R.id.buttonLogIn);
		logIn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openTimetable);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});
		
		/*Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openTimetable = new Intent("android.intent.action.TIMETABLE");
					startActivity(openTimetable);
				}
			}
		};
		
		timer.start();*/
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login_screen, menu);
		return true;
	}

}
