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

public class OptionsMenuActivity extends Activity {

//	RadioButton r1 = (RadioButton) findViewById(R.id.radio_korean);
//	RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
//	radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() 
//    {
//        public void onCheckedChanged(RadioGroup group, int checkedId) {
//            System.out.println("PRINTED");
//        	// checkedId is the RadioButton selected
//        }
//    });
    
//	private Spinner spinner;
//    private static final String[]paths = {"English", "Korean"};
	
	public void goBack(View v)
	{
		this.finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
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
		
		
		
//		spinner = (Spinner)findViewById(R.id.spinner1);
//        ArrayAdapter<String>adapter = new ArrayAdapter<String>(OptionsMenuActivity.this,
//                android.R.layout.simple_spinner_item,paths);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        spinner.setOnClickListener(this);
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
	
//	Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
//	String[] items = new String[]{"English", "Korean"};
//	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
//	dropdown.setAdapter(adapter);
	
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
	
//	public void setPhraseLanguage(View v)
//	{
//		System.out.println("HELLO");
//	}
//	
//	public void setEnglish(View v) {
//		System.out.println("English");
//		Globals.PHRASE = Language.ENGLISH;
//    }
//	public void setKorean(View v)
//	{
//		System.out.println("Korean");
//		Globals.PHRASE = Language.KOREAN;
//	}
	
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
	            	//((RadioButton) v).setVisibility(View.VISIBLE);
	            }
	            break;
	        case R.id.radio_ui_kor:
	            if (checked)
	            {
	            	System.out.println("UI Korean");
	        		Globals.UI = Language.KOREAN;
	        		((RadioButton) v).setChecked(true);;
	            }
	            break;
	    	case R.id.radio_phrase_eng:
	            if (checked)
	            {
	            	System.out.println("Phrase English");
	            	Globals.PHRASE = Language.ENGLISH;
	            	//((RadioButton) v).setVisibility(View.VISIBLE);
	            }
	            break;
	        case R.id.radio_phrase_kor:
	            if (checked)
	            {
	            	System.out.println("Phrase Korean");
	        		Globals.PHRASE = Language.KOREAN;
	        		((RadioButton) v).setChecked(true);;
	            }
	            break;
	    }
	
	}
	
	
}
