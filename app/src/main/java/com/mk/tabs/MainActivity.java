package com.mk.tabs;

import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


/**
 * for adding the tab layout add "implementation com.android.support:design:27.1.1"
 * to build.gradle (app) file
 */
public class MainActivity extends AppCompatActivity {

    private final String[] msg = {"This is tab 1","This is tab 2","This is tab 3","This is tab 4"};
    private final String[] pageTitle = {"Tab 1", "Tab 2", "Tab 3", "Tab 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager pager = findViewById(R.id.pager);
        setSupportActionBar(toolbar);
        pager.setAdapter(new Adapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(pager);



    }

    public class Adapter extends FragmentPagerAdapter {

        Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // to return different fragment at different position use
            // switch(position)
            // {case i: return yourFragment}
            return MyFragment.getInstance(msg[position]);
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return pageTitle[position];
        }
    }
}
