package com.axun.justandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {
  private static final String TAG = "ThirdActivity";
  private List<Msg> msgList;
  private EditText inputText;
  private Button btnSend;
  
  private RecyclerView recyclerView;
  
  private MsgAdapter msgAdapter;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_third);
    
    msgList=new ArrayList<>();
    
    inputText=findViewById(R.id.edit_msg);
    btnSend=findViewById(R.id.btn_send);
    recyclerView=findViewById(R.id.rv_list);
    
    msgList=new ArrayList<>();
    Msg.initMsgList(msgList);
    msgAdapter=new MsgAdapter(msgList);
    
    recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    recyclerView.setAdapter(msgAdapter);
    
    btnSend.setOnClickListener(new View.OnClickListener() {
      
      @Override
      public void onClick(View v) {
        
        
        String content=inputText.getText().toString();
        if(!"".equals(content)){
          Msg msg=new Msg(content,Msg.TYPE_SEND);
          msgList.add(msg);
          msgAdapter.notifyItemInserted(msgList.size()-1);
          recyclerView.scrollToPosition(msgList.size()-1);
          inputText.setText("");
        }
      }
    });
    
    
  }
  
  
}
