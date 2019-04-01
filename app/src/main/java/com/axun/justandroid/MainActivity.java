package com.axun.justandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.MenuItem;

public class MainActivity extends BaseActivity {
  private static final String TAG = "MainActivity";
  
  //创建3个fragment
  
  final HomeFragment homeFragment=new HomeFragment();
  final ButlerFragment butlerFragment=new ButlerFragment();
  final UserFragment userFragment=new UserFragment();
  //
  Fragment fragment;
  
  
  //初始化底部导航栏
  BottomNavigationView bnv;
  //
  
  
  final FragmentManager fragmentManager=getSupportFragmentManager();
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    bnv=findViewById(R.id.bnv_main);

    fragment=homeFragment;
    fragmentManager.beginTransaction().replace(R.id.frag_main,fragment).commit();
    
    
    
    
    
    
    
    
    //底部导航栏绑定选中事件
    bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
      @Override
      public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        
        switch (menuItem.getItemId()){
          
          case R.id.bottom_nav_home:
            fragment=homeFragment;
            break;
          case R.id.bottom_nav_butler:
            fragment=butlerFragment;  
            break;
          case R.id.bottom_nav_user:
            fragment=userFragment;
            break;
          default:
            fragment=homeFragment;
            break;
        }
        
        fragmentManager.beginTransaction().replace(R.id.frag_main,fragment).commit();
        return true;
      }
    });
    
    
    
    
      
  }
    

}

