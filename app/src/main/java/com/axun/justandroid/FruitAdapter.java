package com.axun.justandroid;


import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FruitAdapter extends BaseAdapter {
  List<Fruit> mList;
  Context context;

  public FruitAdapter(List<Fruit> mList, Context context) {
    this.mList = mList;
    this.context = context;
  }
  
  @Override
  public int getCount(){
    return mList.size();
  }
  
  @Override
  public Object getItem(int position){
    return mList.get(position);
  }
  
  @Override
  public long getItemId(int position){
    return position;
  }
  
  @Override
  public View getView(int position,View convertView,ViewGroup parent){
    
    Fruit fruit=mList.get(position);
    View view;
    ViewHolder viewHolder;
    if(convertView==null){
      view=LayoutInflater.from(context).inflate(R.layout.fruit_item,parent,false);
      viewHolder=new ViewHolder(view);
      
      view.setTag(viewHolder);
    }else{
      view=convertView;
      viewHolder=(ViewHolder) view.getTag();
    }
    
    viewHolder.fruitName.setText(fruit.getName());
    viewHolder.fruitImg.setImageResource(fruit.getImageId());
    
    return view;
  }
  
  class ViewHolder{
    ImageView fruitImg;
    TextView fruitName;
    View itemView;
    public ViewHolder(View itemView){
        this.itemView=itemView;
        fruitName=itemView.findViewById(R.id.fruit_name);
        fruitImg=itemView.findViewById(R.id.fruit_img);
    }
  }
}