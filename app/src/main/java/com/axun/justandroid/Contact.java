package com.axun.justandroid;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class Contact {
  private String name;
  private int avatar;

  public Contact(String name, int avatar) {
    this.name = name;
    this.avatar = avatar;
  }

  public String getName() {
    return name;
  }

  public int getAvatar() {
    return avatar;
  }
  
  public static ArrayList<Contact> initContactList(String[] names){
    ArrayList<Contact> list=new ArrayList<>();
    for (int i = 0; i < names.length; i++) {
      list.add(new Contact(names[i],R.drawable.gundam));
    }
    
    return list;
    
  }
}
