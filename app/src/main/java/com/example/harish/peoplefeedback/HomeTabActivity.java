package com.example.harish.peoplefeedback;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Toolbar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class HomeTabActivity extends AppCompatActivity {


    private SectionPagerAdapter msectionPagerAdapter;
    private ViewPager mViewPager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_tab);



        //Tablayout

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        msectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.viewpager);
        setupViewPager(mViewPager);
        final TabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(mViewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_white);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_politician);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_award);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_notification);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:{

                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_white);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_politician);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_award);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_notification);
                        break;
                    }
                    case 1:{

                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_politician_white);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_award);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_notification);
                        break;
                    }
                    case 2:{
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_politician);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_award_white);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_notification);
                        break;
                    }
                    case 3:{
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_politician);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_award);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_notification_white);
                        break;
                    }

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    public void setupViewPager(ViewPager ViewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment());
        adapter.addFragment(new Tab2Fragment());
        adapter.addFragment(new Tab3Fragment());
        adapter.addFragment(new Tab4Fragment());
        mViewPager.setAdapter(adapter);



        //Tablayout
    }





    //OptionMenu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;

    }

    //OptionMenu
}
