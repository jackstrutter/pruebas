package com.medina.daniel.ubicarmec_taller2;

import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MisTrabajos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_trabajos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        MyPageAdapter myPagerAdapter =
                new MyPageAdapter(
                        getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPagerM);
        viewPager.setAdapter(myPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.TabsL);
        tabLayout.setupWithViewPager(viewPager);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
