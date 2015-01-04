package com.mayeah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/**
 * ����APP��ļ���ҳ��
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
		//�����κδ���3���رգ�������ҳ
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
