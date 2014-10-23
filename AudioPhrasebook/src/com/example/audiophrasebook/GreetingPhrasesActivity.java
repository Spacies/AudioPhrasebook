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

public class GreetingPhrasesActivity extends Activity {

	public void goBack(View v) {
		this.finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		switch (Globals.UI)
		{
		case ENGLISH:
			setContentView(R.layout.activity_greeting_phrases_eng);
			break;
		case KOREAN:
			setContentView(R.layout.activity_greeting_phrases_kor);
			break;
		default:
			break;
		}
		
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

	public void playPhrase(View v) {
		MediaPlayer mp;
		String buttonNum = (String) v.getTag();
		if (Globals.PHRASE == Language.ENGLISH) {
			switch (buttonNum) {
			case "1":
				mp = MediaPlayer.create(this, R.raw.eng_hello);
				mp.start();
				break;
			case "2":
				mp = MediaPlayer.create(this, R.raw.eng_howareyou);
				mp.start();
				break;
			case "3":
				mp = MediaPlayer.create(this, R.raw.eng_imfinethankyou);
				mp.start();
				break;
			case "4":
				mp = MediaPlayer.create(this, R.raw.eng_whatsyourname);
				mp.start();
				break;
			case "5":
				mp = MediaPlayer.create(this, R.raw.eng_mynameismrsmith);
				mp.start();
				break;
			case "6":
				mp = MediaPlayer.create(this, R.raw.eng_itsnicetomeetyou);
				mp.start();
				break;
			case "7":
				mp = MediaPlayer.create(this, R.raw.eng_goodbye);
				mp.start();
				break;
			}
		} else if (Globals.PHRASE == Language.KOREAN) {
			switch (buttonNum) {
			case "1":
				mp = MediaPlayer.create(this, R.raw.kor_hello);
				mp.start();
				break;
			case "2":
				mp = MediaPlayer.create(this, R.raw.kor_howareyou);
				mp.start();
				break;
			case "3":
				mp = MediaPlayer.create(this, R.raw.kor_imfinethankyou);
				mp.start();
				break;
			case "4":
				mp = MediaPlayer.create(this, R.raw.kor_whatsyourname);
				mp.start();
				break;
			case "5":
				mp = MediaPlayer.create(this, R.raw.kor_mynameismrsmith);
				mp.start();
				break;
			case "6":
				mp = MediaPlayer.create(this, R.raw.kor_itsnicetomeetyou);
				mp.start();
				break;
			case "7":
				mp = MediaPlayer.create(this, R.raw.kor_goodbye);
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
