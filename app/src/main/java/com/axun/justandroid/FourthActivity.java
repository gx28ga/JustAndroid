package com.axun.justandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class FourthActivity extends AppCompatActivity {
  private static final String TAG = "FourthActivity";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fourth);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main,menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    int itemId=item.getItemId();
    return true;
  }
  
  public static void actionStart(Context context, String newsTitle, String newsContent){
    Intent intent=new Intent(context,FourthActivity.class);
    intent.putExtra("new_title",newsTitle);
    intent.putExtra("news_content",newsContent);
    context.startActivity(intent);
  }
}
