package com.example.audiophrasebook.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import android.support.v7.app.ActionBarActivity;

import com.example.audiophrasebook.MainActivity;



import com.example.audiophrasebook.R;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.Button;

@SuppressWarnings("unused")
public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {
	
	private Intent mMainIntent;

	public MainActivityTest() {
        super(MainActivity.class);
    }

	@Before
	protected void setUp() throws Exception {
        super.setUp();
        //Create an intent to launch target Activity
        mMainIntent = new Intent(getInstrumentation().getTargetContext(),
                MainActivity.class);
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}


	/**
     * Tests the preconditions of this test fixture.
     */
    @MediumTest
    public void testStartButton() {
        //Start the activity under test in isolation, without values for savedInstanceState and
       //lastNonConfigurationInstance
    	startActivity(mMainIntent, null, null);
        final Button launchNextButton = (Button) getActivity().findViewById(R.id.button1);
        launchNextButton.performClick();

        assertNotNull("mLaunchActivity is null", getActivity());
        assertNotNull("mLaunchNextButton is null", launchNextButton);
    }
    
    public void testOptionButton() {
        //Start the activity under test in isolation, without values for savedInstanceState and
       //lastNonConfigurationInstance
    	startActivity(mMainIntent, null, null);
        final Button launchNextButton = (Button) getActivity().findViewById(R.id.button2);
        launchNextButton.performClick();

        assertNotNull("mLaunchActivity is null", getActivity());
        assertNotNull("mLaunchNextButton is null", launchNextButton);
    }


}
