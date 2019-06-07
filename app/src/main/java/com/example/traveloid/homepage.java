package com.example.traveloid;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {
    int tabicons[]={R.drawable.home,R.drawable.hotel,R.drawable.travel,R.drawable.user_home};
    TabLayout tl;
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        tl=(TabLayout)findViewById(R.id.tl);
        vp=(ViewPager)findViewById(R.id.vp);
        MyAdapter adapter= new MyAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tl));
        tl.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(vp));
        setTabIcons();

    }
    public void search(View view){
        Intent intent = new Intent(this,Search.class);
        startActivity(intent);
    }

    private class MyAdapter extends FragmentPagerAdapter {
        int no_of_tabs=4;
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i){
                case 0:return new home();
                case 1:return new Hotel();
                case 2:return new travel();
                case 3:return new user();
            }
            return null;
        }

        @Override
        public int getCount() {
            return no_of_tabs;
        }
    }
    private void setTabIcons(){
        tl.getTabAt(0).setIcon(tabicons[0]);
        tl.getTabAt(1).setIcon(tabicons[1]);
        tl.getTabAt(2).setIcon(tabicons[2]);
        tl.getTabAt(3).setIcon(tabicons[3]);
    }
    public void settings(View view){
        Intent intent = new Intent(this,Settings.class);
        startActivity(intent);
    }

}
