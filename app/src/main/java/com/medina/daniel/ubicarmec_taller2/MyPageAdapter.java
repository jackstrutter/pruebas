package com.medina.daniel.ubicarmec_taller2;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class MyPageAdapter extends FragmentStatePagerAdapter {

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment;
        switch (i) {
            case 0:
                fragment = new Actuales();
                break;
            case 1:
                fragment = new Pasados();
                break;
            case 2:
                fragment = new Programados();
                break;
            default:
                fragment = null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Actuales";
            case 1:
                return "Pasados";
            case 2:
                return "Programados";
        }
        return null;
    }
}
