package com.mayeah.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

public class ImageUtil {
	/** 
     * ����ԭͼ�ͱ䳤����Բ��ͼƬ 
     *  
     * @param source 
     * @param min 
     * @return 
     */  
    private Bitmap createCircleImage(Bitmap source, int min)  
    {  
        final Paint paint = new Paint();  
        paint.setAntiAlias(true);  
        Bitmap target = Bitmap.createBitmap(min, min, Config.ARGB_8888);  
        /** 
         * ����һ��ͬ����С�Ļ��� 
         */  
        Canvas canvas = new Canvas(target);  
        /** 
         * ���Ȼ���Բ�� 
         */  
        canvas.drawCircle(min / 2, min / 2, min / 2, paint);  
        /** 
         * ʹ��SRC_IN 
         */  
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));  
        /** 
         * ����ͼƬ 
         */  
        canvas.drawBitmap(source, 0, 0, paint);  
        return target;  
    } 
}
