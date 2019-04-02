package com.axun.justandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

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
  private int indicatorOld=0;
  boolean isRunning=false;

  @Override
  public void onPause() {
    super.onPause();
    isRunning = false;
  }

  @Override
  public void onResume() {
    super.onResume();
    isRunning = true;
    runPager();
  }

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_home,container,false);
    
    initViews();
    initData();
    initPager();
    
    initGrid();
    
    initFlipper();

    
    
    
    
    
    return view;
  }
  
  public void initGrid(){
    String[] titleArr=new String [] {
      "标题01",
      "标题02",
      "标题03",
      "标题04",
      "标题05",
      "标题06",
      "标题07",
      "标题08",
      "标题09",
      "标题10",
      "标题11",
      "标题12",
    };
    int[] iconArr=new int [] {
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
      R.drawable.dz,
    };
    
    List<GridItem> gridItemList=new ArrayList<>();
    for (int i = 0; i < titleArr.length; i++) {
      gridItemList.add(new GridItem(titleArr[i],iconArr[i]));
    }
    
    
    GridView homeGridView=view.findViewById(R.id.gv_home);
    homeGridView.setAdapter(new HomeGridAdapter(gridItemList));
    
    
  }
  
  
  
  public void initViews(){
    homeViewPager=view.findViewById(R.id.vp_home);
    homeViewPager.addOnPageChangeListener(this);
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
  
  
  @SuppressLint("HandlerLeak")
  private Handler handler = new Handler(){
    @Override
    public void handleMessage(Message msg) {
      super.handleMessage(msg);
      
      switch (msg.what){
        case 111:
          homeViewPager.setCurrentItem(homeViewPager.getCurrentItem()+1);
          break;
      }
      
    }
  };
  
  public void runPager(){
    
    
    new Thread(){
      @Override
      public void run() {
        isRunning=true;
        while (isRunning){
          try{
            Thread.sleep(2000);
          }catch (Exception e){
            e.printStackTrace();
          }
          handler.sendEmptyMessage(111);
        }


      }
    }.start();
  }
  
  public void initFlipper(){
    ViewFlipper vf=view.findViewById(R.id.vf_hot);
    for (int i = 0; i < 20; i+=2) {
      
      View view=View.inflate(getContext(), R.layout.hot_item, null);

      
      
      vf.addView(view);
      
    }
    
    
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
      LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(DensityUtil.dip2px(getContext(),8),DensityUtil.dip2px(getContext(),8));
      layoutParams.leftMargin=DensityUtil.dip2px(getContext(),8);
      layoutParams.rightMargin=DensityUtil.dip2px(getContext(),8);
      indicatorWrap.addView(view,layoutParams);
    }
    
    
    indicatorWrap.getChildAt(0).setEnabled(true);
    HomePagerAdapter homePagerAdapter=new HomePagerAdapter(imageViewList);
    
    homeViewPager.setAdapter(homePagerAdapter);
    int count=homePagerAdapter.getCount();//拿到
    
    int initPosition=count/2;
    homeViewPager.setCurrentItem(initPosition);
    
  }

  @Override
  public void onPageScrolled(int i, float v, int i1) {
    
  }

  @Override
  public void onPageSelected(int i) {
    if(indicatorWrap!=null){
      int newPosition=i%imageViewList.size();

      
      indicatorWrap.getChildAt(indicatorOld).setEnabled(false);
      if(indicatorWrap.getChildAt(newPosition)!=null){
        indicatorWrap.getChildAt(newPosition).setEnabled(true);
      }
      
      indicatorOld=newPosition;
    }
    
  }

  @Override
  public void onPageScrollStateChanged(int i) {

  }
}