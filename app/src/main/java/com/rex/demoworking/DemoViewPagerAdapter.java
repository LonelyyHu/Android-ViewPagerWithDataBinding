package com.rex.demoworking;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by yaucheukming on 14/9/2016.
 */

public class DemoViewPagerAdapter extends FragmentPagerAdapter {

//    private static final int PAGE_COUNT = 5;
    private Integer[] pages = {};

    public DemoViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return DemoFragment.newInstance(pages[position].toString());
    }

    @Override
    public int getCount() {
        return pages.length;
    }

    public void setPages(Integer[] pages) {
        this.pages = pages;
        notifyDataSetChanged();
    }
}
