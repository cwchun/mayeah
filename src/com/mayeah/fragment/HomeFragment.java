package com.mayeah.fragment;

import java.util.ArrayList;
import java.util.List;

import com.mayeah.R;
import com.mayeah.adapter.BanaPagerAdapter;
import com.mayeah.adapter.ItemsGvAdapter;
import com.mayeah.model.Item;
import com.mayeah.widget.AutoScrollViewPager;
import com.mayeah.widget.viewpagerindicator.CirclePageIndicator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
/**
 * 首页Fragment
 * @author weshine.chen
 *
 */
public class HomeFragment extends Fragment {
	private AutoScrollViewPager banaVp;
	private BanaPagerAdapter banaAdapter;
	private List<String> imagesUrl;
	private GridView itemsGv;
	private List<Item> items;
	private CirclePageIndicator indicator;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_home, container, false);
		initTestData();
		initViews(view);
		return view;
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
		banaVp.startAutoScroll();
		//设置ViewPager获取焦点，解决ScrollView不能置顶的问题
		banaVp.setFocusable(true);
		banaVp.setFocusableInTouchMode(true);
		banaVp.requestFocus();
	}
	
	//初始化测试数据
		private void initTestData() {
			imagesUrl = new ArrayList<String>();
			imagesUrl.add("http://c.hiphotos.baidu.com/image/w%3D310/sign=40946820e9c4b7453494b117fffd1e78/0bd162d9f2d3572c5b1e72d58813632762d0c33f.jpg");
			imagesUrl.add("http://e.hiphotos.baidu.com/image/w%3D310/sign=f5c7fa06ba0e7bec23da05e01f2fb9fa/b2de9c82d158ccbfa0475b331bd8bc3eb03541c4.jpg");
			imagesUrl.add("http://d.hiphotos.baidu.com/image/w%3D310/sign=9d34895fd2160924dc25a41ae406359b/f703738da977391298d26b68fa198618377ae2c7.jpg");
			imagesUrl.add("http://d.hiphotos.baidu.com/image/w%3D310/sign=f1d1d5cd19d5ad6eaaf962ebb1ca39a3/b64543a98226cffc3ddd51bbbb014a90f703eac0.jpg");
			imagesUrl.add("http://h.hiphotos.baidu.com/image/w%3D310/sign=b2c2eaead739b6004dce09b6d9503526/2e2eb9389b504fc2726e590ce7dde71190ef6d82.jpg");
			
			items = new ArrayList<Item>();
			Item item = new Item();
			item.icon = R.drawable.item_1;
			item.name = "双眼皮";
			items.add(item);
			
			item = new Item();
			item.icon = R.drawable.item_2;
			item.name = "隆鼻";
			items.add(item);
			
			item = new Item();
			item.icon = R.drawable.item_3;
			item.name = "瘦脸针";
			items.add(item);
			
			item = new Item();
			item.icon = R.drawable.item_4;
			item.name = "玻尿酸";
			items.add(item);
			
			item = new Item();
			item.icon = R.drawable.item_5;
			item.name = "美肤";
			items.add(item);
			
			item = new Item();
			item.icon = R.drawable.item_6;
			item.name = "更多";
			items.add(item);
			
		}
		
		private void initViews(@Nullable View view) {
			banaVp = (AutoScrollViewPager) view.findViewById(R.id.vp_home_bana);
			banaAdapter = new BanaPagerAdapter(imagesUrl, getActivity());
			banaVp.setAdapter(banaAdapter);
			banaVp.setInterval(3000);
			indicator = (CirclePageIndicator) view.findViewById(R.id.cpi_points);
			indicator.setViewPager(banaVp);
			
			itemsGv = (GridView) view.findViewById(R.id.gv_items);
			itemsGv.setAdapter(new ItemsGvAdapter(getActivity(), items));
		}
}
