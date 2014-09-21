package com.example.audiophrasebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
	
	public void transitionCategoryMenu(View v)
	{
		Intent intent = new Intent(this, CategoryMenuActivity.class);
		startActivity(intent);
	}
	
	public void transitionOptionsMenu(View v)
	{
		Intent intent = new Intent(this, OptionsMenuActivity.class);
		startActivity(intent);
	}
	
	public void transitionExitApplication(View arg0)
	{
		android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
	}
	
}
