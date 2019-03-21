package com.axun.justandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ContactsAdapter extends
  RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
  List<Contact> mContacts;

  public ContactsAdapter(List<Contact> contacts) {
    mContacts = contacts;
    
  }

  @NonNull
  @Override
  public ContactsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    Context context= viewGroup.getContext();
    LayoutInflater inflater=LayoutInflater.from(context);
    
    View view=inflater.inflate(R.layout.contact_item,viewGroup,false);
    
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
    Contact contact=mContacts.get(i);
    TextView textView=viewHolder.contactName;
    textView.setText(contact.getName());
    ImageView imageView=viewHolder.contactImg;
    imageView.setImageResource(contact.getAvatar());
    
    
    
  }

  @Override
  public int getItemCount() {
    return mContacts.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {
    TextView contactName;
    ImageView contactImg;
    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      contactName= itemView.findViewById(R.id.contact_name);
      contactImg=itemView.findViewById(R.id.contact_img);
    }
  }
}
