package com.axun.justandroid;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

  List<Contact> mList;

  public ContactsAdapter(List<Contact> mList) {
    this.mList=mList;
  }

  @Override
  public ContactsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    final Context context = parent.getContext();
    View view = LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false);
    final ViewHolder viewHolder = new ViewHolder(view);
    viewHolder.contactImg.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int position=viewHolder.getAdapterPosition();
        Toast.makeText(v.getContext(),""+position,Toast.LENGTH_SHORT).show();
      }
    });
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(ViewHolder viewHolder,int position) {
    Contact contact=mList.get(position);
    viewHolder.contactImg.setImageResource(contact.getAvatar());
    viewHolder.contactName.setText(contact.getName());      
  }

  @Override
  public int getItemCount() {
    return mList.size();
  }
  class ViewHolder extends RecyclerView.ViewHolder {
    View contactView;
    TextView contactName;
    ImageView contactImg;
    ViewHolder(View itemView) {
      super(itemView);
      contactName = itemView.findViewById(R.id.contact_name);
      contactImg = itemView.findViewById(R.id.contact_img);
    }
    
  }
}
