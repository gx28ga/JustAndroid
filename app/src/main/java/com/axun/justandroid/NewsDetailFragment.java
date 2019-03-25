package com.axun.justandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewsDetailFragment extends Fragment {
  View view;
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    
    view=inflater.inflate(R.layout.fragment_news_detail,container,false);
    return view;
    
    
  }
  
  public void refresh(String newsTitle, String newsContent){
    View visibilityLayout=view.findViewById(R.id.visibility_layout);
    visibilityLayout.setVisibility(View.VISIBLE);
    TextView newsTitleView=view.findViewById(R.id.news_title);
    TextView newsContentView=view.findViewById(R.id.news_detail);
    newsTitleView.setText(newsTitle);
    newsContentView.setText(newsContent);
  }
}
