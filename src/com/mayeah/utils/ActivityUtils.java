package com.mayeah.utils;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.Window;
import android.view.WindowManager;

/**
 * Activity工具类
 * @author weshine.chen
 *
 */
public class ActivityUtils {
	
	/**
	 * 没有标题栏，全屏显示
	 * @param act
	 */
	public static void noTitleFullScreen(@NonNull Activity act) {
		act.requestWindowFeature(Window.FEATURE_NO_TITLE);
		act.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
}
