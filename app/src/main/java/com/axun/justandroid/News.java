package com.axun.justandroid;

import java.util.ArrayList;
import java.util.List;

public class News {
  String title;
  String content;

  public News(){
    
  }
  
  public News(String title, String content){
    this.title=title;
    this.content=content;
  }
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
  
  public static List<News> initNews(){
    List<News> newsList=new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      newsList.add(new News("news title "+i,"news coooooooooooooooooooooooooooooontent "+i));
    }
    return newsList;
  }
}
