package com.example.midtermproject3;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

import android.widget.TableLayout;
import android.widget.TextView;

public class TabLayoutActivity extends AppCompatActivity {

    private static final String TAG = "TabLayoutActivity";

    private TabPagerAdapter mSectionPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        Log.d(TAG,"onCreate: Starting.");

        mSectionPageAdapter = new TabPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager)findViewById(R.id.container);
        setUpViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setUpViewPager(ViewPager viewPager){
        TabPagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "Introduce");
        adapter.addFragment(new Tab2Fragment(), "Scene");
        adapter.addFragment(new Tab3Fragment(), "Toast");
        viewPager.setAdapter(adapter);
    }
}