package com.mayeah.activity.mine;

import android.R.color;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mayeah.R;
/**
 * 
 * @since 2015-01-05
 *
 */
public class MyInfoActivity extends Activity implements OnClickListener {
	private RelativeLayout postRl;
	private RelativeLayout messageRl;
	private ImageView headIV;
	private LinearLayout myInfoLl;
	private LinearLayout myOrderLl;
	private LinearLayout myScoreLl;
	private LinearLayout myCollectLl;
	private LinearLayout myFeedbackLl;
	private ImageButton settingsIb;
	private Button callBtn;
	private TextView nameTv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_personal);
		seupView();
	}

	private void seupView() {
		
		headIV = (ImageView) findViewById(R.id.head_iv);
		nameTv = (TextView) findViewById(R.id.name_tv);
		Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.girl);
		bm = createCircleImage(bm, bm.getHeight()<bm.getWidth()?bm.getHeight():bm.getWidth());
		headIV.setImageBitmap(bm);
		myOrderLl = (LinearLayout) findViewById(R.id.my_order_ll);
		myOrderLl.setOnClickListener(this);
		myInfoLl = (LinearLayout) findViewById(R.id.my_info_ll);
		myInfoLl.setOnClickListener(this);
		myCollectLl = (LinearLayout) findViewById(R.id.my_collect_ll);
		myCollectLl.setOnClickListener(this);
		myFeedbackLl = (LinearLayout) findViewById(R.id.my_feedback_ll);
		myFeedbackLl.setOnClickListener(this);
		myScoreLl = (LinearLayout) findViewById(R.id.my_score_ll);
		myScoreLl.setOnClickListener(this);
		postRl = (RelativeLayout) findViewById(R.id.post_rl);
		postRl.setOnClickListener(this);
		messageRl = (RelativeLayout) findViewById(R.id.message_rl);
		messageRl.setOnClickListener(this);
		settingsIb = (ImageButton) findViewById(R.id.settings_ib);
		settingsIb.setOnClickListener(this);
		callBtn = (Button) findViewById(R.id.call_btn);
		callBtn.setOnClickListener(this);
	}
	
	/** 
     * 根据原图和变长绘制圆形图片 
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
         * 产生一个同样大小的画布 
         */  
        Canvas canvas = new Canvas(target);  
        /** 
         * 首先绘制圆形 
         */  
        canvas.drawCircle(min / 2, min / 2, min / 2, paint);  
        /** 
         * 使用SRC_IN 
         */  
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));  
        /** 
         * 绘制图片 
         */  
        canvas.drawBitmap(source, 0, 0, paint);  
        source.recycle();
        source = null;
        return target;  
    }
    
    private void createCallDialog(){
    	AlertDialog.Builder builder = new Builder(this);
    	builder.setView(View.inflate(this, R.layout.view_dialog_call, null));
    	builder.create().show();
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.my_info_ll:
			
			break;
		case R.id.my_collect_ll:
			
			break;
		case R.id.my_feedback_ll:
			
			break;
		case R.id.my_order_ll:
			
			break;
		case R.id.my_score_ll:
			
			break;
		case R.id.message_rl:
			
			break;
		case R.id.post_rl:
			
			break;
		case R.id.call_btn:
			createCallDialog();
			break;
		case R.id.settings_ib:
			
			break;
		default:
			break;
		}
	} 

}
