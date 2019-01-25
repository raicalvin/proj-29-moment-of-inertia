package com.a29moon.momentofinertia;

import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MOIFragmentPagerAdapter mMOIFragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMOIFragmentPagerAdapter = new MOIFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mMOIFragmentPagerAdapter);
    }
}
