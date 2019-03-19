package com.axun.justandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "data";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: i see dead people");
        button=findViewById(R.id.btn_greed);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int viewId=v.getId();
        switch (viewId){
            case R.id.btn_greed:
//                Intent intent=new Intent("com.axun.justandroid.bkb");
//                intent.addCategory("com.axun.justandroid.mikasa");
//                startActivity(intent);
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://kkj.cn"));
                startActivity(intent);


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuId=item.getItemId();
        switch (menuId){
            case R.id.add_item:
                Toast.makeText(this,"add clicked you",Toast.LENGTH_LONG).show();
                break;

        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
}
