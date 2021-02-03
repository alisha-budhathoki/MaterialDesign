package com.alisha.qnacollege;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    NestedScrollView nestedScrollView;
    TextView toolbar_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        nestedScrollView = findViewById(R.id.scrollview);
        toolbar_title = findViewById(R.id.toolbarTitle);
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                toolbar_title.setVisibility(View.VISIBLE);
                Log.d("ProductFragment","position button " + oldScrollY + " scrollY " + scrollY);
                if(scrollY > oldScrollY){
                    Log.e("ProductFragment","down");
                }
                else{
                    Log.e("ProductFragment","up");
                }
            }
        });
    }
}