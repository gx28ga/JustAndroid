package com.axun.justandroid;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
  private String title;
  private int page;

  public SecondFragment() {
    // Required empty public constructor
  }

  
  public static SecondFragment newInstance(int page,String title){
    SecondFragment secondFragment=new SecondFragment();
    Bundle args =new Bundle();
    args.putInt("someInt",page);
    args.putString("someTitle",title);
    secondFragment.setArguments(args);
    return secondFragment;
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    page=getArguments().getInt("someInt",0);
    title=getArguments().getString("someTitle");
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view= inflater.inflate(R.layout.fragment_second, container, false);
    TextView tvLabel=view.findViewById(R.id.tv_label);
    tvLabel.setText(page+"----"+title);
    return view;
  }

}