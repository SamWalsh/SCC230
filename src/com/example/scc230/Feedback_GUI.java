package com.example.scc230;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;

public class Feedback_GUI extends Activity {

	int applicationState = 3;
	int count;
	int onOff = 1;
	TextView displayRating;
	TextView displayAverage;
	TextView commentView1;
	RatingBar ratingBar;
	Button submitRating;
	float simulationData = 2;
	ArrayList<Float> ratingList = new ArrayList<Float>();
	
	//ArrayList<EditText> commentList = new ArrayList<EditText>();
	float rating2;
	String comment;
	ImageButton homeTab;
	ImageButton settingsTab;
	ImageButton notificationsTab;
	ImageButton backTab;
	Button commentReply;
	Button submitComment;
	Button editLecture;
	static EditText typeComment;
	EditText lectureDescription;
	Intent openLecturerReply = new Intent("android.intent.action.LECTURERREPLY");
	Intent openTimetable = new Intent("android.intent.action.TIMETABLE");
	Intent openSettings = new Intent("android.intent.action.SETTINGS");
	Intent openNotifications = new Intent("android.intent.action.NOTIFICATIONS");
	//Intent goBack = new Intent("android.intent.action.LECTURERREPLY");


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback__gui);
		ratingList.add(simulationData);
		
		homeTab = (ImageButton) findViewById(R.id.imageButtonHome);
		settingsTab = (ImageButton) findViewById(R.id.imageButtonSettings);
		notificationsTab = (ImageButton) findViewById(R.id.imageButtonNotifications);
		backTab = (ImageButton) findViewById(R.id.imageButtonBack);
		commentReply = (Button) findViewById(R.id.buttonReply);
		ratingBar = (RatingBar) findViewById(R.id.ratingBar);
		displayRating = (TextView) findViewById(R.id.textView3);
		submitRating = (Button) findViewById(R.id.buttonSubmitRating);
		displayAverage = (TextView) findViewById(R.id.textView4);
		submitComment = (Button) findViewById(R.id.buttonSubmitComment);
		typeComment = (EditText) findViewById(R.id.editTextCommentInput);
		commentView1 = (TextView) findViewById(R.id.TextViewComment1);
		editLecture = (Button) findViewById(R.id.buttonDescriptionEdit);
		lectureDescription = (EditText) findViewById(R.id.editTextLectureDescription);
		lectureDescription.setEnabled(false);

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

		commentReply.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(openLecturerReply);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

			public void onRatingChanged(RatingBar rating, float rating1,
					boolean fromUser) {

				rating2 = rating1;
				displayRating.setText(String.valueOf(rating1));

			}
		});

		submitRating.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				ratingList.add(rating2);
				averageCalc();
				submitRating.setEnabled(false);

				//setContentView(R.layout.activity_timetable__gui);
			}
		});


		/*typeComment.setOnFocusChangeListener(new View.OnFocusChangeListener() {

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				comment = typeComment.getText().toString();
		        //Log.d(DEBUG_TAG, "User set EditText value to " + strValue);
			}
		});*/

		submitComment.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {


				commentView1.setText(typeComment.getText()); 
				
				//typeComment.getText());
				//commentList.add(comment);
				//System.out.print(comment);
				//System.out.print(commentList);
				//postComment();
				//submitRating.setEnabled(false);

				//setContentView(R.layout.activity_timetable__gui);
			}
		});

		editLecture.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				onOff++;

				if(onOff % 2 == 0){
					lectureDescription.setEnabled(true); //turn lecture description editable and uneditable
				}else{
					lectureDescription.setEnabled(false);
				}
				
				
				//System.out.print(commentList);
				//postComment();
				//submitRating.setEnabled(false);

				//setContentView(R.layout.activity_timetable__gui);
			}
		});
	}

	/*public void postComment(){

		String []newComment = new String[commentList.size()];
		commentList.toArray(newComment);
		System.out.printf("Comment: ",comment);
		System.out.printf("Array: ", newComment[0]);
		commentView1.setText(newComment[0]);

	}*/

	public void averageCalc(){

		float sum1 = 0;
		float sum2 = 0;
		float sum3 = 0;
		int count = ratingList.size();

		for(int i = 0; i < ratingList.size(); i++){

			sum1 = ratingList.get(i);
			sum2 = sum2 + sum1;

		}
		sum3 = sum2 / count;
		displayAverage.setText(String.valueOf(String.format("%.3g%n", sum3)));


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_feedback__gui, menu);
		return true;
	}

}
