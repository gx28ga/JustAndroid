package com.axun.justandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
  Button button;
  RecyclerView recyclerView;
  private static final String TAG = "SecondActivity";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d(TAG, "task id  is "+getTaskId());
    setContentView(R.layout.activity_second);
    recyclerView=findViewById(R.id.gundam_list);
    String[] names={
      "GUNDAM01",
      "GUNDAM02",
      "GUNDAM03",
      "GUNDAM04",
      "GUNDAM05",
      "GUNDAM06",
      "GUNDAM07",
      "GUNDAM08",
      "GUNDAM09",
      "GUNDAM10",
      "GUNDAM11",
      "GUNDAM12",
      "GUNDAM13",
      "GUNDAM14",
      "GUNDAM15",
      "GUNDAM16",
      "GUNDAM17",
      "GUNDAM18",
      "GUNDAM19",
      "GUNDAM20",
      "GUNDAM21",
      "GUNDAM22",
      "GUNDAM23",
      "GUNDAM24",
      "GUNDAM25",
      "GUNDAM26",
      "GUNDAM27",
      "GUNDAM28",
      "GUNDAM29",
      "GUNDAM30",
      "GUNDAM31",
      "GUNDAM32",
      "GUNDAM33",
      "GUNDAM34",
      "GUNDAM35",
      "GUNDAM36",
      "GUNDAM37",
      "GUNDAM38",
      "GUNDAM39",
      "GUNDAM40",
    } ;
    ArrayList<Contact> contacts=Contact.initContactList(names);
    ContactsAdapter contactsAdapter=new ContactsAdapter(contacts);
    recyclerView.setAdapter(contactsAdapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    
  }





 
}
