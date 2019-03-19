package com.axun.justandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private static final String TAG = "MainActivity";
  Button buttonA,buttonB;
  Intent intentA,intentB;
  ImageView imageView;
  ProgressBar progressBar;
  Button btnImgSet;
  AlertDialog.Builder dialog;
  
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
    progressBar=findViewById(R.id.progress_bar);
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
        dialog=new AlertDialog.Builder(this);
        dialog.setTitle("This is a new Dialog");
        dialog.setMessage("something important");
        dialog.setCancelable(false);
        dialog.setNegativeButton("OK", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
            
          }
        });
        dialog.show();
        
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
}
