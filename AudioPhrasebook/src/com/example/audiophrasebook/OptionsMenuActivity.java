package com.example.audiophrasebook;

import com.example.audiophrasebook.extras.Globals;
import com.example.audiophrasebook.extras.Language;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class OptionsMenuActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Set UI language.
		switch (Globals.UI)
		{
		case ENGLISH:
			setContentView(R.layout.activity_options_menu_eng);
			break;
		case KOREAN:
			setContentView(R.layout.activity_options_menu_kor);
			break;
		default:
			break;
		}
		
		// Set which buttons are selected.
		setRadioButtons();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options_menu, menu);
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
	 * Starts new main activity and pops all other activities from the stack.
	 * @param v
	 */
	public void transitionMainMenu(View v)
	{
		Intent intent = new Intent(getApplicationContext(), MainActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
	}
	
	/**
	 * Pops this activity and goes back to the last activity.
	 * @param v
	 */
	public void goBack(View v)
	{
		this.finish();
	}
	
	/**
	 * Sets the selected radio button.
	 */
	private void setRadioButtons()
	{
		RadioGroup radioGroupUI = (RadioGroup) findViewById(R.id.radioGroup1);
		radioGroupUI.clearCheck();
		if(Globals.UI == Language.ENGLISH)
		{
			radioGroupUI.check(findViewById(R.id.radio_ui_eng).getId());
		}
		else if(Globals.UI == Language.KOREAN)
		{
			radioGroupUI.check(findViewById(R.id.radio_ui_kor).getId());
		}
		
		RadioGroup radioGroupPhrase = (RadioGroup) findViewById(R.id.radioGroup2);
		radioGroupPhrase.clearCheck();
		if(Globals.PHRASE == Language.ENGLISH)
		{
			radioGroupPhrase.check(findViewById(R.id.radio_phrase_eng).getId());
		}
		else if(Globals.PHRASE == Language.KOREAN)
		{
			radioGroupPhrase.check(findViewById(R.id.radio_phrase_kor).getId());
		}
		
		RadioGroup radioGroupGPS = (RadioGroup) findViewById(R.id.radioGroup3);
		radioGroupGPS.clearCheck();
		if(Globals.AUTO_LANGUAGE == true)
		{
			radioGroupPhrase.check(findViewById(R.id.radio_gps_on).getId());
		}
		else if(Globals.AUTO_LANGUAGE == false)
		{
			radioGroupPhrase.check(findViewById(R.id.radio_gps_off).getId());
		}
	}
	
	/**
	 * Sets the global UI and phrase language values.
	 * @param v
	 */
	public void onRadioButtonClicked(View v)
	{
		// Is the button now checked?
	    boolean checked = ((RadioButton) v).isChecked();
	    
	    // Check which radio button was clicked
	    switch(v.getId()) {
		    case R.id.radio_ui_eng:
	            if (checked)
	            {
	            	System.out.println("UI English");
	            	Globals.UI = Language.ENGLISH;
	            	setContentView(R.layout.activity_options_menu_eng);
	            	setRadioButtons();	            	
	            }
	            break;
	        case R.id.radio_ui_kor:
	            if (checked)
	            {
	            	System.out.println("UI Korean");
	        		Globals.UI = Language.KOREAN;
	        		setContentView(R.layout.activity_options_menu_kor);
	        		setRadioButtons();
	            }
	            break;
	    	case R.id.radio_phrase_eng:
	            if (checked)
	            {
	            	System.out.println("Phrase English");
	            	Globals.PHRASE = Language.ENGLISH;
	            	setRadioButtons();
	            }
	            break;
	        case R.id.radio_phrase_kor:
	            if (checked)
	            {
	            	System.out.println("Phrase Korean");
	        		Globals.PHRASE = Language.KOREAN;
	        		setRadioButtons();

	            }
	            break;
	        case R.id.radio_gps_on:
	            if (checked)
	            {
	            	System.out.println("GPS on");
	            	Globals.AUTO_LANGUAGE = true;
	            	setRadioButtons();
	            }
	            break;
	        case R.id.radio_gps_off:
	            if (checked)
	            {
	            	System.out.println("GPS off");
	        		Globals.AUTO_LANGUAGE = false;
	        		setRadioButtons();
	            }
	            break;
	    }
	
	}
	
	
}
