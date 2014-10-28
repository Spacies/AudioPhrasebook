package com.example.audiophrasebook;

import com.example.audiophrasebook.extras.Globals;
import com.example.audiophrasebook.extras.Language;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DiningoutPhrasesActivity extends Activity {

	public void goBack(View v) {
		this.finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Set the UI language.
		switch (Globals.UI)
		{
		case ENGLISH:
			setContentView(R.layout.activity_diningout_phrases_eng);
			break;
		case KOREAN:
			setContentView(R.layout.activity_diningout_phrases_kor);
			break;
		default:
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.diningout_phrases, menu);
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
	 * Plays the selected phrase in the selected language.
	 * @param v
	 */
	public void playPhrase(View v) {
		MediaPlayer mp;
		String buttonNum = (String) v.getTag();

		if (Globals.PHRASE == Language.ENGLISH) {
			switch (buttonNum) {
			case "1":
				mp = MediaPlayer.create(this, R.raw.eng_canihavethemenuplease);
				mp.start();
				break;
			case "2":
				mp = MediaPlayer
						.create(this, R.raw.eng_whatwouldyouliketodrink);
				mp.start();
				break;
			case "3":
				mp = MediaPlayer.create(this, R.raw.eng_iwouldlikeaglassofwine);
				mp.start();
				break;
			case "4":
				mp = MediaPlayer.create(this, R.raw.eng_whatcanigetyou);
				mp.start();
				break;
			case "5":
				mp = MediaPlayer.create(this, R.raw.eng_idlikethesteak);
				mp.start();
				break;
			case "6":
				mp = MediaPlayer.create(this, R.raw.eng_checkplease);
				mp.start();
				break;
			}
		} else if (Globals.PHRASE == Language.KOREAN) {
			switch (buttonNum) {
			case "1":
				mp = MediaPlayer.create(this, R.raw.kor_canihavethemenuplease);
				mp.start();
				break;
			case "2":
				mp = MediaPlayer
						.create(this, R.raw.kor_whatwouldyouliketodrink);
				mp.start();
				break;
			case "3":
				mp = MediaPlayer.create(this, R.raw.kor_iwouldlikeaglassofwine);
				mp.start();
				break;
			case "4":
				mp = MediaPlayer.create(this, R.raw.kor_whatcanigetyou);
				mp.start();
				break;
			case "5":
				mp = MediaPlayer.create(this, R.raw.kor_idlikethesteak);
				mp.start();
				break;
			case "6":
				mp = MediaPlayer.create(this, R.raw.kor_checkplease);
				mp.start();
				break;
			}
		}
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
}
