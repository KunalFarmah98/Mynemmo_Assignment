package com.apps.kunalfarmah.kunalfarmah;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerTabAdapter extends FragmentPagerAdapter {


    public PagerTabAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Lower_frag1();
        } else if (position == 1) {
            return new Lower_frag2();
        } else{
            return new Lower_frag3();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
