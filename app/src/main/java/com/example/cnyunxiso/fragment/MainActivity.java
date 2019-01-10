package com.example.cnyunxiso.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display display = getWindowManager().getDefaultDisplay();
        if(display.getHeight()>display.getWidth()){
            Fragment fragment=new Fragment();
            getFragmentManager().beginTransaction().replace(R.id.main_layout,fragment).commit();
        }else{
            Fragment2 fragment2 = new Fragment2();
            getFragmentManager().beginTransaction().replace(R.id.main_layout,fragment2).commit();
        }
    }
}
