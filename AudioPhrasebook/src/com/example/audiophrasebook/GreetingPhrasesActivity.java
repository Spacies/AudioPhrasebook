package com.example.audiophrasebook;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class GreetingPhrasesActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_greeting_phrases);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.greeting_phrases, menu);
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
	
	public void playPhrase(View v)
	{
		MediaPlayer mp;
		String buttonNum = (String) v.getTag();
		switch (buttonNum)
		{
		case "1":
			mp = MediaPlayer.create(this, R.raw.eng_hello);  
			  mp.start();
			  break;
		case "2":
			mp = MediaPlayer.create(this, R.raw.adios);  
			  mp.start();
			  break;
		case "3":
			mp = MediaPlayer.create(this, R.raw.alrighty);  
			  mp.start();
			  break;
		case "4":
			mp = MediaPlayer.create(this, R.raw.adios);  
			  mp.start();
			  break;
		case "5":
			mp = MediaPlayer.create(this, R.raw.alrighty);  
			  mp.start();
			  break;
		case "6":
			mp = MediaPlayer.create(this, R.raw.adios);  
			  mp.start();
			  break;
		case "7":
			mp = MediaPlayer.create(this, R.raw.alrighty);  
			  mp.start();
			  break;
		}
	}
	
	public void goBack(View v)
	{
		this.finish();
	}
	
	/**
	 * Starts new main activity and pops all other activities from the stack.
	 * @param v
	 */
	public void transitionMainMenu(View v)
	{
		Intent intent = new Intent(getApplicationContext(), MainActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
	}
}
