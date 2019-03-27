package com.axun.justandroid;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class MyButton extends android.support.v7.widget.AppCompatButton {
  private static final String TAG = "MyButton";
  public MyButton(Context context, AttributeSet attrs) {
    super(context, attrs);
  }



  //重写键盘按下触发的事件  
  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    super.onKeyDown(keyCode,event);
    Log.i(TAG, "onKeyDown方法被调用");
    return true;
  }

  //重写弹起键盘触发的事件  
  @Override
  public boolean onKeyUp(int keyCode, KeyEvent event) {
    super.onKeyUp(keyCode,event);
    Log.i(TAG,"onKeyUp方法被调用");
    return true;
  }

  //组件被触摸了  
  @Override
  public boolean onTouchEvent(MotionEvent event) {
    super.onTouchEvent(event);
    Log.i(TAG,"onTouchEvent方法被调用");
    return true;
  }


}
