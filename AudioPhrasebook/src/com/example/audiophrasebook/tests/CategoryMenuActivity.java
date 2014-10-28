package com.example.audiophrasebook.tests;




import com.example.audiophrasebook.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CategoryMenuActivity extends Activity {
	
	public void goBack(View v)
	{
		this.finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category_menu_eng);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.general_menu, menu);
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
	
	public void transitionDiningout(View v)
	{
		Intent intent = new Intent(this, DiningoutPhrasesActivity.class);
		startActivity(intent);
	}
	
	public void transitionDirection(View v)
	{
		Intent intent = new Intent(this, DirectionPhrasesActivity.class);
		startActivity(intent);
	}
	
	public void transitionGreeting(View v)
	{
		Intent intent = new Intent(this, GreetingPhrasesActivity.class);
		startActivity(intent);
	}
	
	public void transitionShopping(View v)
	{
		Intent intent = new Intent(this, ShoppingPhrasesActivity.class);
		startActivity(intent);
	}
}
