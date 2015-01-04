package com.mayeah.adapter;

import java.util.List;

import com.mayeah.R;
import com.mayeah.model.Item;
import com.mayeah.utils.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * 首页服务项适配器
 * @author weshine.chen
 *
 */
public class ItemsGvAdapter extends BaseAdapter{
	private Context context;
	private List<Item> datas;
	
	public ItemsGvAdapter(Context context, List<Item> datas){
		this.context = context;
		this.datas = datas;
	}
	
	@Override
	public int getCount() {
		return datas == null ? 0 : datas.size();
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
			contentView = LayoutInflater.from(context).inflate(R.layout.adapter_items_gridview, null);
		}
		ImageView iv = ViewHolder.get(contentView, R.id.civ_item);
		iv.setBackgroundResource(datas.get(position).icon);
		TextView tv = ViewHolder.get(contentView, R.id.tv_item);
		tv.setText(datas.get(position).name);
		return contentView;
	}

}
