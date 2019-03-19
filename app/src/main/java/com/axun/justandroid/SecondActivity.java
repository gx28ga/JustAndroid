package com.axun.justandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
  Button button;
  private static final String TAG = "SecondActivity";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d(TAG, "task id  is "+getTaskId());
    setContentView(R.layout.activity_second);
    button=findViewById(R.id.btn_mess);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        
      }
    });
  }



  @Override
  public void onBackPressed() {
    Intent intent=new Intent();
    intent.putExtra("cheat","i see dead people");
    setResult(RESULT_OK,intent);
    finish();
    
  }

 
}
