package com.axun.justandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements ViewPager.OnPageChangeListener {
  private static final String TAG = "HomeFragment";
  ViewPager homeViewPager;
  View view;
  int [] imgResIds;
  List<ImageView> imageViewList=new ArrayList<>();
  List<View> indicatorList=new ArrayList<>();
  LinearLayout indicatorWrap;
  
  
  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_home,container,false);
    
    initViews();
    initData();
    initPager();
    
    return view;
  }
  
  public void initViews(){
    homeViewPager=view.findViewById(R.id.vp_home);
    indicatorWrap =view.findViewById(R.id.ll_indicators_wrap);
  }
  
  public void initData(){
    imgResIds=new int[]{
      R.drawable.home_slider_01,
      R.drawable.home_slider_02,
      R.drawable.home_slider_03,
      R.drawable.home_slider_04,
      R.drawable.home_slider_05,
      R.drawable.home_slider_06,};
    
  }
  
  public void initPager(){
    ImageView imageView;
    
    for (int i = 0; i < imgResIds.length; i++) {
      imageView=new ImageView(getContext());
      imageView.setImageResource(imgResIds[i]);
      imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      imageViewList.add(imageView);

      
      View view=new View(getContext());
      view.setBackgroundResource(R.drawable.selector_indicator);
      view.setEnabled(false);
      LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams("",8);
      layoutParams.leftMargin=8;
      layoutParams.rightMargin=8;
      indicatorWrap.addView(view,layoutParams);
    }
    
    
    
    HomePagerAdapter homePagerAdapter=new HomePagerAdapter(imageViewList);
    
    homeViewPager.setAdapter(homePagerAdapter);
    int count=homePagerAdapter.getCount();//拿到
    Log.d(TAG, "initPager: "+count);
    int initPosition=count/2;
    homeViewPager.setCurrentItem(initPosition);
    
  }

  @Override
  public void onPageScrolled(int i, float v, int i1) {
    
  }

  @Override
  public void onPageSelected(int i) {
    int newPosition=i % imageViewList.size();

  }

  @Override
  public void onPageScrollStateChanged(int i) {

  }
}