package com.example.audiophrasebook;

import com.example.audiophrasebook.extras.GPSValue;
import com.example.audiophrasebook.extras.Globals;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	GPSValue gps;
	double theLatitude;
	double theLongitude;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Set the UI language
		switch (Globals.UI)
		{
		case ENGLISH:
			setContentView(R.layout.activity_main_eng);
			break;
		case KOREAN:
			setContentView(R.layout.activity_main_kor);
			break;
		default:
			break;
		}
		
		gps = new GPSValue(this);
		theLatitude = gps.getLatitude(); 
		theLongitude = gps.getLongitude();
//		System.out.println("Lat: " + theLatitude + " Long: " + theLongitude + " Location: " + gps.getLocation());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	/**
	 * Go to category menu after button click.
	 * @param v
	 */
	public void transitionCategoryMenu(View v)
	{
		Intent intent = new Intent(this, CategoryMenuActivity.class);
		startActivity(intent);
	}
	
	/**
	 * Exit the application.
	 * @param arg0
	 */
	public void transitionExitApplication(View arg0)
	{
		android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
	}
	
	/**
	 * Go to options menu after button click.
	 * @param v
	 */
	public void transitionOptionsMenu(View v)
	{
		Intent intent = new Intent(this, OptionsMenuActivity.class);
		startActivity(intent);
	}
	
}



