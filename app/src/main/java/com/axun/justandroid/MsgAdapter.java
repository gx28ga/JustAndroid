package com.axun.justandroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder> {
  private List<Msg> mList;
  public MsgAdapter(List<Msg> mList){
    this.mList=mList;
  }
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.msg_item,parent,false);
    
    ViewHolder holder=new ViewHolder(view);
    
    
    return holder;
  }

  public void onBindViewHolder(ViewHolder viewHolder, int position){
    Msg msg=mList.get(position);
    int msgType=msg.getType();
    if(msgType==1){
      viewHolder.leftLayout.setVisibility(View.INVISIBLE);
      viewHolder.rightMsg.setText(msg.getContent());
    }else if (msgType==0){
      viewHolder.rightLayout.setVisibility(View.INVISIBLE);
      viewHolder.leftMsg.setText(msg.getContent());
    }
    
  }

  public int getItemCount(){
    return mList.size();
  }
  
  class ViewHolder extends RecyclerView.ViewHolder{
    LinearLayout leftLayout,rightLayout;
    TextView leftMsg,rightMsg;
    public ViewHolder(View itemView){
      super(itemView);
      leftLayout= itemView.findViewById(R.id.left_layout);
      rightLayout=itemView.findViewById(R.id.right_layout);
      leftMsg= itemView.findViewById(R.id.left_msg);
      rightMsg=itemView.findViewById(R.id.right_msg);
    }
  }
}
