package com.mayeah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/**
 * 启动APP后的加载页面
 * @author weshine.chen
 *
 */
public class LoadingActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loading);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		loading();
	}

	private void loading() {
		//不做任何处理，3秒后关闭，进入首页
		Handler handler = new Handler();
		handler.postDelayed(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					startActivity(new Intent(LoadingActivity.this, MainActivity.class));
					finish();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}}, 3000);
		
	}
}
