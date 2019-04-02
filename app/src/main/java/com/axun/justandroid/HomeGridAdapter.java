package com.axun.justandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HomeGridAdapter extends BaseAdapter {
  List<GridItem> mResList;
  public HomeGridAdapter(List<GridItem> resList) {
    this.mResList=resList;
  }

  @Override
  public int getCount() {
    return mResList.size();
  }

  @Override
  public Object getItem(int position) {
    return mResList.get(position);
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_item_default,parent,false);
    TextView textView=view.findViewById(R.id.tv_title);
    ImageView imageView=view.findViewById(R.id.iv_icon);
    textView.setText(mResList.get(position).getTitle());
    imageView.setImageResource(mResList.get(position).getIcon());
    
    return view;
  }
}
