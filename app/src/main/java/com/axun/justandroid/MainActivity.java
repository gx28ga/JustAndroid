package com.axun.justandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
  private static final String TAG = "MainActivity";
  
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
//    listView=findViewById(R.id.lv_banana);
//    
//    list=Fruit.initFruitList(data);
//    FruitAdapter adapter=new FruitAdapter(list,this);
//    listView.setAdapter(adapter);
//
//
//    
//    listView.setOnItemClickListener(this);
//    actionBar=getSupportActionBar();
//    if(actionBar!=null){
//      actionBar.hide();
//    }
//    progressBar=findViewById(R.id.progress_bar);
//    imageView=findViewById(R.id.iv_img);
//    btnImgSet=findViewById(R.id.btn_img_set);
//    btnImgSet.setOnClickListener(this);
    
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
//    int viewId=v.getId();
//    switch (viewId){
//      case R.id.btn_img_set:
//        Intent intent=new Intent(this,FourthActivity.class);
//        startActivity(intent);
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
//    }
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    String tempData="look at her butt";
    outState.putString("keykey",tempData);
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//    Fruit fruit=list.get(position);
//    Toast.makeText(this,fruit.getName(),Toast.LENGTH_SHORT).show();
  }
}
