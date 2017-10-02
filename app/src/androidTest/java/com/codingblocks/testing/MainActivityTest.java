package com.codingblocks.testing;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 * Created by nimit on 2/10/17.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    public MainActivity mainActivity;

    @Rule
    public ActivityTestRule<MainActivity> mainActRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void startActivity() {
       // mainActRule.getActivity to simpliy create activity
      //  mainActRule.launchActivity() if want to launch with particulart intent data
        mainActivity = mainActRule.getActivity();
    }

    @Test
    public void calcFareWorksOnUithread() {
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ((EditText)mainActivity.findViewById(R.id.etkm)).setText("0");
                ((EditText)mainActivity.findViewById(R.id.etmin)).setText("0");
                ((Button)mainActivity.findViewById(R.id.btnCalcFare)).performClick();

                String result = ((TextView)mainActivity.findViewById(R.id.result)).getText().toString();

                assertEquals("50.0", result);
            }
        });
    }
}
