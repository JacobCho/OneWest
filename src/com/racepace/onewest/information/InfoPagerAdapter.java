package com.racepace.onewest.information;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class InfoPagerAdapter extends FragmentStatePagerAdapter {
	PagerAdapter mPagerAdapter;

	private ImportantDatesFragment importantDatesFragment;
	private InfoLinks infoLinks;

	private final String[] TITLES = {"Important Dates", "Links"};

	public InfoPagerAdapter(FragmentManager fm) {
		super(fm);
	}


	@Override
	public CharSequence getPageTitle(int position) {
		return TITLES[position];
	}

	@Override
	public int getCount() {
		return TITLES.length;
	}
	
	public void setAdapter(PagerAdapter adapter) {
    }

    public void storeAdapter(PagerAdapter pagerAdapter) {
        mPagerAdapter = pagerAdapter;
    }

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			importantDatesFragment = new ImportantDatesFragment();
			return (Fragment)importantDatesFragment;

		case 1:
			infoLinks = new InfoLinks();
			return (Fragment)infoLinks;
			

	}
		return null;
		
		
}

}
