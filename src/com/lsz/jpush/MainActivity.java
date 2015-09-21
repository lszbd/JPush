package com.lsz.jpush;

import cn.jpush.android.api.JPushInterface;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onResume() {
		JPushInterface.onResume(getApplicationContext());
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		JPushInterface.onPause(getApplicationContext());
		super.onPause();
	}
}
