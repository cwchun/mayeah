package com.mayeah.activity;

import java.util.List;

import com.mayeah.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
/**
 * ҽԺҳ��
 * @author weshine.chen
 *
 */
public class HospitalActivity extends FragmentActivity {
	private List<Fragment> fragmentList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hospital);
		initViews();
	}

	private void initViews() {
		// TODO Auto-generated method stub
		
	}
}
