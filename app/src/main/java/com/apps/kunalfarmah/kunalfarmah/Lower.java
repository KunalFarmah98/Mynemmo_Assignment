package com.apps.kunalfarmah.kunalfarmah;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Lower extends Fragment {

    static ViewPager viewPager;

    public Lower() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_lower, container, false);

        viewPager = v.findViewById(R.id.viewpager);
        viewPager.setAdapter(new PagerTabAdapter(getFragmentManager()));

        TabLayout tl = v.findViewById(R.id.tab_layout);
        tl.setupWithViewPager(viewPager,true);

        return v;
    }
}



