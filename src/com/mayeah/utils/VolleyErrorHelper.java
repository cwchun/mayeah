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
 * Volley��������
 * @author weshine.chen
 *
 */
public class VolleyErrorHelper {
	
	public static String getMessage(Object error, Context context){
		if(error instanceof TimeoutError){
			//Socket��ʱ��������̫æ�������ӳ�
			return "";//context.getResources().getString(R.string.app_name);
		}else if(isServerProblem(error)){
			return handleServerError(error, context);
		}else if(isNetworkProblem(error)){
			return "";
		}else if(error instanceof ParseError){
			return "JSON�����������������Ƿ�淶��";
		}else{
			return "δ֪����";
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
		//Socket�رգ�������崻���DNS����
		//�ͻ���û����������
		return (error instanceof NetworkError) || (error instanceof NoConnectionError);
	}

	private static boolean isServerProblem(Object error) {
		//����������Ӧ��һ���������п��ܵ�4xx��5xx HTTP״̬����
		//HTTP�������֤����
		return (error instanceof ServerError) || (error instanceof AuthFailureError);
	}
}
