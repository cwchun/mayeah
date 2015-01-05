package com.mayeah.activity;

import com.mayeah.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * 登录页面
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
	//初始化布局控件
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
			//登录
			
			break;
		case R.id.register_tv:
			//注册
			
			break;
		case R.id.tv_forget_password:
			//忘记密码
			
			break;
		case R.id.tv_have_question:
			//遇到问题
			
			break;

		default:
			break;
		}
	}
}
