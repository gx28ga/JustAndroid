package com.axun.justandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyPagerAdapter extends PagerAdapter{
  Context mContext;
  int[] mResouces;
  LayoutInflater mLayoutInflater;
  
  public MyPagerAdapter(Context context, int[] mResouces){
    this.mResouces=mResouces;
    this.mContext=context;
    mLayoutInflater=(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
  }
  
  
  @Override
  public int getCount() {
    return mResouces.length;
  }

  @Override
  public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
    return view == ((ImageView) o);
  }

  @NonNull
  @Override
  public Object instantiateItem(@NonNull ViewGroup container, int position) {
    ImageView imageView=new ImageView(mContext);
    imageView.setImageResource(mResouces[position]);
    container.addView(imageView);
    return imageView;
  }

  @Override
  public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
    container.removeView((ImageView) object);
  }
}