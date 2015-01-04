package com.mayeah.adapter;

import java.util.List;

import com.android.volley.toolbox.NetworkImageView;
import com.mayeah.R;
import com.mayeah.images.ImageCacheManager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * BanaÊÊÅäÆ÷
 * @author weshine.chen
 *
 */
public class BanaPagerAdapter extends PagerAdapter {
	private List<String> datas;
	private Context context;
	//TODO Ä£ÄâÊı¾İ
	private int[] banas;
	
	public BanaPagerAdapter(List<String> datas, Context context){
		this.datas = datas;
		this.context = context;
		banas = new int[]{R.drawable.banner1, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4};
	}
	
	@Override
	public int getCount() {
//		return datas == null ? 0 : datas.size();
		return banas.length;
//		return Integer.MAX_VALUE;
	}
	
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		View view = LayoutInflater.from(context).inflate(R.layout.adapter_bana_viewpager, container, false);
		NetworkImageView niv = (NetworkImageView) view.findViewById(R.id.niv_bana);
		niv.setDefaultImageResId(R.drawable.icon);//ÉèÖÃÄ¬ÈÏÍ¼Æ¬
		niv.setErrorImageResId(R.drawable.icon);//ÉèÖÃ¼ÓÔØÊ§°ÜÊ±µÄÍ¼Æ¬
//		niv.setImageUrl(datas.get(position), ImageCacheManager.getInstance().getImageLoader());//TODOÍøÂçÏÂÔØÍ¼Æ¬
//		niv.setImageResource(banas[position]);
		niv.setBackgroundResource(banas[position]);
		container.addView(view);
		return view;
	}
	
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		((ViewPager) container).removeView((View) object);
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}

}
