package com.mayeah.activity;

import com.mayeah.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
/**
 * �һ�����
 * @author weshine.chen
 *
 */
public class FindPasswordActivity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_password);
		setupViews();
	}
	
	//��ʼ�����ֿؼ�
	private void setupViews() {
		TextView titleTv = (TextView) findViewById(R.id.title_tv);
		titleTv.setText("�һ�����");
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.back_btn:
			
			break;

		default:
			break;
		}
	}
}
