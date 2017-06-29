package com.pixelcan.ipidemo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.pixelcan.inkpageindicator.InkPageIndicator;

public class MainActivity extends AppCompatActivity {

    TestFragmentAdapter mAdapter;
    ViewPager mPager;
    InkPageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (InkPageIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        mIndicator.setSelectedColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
        mIndicator.setUnSelectedColor(ContextCompat.getColor(MainActivity.this, android.R.color.holo_green_dark));
    }
}
