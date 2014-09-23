package com.example.audiophrasebook.tests;

import com.example.audiophrasebook.MainActivity;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.Button;

public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {
	private Intent mMainIntent;
	
	public MainActivityTest() {
        super(MainActivity.class);
    }
	
	@Override
    protected void setUp() throws Exception {
        super.setUp();
        //Create an intent to launch target Activity
        mMainIntent = new Intent(getInstrumentation().getTargetContext(),
                MainActivity.class);
    }
	
	/**
     * Tests the preconditions of this test fixture.
     */
    @MediumTest
    public void testPreconditions() {
        //Start the activity under test in isolation, without values for savedInstanceState and
        //lastNonConfigurationInstance
        startActivity(mMainIntent, null, null);
        final Button launchNextButton = (Button) getActivity().findViewById(R.id.launch_next_activity_button);

        assertNotNull("mLaunchActivity is null", getActivity());
        assertNotNull("mLaunchNextButton is null", launchNextButton);
    }
}
