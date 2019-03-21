package com.axun.justandroid;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TitleLayout extends LinearLayout implements View.OnClickListener {
  Context context;
  Button btnBack,btnEdit;
  public TitleLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
    this.context=context;
    LayoutInflater.from(context).inflate(R.layout.title,this);
    btnBack=this.findViewById(R.id.title_back);
    btnBack.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    int viewId=v.getId();
    switch (viewId) {
      case R.id.title_back:
        ((Activity) context).finish();
    }
  }
}
