package com.example.audiophrasebook;

import com.example.audiophrasebook.extras.Globals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CategoryMenuActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Set the UI language.
		switch (Globals.UI)
		{
		case ENGLISH:
			setContentView(R.layout.activity_category_menu_eng);
			break;
		case KOREAN:
			setContentView(R.layout.activity_category_menu_kor);
			break;
		default:
			break;
		}
		
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
	
	/**
	 * Transitions to dining out activity.
	 * @param v
	 */
	public void transitionDiningout(View v)
	{
		Intent intent = new Intent(this, DiningoutPhrasesActivity.class);
		startActivity(intent);
	}
	
	/**
	 * Transitions to direction activity.
	 * @param v
	 */
	public void transitionDirection(View v)
	{
		Intent intent = new Intent(this, DirectionPhrasesActivity.class);
		startActivity(intent);
	}
	
	/**
	 * Transitions to greeting activity.
	 * @param v
	 */
	public void transitionGreeting(View v)
	{
		Intent intent = new Intent(this, GreetingPhrasesActivity.class);
		startActivity(intent);
	}
	
	/**
	 * Transitions to shopping activity.
	 * @param v
	 */
	public void transitionShopping(View v)
	{
		Intent intent = new Intent(this, ShoppingPhrasesActivity.class);
		startActivity(intent);
	}
	
	/**
	 * Starts new main activity and pops all other activities from the stack.
	 * 
	 * @param v
	 */
	public void transitionMainMenu(View v) {
		Intent intent = new Intent(getApplicationContext(), MainActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
	}
	
	/**
	 * Pops this activity and goes back to the last one.
	 * @param v
	 */
	public void goBack(View v)
	{
		this.finish();
	}
}
