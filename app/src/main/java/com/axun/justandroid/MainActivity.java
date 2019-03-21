package com.axun.justandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
  private static final String TAG = "MainActivity";
  Button buttonA,buttonB;
  Intent intentA,intentB;
  ImageView imageView;
  ProgressBar progressBar;
  Button btnImgSet;
  AlertDialog.Builder dialog;
  ActionBar actionBar;
  private String [] data={
    "banana0",
    "banana1",
    "banana2",
    "banana3",
    "banana4",
    "banana5",
    "banana6",
    "banana7",
    "banana8",
    "banana9",
    "banana10",
    "banana11",
    "banana12",
    "banana13",
    "banana14",
    "banana15",
    "banana16",
    "banana17",
    "banana18",
    "banana19",
    "banana20",
    "banana21",
    "banana22",
    "banana23",
    "banana24",
    "banana25",
    "banana26",
    "banana27",
    "banana28",
    "banana29",
    "banana30",
    "banana31",
    "banana32",
    "banana33",
    "banana34",
    "banana35",
    "banana36",
    "banana37",
    "banana38",
    "banana39",
    "banana40",};
   private ListView listView;
   private ArrayAdapter<String> arrayAdapter;
   List<Fruit> list;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
    Log.d(TAG, "task id is "+getTaskId());
    
    setContentView(R.layout.activity_main);
    
    
    if(savedInstanceState!=null){
      String tempData=savedInstanceState.getString("keykey");
      Log.d(TAG, tempData);
      Toast.makeText(this,tempData,Toast.LENGTH_LONG).show();
    }
    listView=findViewById(R.id.lv_banana);
    
    
    FruitAdapter adapter=new FruitAdapter(Fruit.initFruitList(data),this);
    listView.setAdapter(adapter);


    
    listView.setOnItemClickListener(this);
    actionBar=getSupportActionBar();
    if(actionBar!=null){
      actionBar.hide();
    }
//    progressBar=findViewById(R.id.progress_bar);
    imageView=findViewById(R.id.iv_img);
    btnImgSet=findViewById(R.id.btn_img_set);
    btnImgSet.setOnClickListener(this);
    
//    buttonA=findViewById(R.id.start_normal_activity);
//    buttonB=findViewById(R.id.start_dialog_activity);
//    buttonA.setOnClickListener(this);
//    buttonB.setOnClickListener(this);
    
  }

//  @Override
//  protected void onRestart() {
//    super.onRestart();
//    Log.d(TAG, "onRestart");
//  }
//
//  @Override
//  protected void onDestroy() {
//    super.onDestroy();
//    Log.d(TAG, "onDestroy");
//  }
//
//  @Override
//  protected void onStop() {
//    super.onStop();
//    Log.d(TAG, "onStop");
//  }
//
//  @Override
//  protected void onPause() {
//    super.onPause();
//    Log.d(TAG, "onPause");
//  }
//
//  @Override
//  protected void onResume() {
//    super.onResume();
//    Log.d(TAG, "onResume");
//  }
//
//  @Override
//  protected void onStart() {
//    super.onStart();
//    Log.d(TAG, "onStart");
//  }


  @Override
  public void onClick(View v) {
    int viewId=v.getId();
    switch (viewId){
      case R.id.btn_img_set:
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
//        dialog=new AlertDialog.Builder(this);
//        dialog.setTitle("This is a new Dialog");
//        dialog.setMessage("something important");
//        dialog.setCancelable(false);
//        dialog.setNegativeButton("OK", new DialogInterface.OnClickListener() {
//          @Override
//          public void onClick(DialogInterface dialog, int which) {
//            
//          }
//        });
//        dialog.show();
        
//        int progress=progressBar.getProgress();
//        progress++;
//        progressBar.setProgress(progress);
//        int visibility=progressBar.getVisibility();
//        if(visibility==View.GONE){
//          progressBar.setVisibility(View.VISIBLE);
//        }else if(visibility==View.VISIBLE){
//          progressBar.setVisibility(View.GONE);
//        }
//        imageView.setImageResource(R.drawable.begger);
//        break;
//      case R.id.start_normal_activity:
//        intentA=new Intent(this,SecondActivity.class);
//        startActivity(intentA);
//        break;
//      case R.id.start_dialog_activity:
//        intentB=new Intent(this,DialogActivity.class);
//        startActivity(intentB);
//        break;
    }
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    String tempData="look at her butt";
    outState.putString("keykey",tempData);
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    Fruit fruit=list.get(position);
    Toast.makeText(this,fruit.getName(),Toast.LENGTH_SHORT).show();
  }
}
