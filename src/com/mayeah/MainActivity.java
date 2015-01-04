package com.mayeah;

import com.mayeah.adapter.TabsPagerAdapter;
import com.mayeah.fragment.HomeFragment;
import com.mayeah.fragment.HospitalFragment;
import com.mayeah.fragment.MayeahFragment;
import com.mayeah.fragment.MyFragment;
import com.mayeah.model.Item;
import com.mayeah.widget.viewpagerindicator.TabPageIndicator;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {
	private ViewPager contentVp;
	private TabsPagerAdapter tabsPagerAdapter;
	private TabPageIndicator tabPageIndicator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initActionBar();
		initViews();
	}
	

	private void initViews() {
		contentVp = (ViewPager) findViewById(R.id.vp_content);
		tabsPagerAdapter = new TabsPagerAdapter(getSupportFragmentManager());
		tabsPagerAdapter.getFragments().add(new HomeFragment());
		tabsPagerAdapter.getTabItems().add(new Item(R.drawable.ic_launcher, "首页"));
		tabsPagerAdapter.getFragments().add(new MayeahFragment());
		tabsPagerAdapter.getTabItems().add(new Item(R.drawable.ic_launcher, "美嘢"));
		tabsPagerAdapter.getFragments().add(new HospitalFragment());
		tabsPagerAdapter.getTabItems().add(new Item(R.drawable.ic_launcher, "院所"));
		tabsPagerAdapter.getFragments().add(new MyFragment());
		tabsPagerAdapter.getTabItems().add(new Item(R.drawable.ic_launcher, "我的"));
		contentVp.setAdapter(tabsPagerAdapter);
		contentVp.setOffscreenPageLimit(4);//设置缓存4改fragment
		contentVp.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int position) {
				getSupportActionBar().setSelectedNavigationItem(position);
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}
			
			@Override
			public void onPageScrollStateChanged(int state) {
				switch (state) {
				case ViewPager.SCROLL_STATE_IDLE:
					
					break;

				default:
					break;
				}
			}
		});
		
		tabPageIndicator = (TabPageIndicator) findViewById(R.id.tpi_tabs);
		tabPageIndicator.setViewPager(contentVp);
	}

	@SuppressLint("NewApi")
	private void initActionBar() {
		ActionBar actionBar = getSupportActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.title_bg));
		actionBar.setIcon(getResources().getDrawable(R.drawable.icon));
		actionBar.setTitle("美嘢");
//		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//		MyTabListener tabListener = new MyTabListener();
//		Tab homeTab = actionBar.newTab().setText("首页").setTabListener(tabListener);
//		Tab mayeahTab = actionBar.newTab().setText("美嘢").setTabListener(tabListener);
//		Tab hospitalTab = actionBar.newTab().setText("院所").setTabListener(tabListener);
//		Tab myTab = actionBar.newTab().setText("我的").setTabListener(tabListener);
		
//		actionBar.addTab(homeTab);
//		actionBar.addTab(mayeahTab);
//		actionBar.addTab(hospitalTab);
//		actionBar.addTab(myTab);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch (id) {
		case R.id.action_settings:
			
			return true;
		case R.id.action_more:
			
			return true;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
//	class MyTabListener implements TabListener{
//		
//		@Override
//		public void onTabReselected(Tab tab, FragmentTransaction ft) {
//			if(contentVp != null)
//			contentVp.setCurrentItem(tab.getPosition());
//		}
//
//		@Override
//		public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
//		}
//
//		@Override
//		public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
//		}
//		
//	}
}
