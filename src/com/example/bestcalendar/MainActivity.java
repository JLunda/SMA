package com.example.bestcalendar;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity {

	
	private static final String[] hours = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11","12"};
	private static final String[] mins = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60"};
	private static final String[] periods = {"AM","PM"};
	private static final String[] months = {"Jan", "Feb", "Mar","Apr", "Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private static final String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	private static final String[] years = {"2013","2014","2015","2016","2017","2018","2019","2020"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //setup button listener for Add Event
        Button addEventButton =(Button) findViewById(R.id.add_event_button);
        addEventButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//onclick code for add event button
				setContentView(R.layout.add_event_layout);
				//code for hour spinner
				Spinner hoursSpinner = (Spinner) findViewById(R.id.h_spinner);
				ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(MainActivity.this , R.layout.hspinner_entry, hours);
				mAdapter.setDropDownViewResource(R.layout.hspinner_entry);
				hoursSpinner.setAdapter(mAdapter);
				//code for min spinner
				Spinner minSpinner = (Spinner) findViewById(R.id.m_spinner);	
				ArrayAdapter<String> mAdapter2 = new ArrayAdapter<String>(MainActivity.this , R.layout.hspinner_entry, mins);
				mAdapter2.setDropDownViewResource(R.layout.hspinner_entry);
				minSpinner.setAdapter(mAdapter2);
				//code for period spinner
				Spinner periodSpinner = (Spinner) findViewById(R.id.p_spinner);
				ArrayAdapter<String> mAdapter3 = new ArrayAdapter<String>(MainActivity.this , R.layout.hspinner_entry, periods);
				mAdapter3.setDropDownViewResource(R.layout.hspinner_entry);
				periodSpinner.setAdapter(mAdapter3);
				//code for month spinner
				Spinner monthSpinner = (Spinner) findViewById(R.id.month_spinner);
				ArrayAdapter<String> mAdapter4 = new ArrayAdapter<String>(MainActivity.this , R.layout.hspinner_entry, months);
				mAdapter4.setDropDownViewResource(R.layout.hspinner_entry);
				monthSpinner.setAdapter(mAdapter4);
				//code for day spinner 
				Spinner daySpinner = (Spinner) findViewById(R.id.day_spinner);
				ArrayAdapter<String> mAdapter5 = new ArrayAdapter<String>(MainActivity.this , R.layout.hspinner_entry, days);
				mAdapter5.setDropDownViewResource(R.layout.hspinner_entry);
				daySpinner.setAdapter(mAdapter5);
				//code for year spinner
				Spinner yearSpinner = (Spinner) findViewById(R.id.year_spinner);
				ArrayAdapter<String> mAdapter6 = new ArrayAdapter<String>(MainActivity.this , R.layout.hspinner_entry, years);
				mAdapter6.setDropDownViewResource(R.layout.hspinner_entry);
				yearSpinner.setAdapter(mAdapter6);
				
				Button eventButton =(Button) findViewById(R.id.enter_button);
		        eventButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// Put stuff for clicking settings button here	
						setContentView(R.layout.activity_main);
					}
				});
			}
		});
        
        Button settingsButton =(Button) findViewById(R.id.settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Put stuff for clicking settings button here				
			}
		});
        
            		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
