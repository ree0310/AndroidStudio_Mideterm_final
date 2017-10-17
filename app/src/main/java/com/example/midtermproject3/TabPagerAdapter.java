package com.example.midtermproject3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 문혜리 on 2017-10-14.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    public TabPagerAdapter(FragmentManager fm){
        super(fm);
    }

    public CharSequence getPageTitle(int position){
        return  mFragmentTitleList.get(position);
    }

    public Fragment getItem(int position){
        return mFragmentList.get(position);
    }

    public int getCount(){
        return mFragmentList.size();
    }


}
