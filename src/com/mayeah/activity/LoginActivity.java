package com.mayeah.activity;

import com.mayeah.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * ��¼ҳ��
 * @author weshine.chen
 *
 */
public class LoginActivity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		setupViews();
	}
	//��ʼ�����ֿؼ�
	private void setupViews() {
		findViewById(R.id.btn_login).setOnClickListener(this);
		findViewById(R.id.register_tv).setOnClickListener(this);
		findViewById(R.id.tv_forget_password).setOnClickListener(this);
		findViewById(R.id.tv_have_question).setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.btn_login:
			//��¼
			
			break;
		case R.id.register_tv:
			//ע��
			
			break;
		case R.id.tv_forget_password:
			//��������
			
			break;
		case R.id.tv_have_question:
			//��������
			
			break;

		default:
			break;
		}
	}
}
