package com.axun.justandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
  private static final String TAG = "MainActivity";
  Fragment fragment;

  final FragmentManager fragmentManager=getSupportFragmentManager();
  
  final HomeFragment homeFragment=new HomeFragment();
  final ButlerFragment butlerFragment=new ButlerFragment();
  final UserFragment userFragment=new UserFragment();
  FragmentPagerAdapter adapterViewPager;
  class ClickListener implements View.OnClickListener{

    @Override
    public void onClick(View v) {
      Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
    }
  }


  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    Toast.makeText(getApplicationContext(),"keyDown",Toast.LENGTH_SHORT).show();

    return true;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    MyButton button=findViewById(R.id.btn_mybtn);
    button.setOnKeyListener(new View.OnKeyListener() {
      @Override
      public boolean onKey(View v, int keyCode, KeyEvent event) {
        Toast.makeText(getApplicationContext(),"btn ",Toast.LENGTH_SHORT).show();

        return true;
      }
    });
    
    
    
    
    
//    BottomNavigationView bottomNavigationView=findViewById(R.id.bnv_main);
//    fragment=homeFragment;
//    
//    
//    fragmentManager.beginTransaction().replace(R.id.frag_main,fragment).commit();
//    bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//      @Override
//      public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        
//        int id=menuItem.getItemId();
//        switch (id) {
//          case R.id.bottom_nav_home:
//            fragment=homeFragment;
//            break;
//          case R.id.bottom_nav_butler:
//            fragment=butlerFragment;
//            break;
//          case R.id.bottom_nav_user:
//            fragment=userFragment;
//            break;
//          
//        }
//        
//        fragmentManager.beginTransaction().replace(R.id.frag_main,fragment).commit();
//        return true;
//      }
//    });

//    int[] imgs=new int[]{
//      R.drawable.home_slider_01,
//      R.drawable.home_slider_02,
//      R.drawable.home_slider_03,
//      R.drawable.home_slider_04,
//      R.drawable.home_slider_05,
//      R.drawable.home_slider_06,
//    };
//    final ViewPager viewPager=findViewById(R.id.vp_home);
//    viewPager.setAdapter(new MyPagerAdapter(this,imgs));

    

  }
    








}

