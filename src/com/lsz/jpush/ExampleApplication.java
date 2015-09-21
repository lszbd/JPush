package com.lsz.jpush;

import cn.jpush.android.api.JPushInterface;
import android.app.Application;

public class ExampleApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		JPushInterface.setDebugMode(false);  // 设置是否为Debug模式
		JPushInterface.init(this);           // 初始化极光推送
	}
}
