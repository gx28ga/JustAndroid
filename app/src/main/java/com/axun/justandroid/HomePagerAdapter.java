package com.axun.justandroid;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class HomePagerAdapter extends PagerAdapter {
  private List<ImageView> mViewList;
  
  
  
  public HomePagerAdapter(List<ImageView> viewList){
    this.mViewList=viewList;
    
  }

  @Override
  public int getCount() {
    return mViewList.size()*100000000;
  }

  @Override
  public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
    return view==(View) o;
  }

  @NonNull
  @Override
  public Object instantiateItem(@NonNull ViewGroup container, int position) {
    int newPosition=position % mViewList.size();

    ImageView imageview=mViewList.get(newPosition);
    container.addView(imageview);
    return imageview;
  }

  @Override
  public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
    container.removeView((View)object);
  }


}