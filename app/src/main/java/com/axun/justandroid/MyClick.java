package com.axun.justandroid;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MyClick implements View.OnTouchListener, View.OnClickListener {
  private TextView textView;
  
  public MyClick(TextView textView){
    this.textView=textView;
  }
  

  @Override
  public boolean onTouch(View v, MotionEvent event) {
    
    return true;
  }

  @Override
  public void onClick(View v) {
    textView.setText("点击了按钮!");
  }
}
