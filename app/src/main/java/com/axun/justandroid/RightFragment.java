package com.axun.justandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RightFragment extends Fragment {
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    View view=inflater.inflate(R.layout.fragment_right,container,false);
    
    return view;
  }
}