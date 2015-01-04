package com.mayeah.http;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import android.content.Context;
import android.text.TextUtils;

/**
 * Manager for the queue
 * 
 * @author weshine.chen
 *
 */
public class RequestManager {
	private final String TAG = this.getClass().getSimpleName();
	/**
	 * the queue
	 */
	private static RequestQueue mRequestQueue;

	
	private RequestManager() {} 

	/**
	 * @param context
	 * 			application context
	 */
	public static void init(Context context) {
		mRequestQueue = Volley.newRequestQueue(context);
	}

	/**
	 * @return
	 * 		instance of the queue
	 * @throws
	 * 		IllegalStatException if init has not yet been called
	 */
	public static RequestQueue getRequestQueue() {
	    if (mRequestQueue != null) {
	        return mRequestQueue;
	    } else {
	        throw new IllegalStateException("Not initialized");
	    }
	}
	
	/**
	 * ��������������
	 * @param req
	 */
	public void addToRequestQueue(Request req){
		getRequestQueue().add(req);
	}
	
	/**
	 * ��Ӵ��Զ���tag�������������
	 * @param req
	 * @param tag
	 */
	public void addToRequestQueue(Request req, String tag){
		// set the default tag if tag is empty
		req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
		getRequestQueue().add(req);
	}
	
	/**
	 * ȡ��ָ��tag������
	 * @param tag
	 */
	public void cancelPendingRequests(Object tag){
		if(mRequestQueue != null){
			mRequestQueue.cancelAll(tag);
		}
	}
}
