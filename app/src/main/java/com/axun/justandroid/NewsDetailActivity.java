package com.axun.justandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NewsDetailActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_news_detail);
    String newsTitle=getIntent().getStringExtra("news_title");
    String newsDetail=getIntent().getStringExtra("news_detail");
    NewsDetailFragment newsDetailFragment=(NewsDetailFragment) getSupportFragmentManager().findFragmentById(R.id.frag_news_detail);
    newsDetailFragment.refresh(newsTitle,newsDetail);
  }
  
  public static void actionStart(Context context, String newsTitle, String newsDetail){
    Intent intent=new Intent(context,NewsDetailActivity.class);
    intent.putExtra("news_title",newsTitle);
    intent.putExtra("news_detail",newsDetail);
    context.startActivity(intent);
  }
}
