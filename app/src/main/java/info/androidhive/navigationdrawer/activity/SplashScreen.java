package info.androidhive.navigationdrawer.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import info.androidhive.navigationdrawer.R;


public class SplashScreen extends Activity {
	 // Splash screen timer
	
    private static int SPLASH_TIME_OUT = 3000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashpage);
		new Handler().postDelayed(new Runnable() {
			 
           
 
            @Override
            public void run() {

            		Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
//
              

            }
        }, SPLASH_TIME_OUT);
	}

}
