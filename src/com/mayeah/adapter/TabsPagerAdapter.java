package com.mayeah.adapter;

import java.util.ArrayList;

import com.mayeah.model.Item;
import com.mayeah.widget.viewpagerindicator.IconPagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * ×Ô¶¨ÒåPagerAdapter
 * @author weshine.chen
 *
 */
public class TabsPagerAdapter extends FragmentPagerAdapter implements IconPagerAdapter{
	private ArrayList<Fragment> mFragments = new ArrayList<Fragment>();
	private ArrayList<Item> tabItems = new ArrayList<Item>();
	
	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}
	
	public ArrayList<Fragment> getFragments(){
		return this.mFragments;
	}
	
	public ArrayList<Item> getTabItems(){
		return this.tabItems;
	}
	
	@Override
	public Fragment getItem(int position) {
		return this.mFragments.get(position);
	}

	@Override
	public int getCount() {
		return this.mFragments.size();
	}

	@Override
	public int getIconResId(int index) {
		return tabItems.get(index).icon;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		return tabItems.get(position).name;
	}
	
	
}
