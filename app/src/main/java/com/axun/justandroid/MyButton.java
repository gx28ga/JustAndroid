package com.axun.justandroid;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class MyButton extends android.support.v7.widget.AppCompatButton {
  private static final String TAG = "MyButton";
  public MyButton(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  

  @Override
  public boolean onTouchEvent(MotionEvent event) {
    
    Log.i(TAG,"onTouchEvent方法被调用");
    return false;
  }
  
  
}
