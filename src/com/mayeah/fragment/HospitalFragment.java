package com.mayeah.fragment;

import java.util.ArrayList;
import java.util.List;

import com.mayeah.R;
import com.mayeah.activity.HospitalActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
/**
 * ÔºËùFragment
 * @author weshine.chen
 *
 */
public class HospitalFragment extends Fragment {
	private ListView hospitalsLv;
	private List data;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_hospital, container, false);
		initTestData();
		initViews(view);
		return view;
	}

	private void initTestData() {
		data = new ArrayList();
		data.add("111");
		data.add("111");
		data.add("111");
		data.add("111");
		data.add("111");
		data.add("111");
	}

	private void initViews(View view) {
		hospitalsLv = (ListView) view.findViewById(R.id.lv_hospitals);
		hospitalsLv.setAdapter(new HospitalAdapter());
	}
	
	class HospitalAdapter extends BaseAdapter{
		
		@Override
		public int getCount() {
			return data.size();
		}

		@Override
		public Object getItem(int arg0) {
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			return 0;
		}

		@Override
		public View getView(int position, View contentView, ViewGroup arg2) {
			if(contentView == null){
				contentView = LayoutInflater.from(getActivity()).inflate(R.layout.adapter_hospital_listview, null);
			}
			contentView.findViewById(R.id.rl_hospital).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent(getActivity(), HospitalActivity.class);
					getActivity().startActivity(intent);
				}
			});
			return contentView;
		}
		
	}
	
}
