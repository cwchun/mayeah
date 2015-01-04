package com.mayeah.utils;

import android.text.TextUtils;
import android.util.Log;

/**
 * 调试用日志输出
 * @author weshine.chen
 *
 */
public class DebugLog {
	private static final String TAG = "DEBUG_LOG";
	private static final boolean isDebug = true;//TODO 发布的时候要关掉
	
	public static void v(String msg){
		if(isDebug){
			Log.v(TAG, msg);
		}
	}
	
	public static void v(String tag, String msg){
		if(isDebug){
			Log.v(TextUtils.isEmpty(tag)? TAG : tag, msg);
		}
	}
	
	public static void d(String msg){
		if(isDebug){
			Log.d(TAG, msg);
		}
	}
	
	public static void d(String tag, String msg){
		if(isDebug){
			Log.d(TextUtils.isEmpty(tag)? TAG : tag, msg);
		}
	}
	
	public static void i(String msg){
		if(isDebug){
			Log.i(TAG, msg);
		}
	}
	
	public static void i(String tag, String msg){
		if(isDebug){
			Log.i(TextUtils.isEmpty(tag)? TAG : tag, msg);
		}
	}
	
	public static void w(String msg){
		if(isDebug){
			Log.w(TAG, msg);
		}
	}
	
	public static void w(String tag, String msg){
		if(isDebug){
			Log.w(TextUtils.isEmpty(tag)? TAG : tag, msg);
		}
	}
	
	public static void e(String msg){
		if(isDebug){
			Log.e(TAG, msg);
		}
	}
	
	public static void e(String tag, String msg){
		if(isDebug){
			Log.e(TextUtils.isEmpty(tag)? TAG : tag, msg);
		}
	}
}
