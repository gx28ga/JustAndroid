package com.axun.justandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {
  private static final String TAG = "ThirdActivity";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d(TAG, "task id is "+getTaskId());
    setContentView(R.layout.activity_third);
  }
}
