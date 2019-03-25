package com.axun.justandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class NewsListFragment extends Fragment{
  View view;
  FragmentManager fragmentManager;
  private boolean isTwoPane;
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    
    
    fragmentManager=getFragmentManager();
    view=inflater.inflate(R.layout.fragment_news_list,container,false);

    
    
    return view;
    
  }
  
  public void onActivityCreated(Bundle savedInstanceState){
    super.onActivityCreated(savedInstanceState);
    LinearLayout linearLayout =getActivity().findViewById(R.id.layout_news_detail);
    if(linearLayout==null){
      isTwoPane=false;
    }else{
      isTwoPane=true;
    }
    MainActivity activity=(MainActivity) getActivity();
    RecyclerView newsListRecyclerView = (RecyclerView) view.findViewById(R.id.rv_news_list);
    NewsListAdapter adapter=new NewsListAdapter(News.initNews(),isTwoPane,fragmentManager,activity);
    newsListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
    newsListRecyclerView.setAdapter(adapter);
    
    
  }
}