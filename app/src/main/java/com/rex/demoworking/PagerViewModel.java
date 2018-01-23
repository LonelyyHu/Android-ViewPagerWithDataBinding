package com.rex.demoworking;

import android.databinding.ObservableArrayList;

/**
 * Created by hulonelyy on 2017/12/12.
 */

public class PagerViewModel {

    public ObservableArrayList<Integer> pagerList = new ObservableArrayList<>();

    public PagerViewModel() {
        pagerList.add(100);
        pagerList.add(200);
        pagerList.add(300);
    }


}
