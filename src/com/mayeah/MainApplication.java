package com.mayeah;

import com.mayeah.http.RequestManager;
import com.mayeah.images.ImageCacheManager;
import com.mayeah.images.ImageCacheManager.CacheType;

import android.app.Application;
import android.graphics.Bitmap.CompressFormat;
/**
 * 全局Application,应用的初始化在这里处理
 * @author weshine.chen
 *
 */
public class MainApplication extends Application {
//	private static final String TAG = "VolleyPatterns";
//	private static MainApplication instance;
	private static int DISK_IMAGECACHE_SIZE = 1024*1024*10;
	private static CompressFormat DISK_IMAGECACHE_COMPRESS_FORMAT = CompressFormat.PNG;
	private static int DISK_IMAGECACHE_QUALITY = 100;  //PNG is lossless so quality is ignored but must be provided
	
	@Override
	public void onCreate() {
		super.onCreate();
//		instance = this;
		init();
	}
	
	/**
	 * Intialize the request manager and the image cache 
	 */
	private void init() {
		RequestManager.init(this);
		createImageCache();
	}
	
	/**
	 * Create the image cache. Uses Memory Cache by default. Change to Disk for a Disk based LRU implementation.  
	 */
	private void createImageCache(){
		ImageCacheManager.getInstance().init(this,
				this.getPackageCodePath()
				, DISK_IMAGECACHE_SIZE
				, DISK_IMAGECACHE_COMPRESS_FORMAT
				, DISK_IMAGECACHE_QUALITY
				, CacheType.MEMORY);
	}

//	/**
//	 * 获取全局的自定义Application
//	 * @return
//	 */
//	public static synchronized MainApplication getInstance(){
//		return instance;
//	}
	
//	/**
//	 * 获取全局的请求队列
//	 * @return
//	 */
//	public RequestQueue getRequestQueue(){
//		// lazy initialize the request queue, the queue instance will be
//        // created when it is accessed for the first time
//		if(mRequestQueue == null){
//			mRequestQueue = Volley.newRequestQueue(getApplicationContext());
//		}
//		return mRequestQueue;
//	}
	
	
}
