package com.codingblocks.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        MyViewPagerAdapter myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager.setAdapter(myViewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }

    class MyViewPagerAdapter extends FragmentPagerAdapter {

        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {

            return "Tab " + position;

        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FragmentA.newInstance();
                case 1:
                    return FragmentB.newInstance();
                case 2:
                    return FragmentC.newInstance();
            }
            return FragmentA.newInstance();
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
