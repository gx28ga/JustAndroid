package com.axun.justandroid;

import java.util.List;

public class Msg {
  public static final int TYPE_RECEIVED=0;
  public static final int TYPE_SEND=1;
  private String content;
  private int type;
  public Msg(String content,int type){
    this.content=content;
    this.type=type;
  }
  
  public String getContent(){
    return content;
  }
  
  public int getType(){
    return type;
  }
  
  public static void initMsgList(List<Msg> list){
    Msg msg1=new Msg("hello",Msg.TYPE_RECEIVED);
    Msg msg2=new Msg("hello again",Msg.TYPE_RECEIVED);
    Msg msg3=new Msg("hello one more time",Msg.TYPE_RECEIVED);
    list.add(msg1);
    list.add(msg2);
    list.add(msg3);
    
  }
}
