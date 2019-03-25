package com.axun.justandroid;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.ViewHolder>{
  Context context;
  List<News> mList;
  ViewHolder holder;
  Boolean isTwoPane;
  News news;
  FragmentManager fragmentManager;
  public NewsListAdapter (List<News> mList, Boolean isTwoPane, FragmentManager fragmentManager,Context context){
    this.mList=mList; 
    this.isTwoPane=isTwoPane;
    this.fragmentManager=fragmentManager;
    this.context=context;
  }
  
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    final Context context=parent.getContext();
    View view= LayoutInflater.from(context).inflate(R.layout.news_list_item,parent,false);
    
    
    
    holder=new ViewHolder(view);
    
    return holder;
    
    
  }
  
  public void onBindViewHolder(ViewHolder viewHolder, int position){
    final News news=mList.get(position);
    
    
    viewHolder.newsItemView.setText(news.getTitle());
    viewHolder.viewItem.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (isTwoPane){
          NewsDetailFragment newsDetailFragment=(NewsDetailFragment) fragmentManager.findFragmentById(R.id.frag_news_detail);
          newsDetailFragment.refresh(news.getTitle(),news.getContent());
        }else{
          NewsDetailActivity.actionStart(context,news.getTitle(),news.getContent());


        }

      }
    });
    
    
    
    
  }
  
  public int getItemCount(){
    return mList.size();
  }
  
  
  
  
  public class ViewHolder extends RecyclerView.ViewHolder{
    View viewItem;
    TextView newsItemView;
    public ViewHolder(View viewItem){
      super(viewItem);
      this.viewItem=viewItem;
      newsItemView=itemView.findViewById(R.id.news_title);
    }
    
  }
  
  
}