package com.rex.demoworking;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingComponent;
import android.databinding.ObservableArrayList;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by yaucheukming on 16/9/2016.
 */

public class DemoDataBindingComponent implements DataBindingComponent {


    @BindingAdapter(value = {"app:items"}, requireAll = false)
    public static void setViewPager(ViewPager viewPager, ObservableArrayList<Integer> pagerList ) {

        DemoViewPagerAdapter adapter = (DemoViewPagerAdapter) viewPager.getAdapter();
        adapter.setPages(pagerList.toArray(new Integer[0]));
//        viewPager.setAdapter(adapter);
    }


}
