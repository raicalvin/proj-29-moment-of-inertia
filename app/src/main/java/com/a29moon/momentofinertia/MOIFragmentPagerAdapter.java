package com.a29moon.momentofinertia;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

public class MOIFragmentPagerAdapter extends FragmentStatePagerAdapter {

    public MOIFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        Log.i("FPA=================", "getItem: " + position);
        if (position == 0) {
            return new FragmentRectangularShapes();
        } else {
            return new FragmentCircularShapes();
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * This method will set the names for the titles in the PagerTitleStrip
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Rectangular";
            case 1:
                return "Circular";
            case 2:
                return "Hollow";
            case 3:
                return "Curved";
        }
        return null;
    }
}

// Rectangular, Circular, Hollow, Curved
/*
    Remember, the PagerAdapter controls everything in your ViewPager from the fragments to the  names of the title strips
 */