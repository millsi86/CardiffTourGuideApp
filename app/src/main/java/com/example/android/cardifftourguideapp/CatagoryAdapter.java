package com.example.android.cardifftourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by tom.mills-mock on 06/06/2017.
 */

public class CatagoryAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    /**
     * Context of the app
     */
    private Context mContext;

    public CatagoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TravelFragment();
        } else if (position == 1) {
            return new StDavidsFragment();
        } else if (position == 2) {
            return new BayFragment();
        } else {
            return new CastlesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Travel_Fragment_Title);
        } else if (position == 1) {
            return mContext.getString(R.string.StDavids_Fragment_Title);
        } else if (position == 2) {
            return mContext.getString(R.string.Bay_Fragment_Title);
        } else {
            return mContext.getString(R.string.Castles_Fragment_Title);
        }
    }

}

