package com.axun.justandroid;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
  private String name;
  private int imageId;

  public Fruit(String name, int imageId) {
    this.name = name;
    this.imageId = imageId;
  }

  public String getName() {
    return name;
  }

  public int getImageId() {
    return imageId;
  }
  
  public static List<Fruit> initFruitList (String[] arr){
    List<Fruit> fruits=new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      fruits.add(new Fruit(arr[i],R.drawable.begger));
    }
    
    return fruits;
  }
}

