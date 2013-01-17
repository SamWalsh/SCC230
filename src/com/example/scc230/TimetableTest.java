/*package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;*/

package com.example.scc230;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DigitalClock;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class TimetableTest extends Activity implements OnClickListener {
	// Called when the activity is first created.
	Button buttonForward;
	Button buttonBack; 
	Button btn;
	int counter=0;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timetable_test);
		buttonForward = (Button) findViewById(R.id.buttonForward);
		//buttonBack = (Button) findViewById(R.id.buttonBack);
		//btn=(Button)findViewById(R.id.Button01);
		btn.setOnClickListener( this);

	}
	public void onClick(View view){
		TableLayout tl=(TableLayout)findViewById(R.id.tableRowMonday);
		TableRow tr=new TableRow(this);
		
		counter++;
		
		TextView tv= new TextView(this);
		tv.setText("text"+counter);
		
		CheckBox cb=new CheckBox(this);
		DigitalClock dc= new DigitalClock(this);
		ImageView ib=new ImageView(this);
		
		ib.setImageResource(R.drawable.ic_launcher);
		
		tr.addView(tv);
		tr.addView(ib);
		tr.addView(dc);
		tr.addView(cb);
		tl.addView(tr, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_timetable_test, menu);
		return true;
	}


}

/*public class TimetableTest extends Activity implements OnClickListener {

	Button buttonForward;
	Button buttonBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timetable_test);
		
		TableLayout tl = (TableLayout)findViewById(R.id.tableRowMonday);
		final TableRow tr = new TableRow(this);
		
		buttonForward = (Button) findViewById(R.id.buttonForward);
		buttonBack = (Button) findViewById(R.id.buttonBack);
		buttonForward.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				tr.setLayoutParams(new LayoutParams(
						LayoutParams.FILL_PARENT,
						LayoutParams.WRAP_CONTENT));
				
				//startActivity(openTimetable);
				//setContentView(R.layout.activity_timetable__gui);
			}
		});
		
		// Find Tablelayout defined in main.xml 
		// Create a new row to be added.
		
		// Create a Button to be the row-content. 
		Button b = new Button(this);
		b.setText("Dynamic Button");
		b.setLayoutParams(new LayoutParams(
				LayoutParams.FILL_PARENT,
				LayoutParams.WRAP_CONTENT));
		// Add Button to row. 
		tr.addView(b);
		// Add row to TableLayout. 
		tl.addView(tr,new TableLayout.LayoutParams(
				LayoutParams.FILL_PARENT,
				LayoutParams.WRAP_CONTENT));
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_timetable_test, menu);
		return true;
	}

	

}*/
