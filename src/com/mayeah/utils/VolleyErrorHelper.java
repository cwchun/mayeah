package com.mayeah.utils;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.mayeah.R;

import android.content.Context;

/**
 * Volley错误处理类
 * @author weshine.chen
 *
 */
public class VolleyErrorHelper {
	
	public static String getMessage(Object error, Context context){
		if(error instanceof TimeoutError){
			//Socket超时，服务器太忙或网络延迟
			return "";//context.getResources().getString(R.string.app_name);
		}else if(isServerProblem(error)){
			return handleServerError(error, context);
		}else if(isNetworkProblem(error)){
			return "";
		}else if(error instanceof ParseError){
			return "JSON解析出错，请检查数据是否规范！";
		}else{
			return "未知错误！";
		}
	}

	private static String handleServerError(Object err, Context context) {
		VolleyError error = (VolleyError) err;
		NetworkResponse response = error.networkResponse;
		if(response != null){
			switch (response.statusCode) {
			case 404:
			case 422:
			case 401:
				/*
				 * 
				try {
                    // server might return error like this { "error": "Some error occured" }
                    // Use "Gson" to parse the result
                    HashMap result = new Gson().fromJson(new String(response.data),
                            new TypeToken>() {
                            }.getType());

                    if (result != null && result.containsKey("error")) {
                        return result.get("error");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                // invalid request
				 */
				return error.getMessage();

			default:
				break;
			}
		}
		return "";
	}

	private static boolean isNetworkProblem(Object error) {
		//Socket关闭，服务器宕机，DNS错误
		//客户端没有网络连接
		return (error instanceof NetworkError) || (error instanceof NoConnectionError);
	}

	private static boolean isServerProblem(Object error) {
		//服务器的响应的一个错误，最有可能的4xx或5xx HTTP状态代码
		//HTTP的身份验证错误
		return (error instanceof ServerError) || (error instanceof AuthFailureError);
	}
}
