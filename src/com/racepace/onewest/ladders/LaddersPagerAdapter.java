package com.racepace.onewest.ladders;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class LaddersPagerAdapter extends FragmentStatePagerAdapter {

	PagerAdapter mPagerAdapter;
	private LadderFragment ladderFragment;
	private MenSprint370 men370;
	private WomenSprint370 women370;
	private MenSprint165 men165;
	private WomenSprint165 women165;

	private final String[] TITLES = {"5K TT Ladder","370m TT Men","370m TT Women","165m TT Men","165m TT Women"};

	public LaddersPagerAdapter(FragmentManager fm) {
		super(fm);
	}
	
	public void setAdapter(PagerAdapter adapter) {
    }

    public void storeAdapter(PagerAdapter pagerAdapter) {
        mPagerAdapter = pagerAdapter;
    }
    
	@Override
	public CharSequence getPageTitle(int position) {
		return TITLES[position];
	}

	@Override
	public int getCount() {
		return TITLES.length;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			ladderFragment = new LadderFragment();
			return (Fragment)ladderFragment;
		case 1: 
			men370 = new MenSprint370();
			return (Fragment)men370;
		case 2: 
			women370 = new WomenSprint370();
			return (Fragment)women370;
		case 3: 
			men165 = new MenSprint165();
			return (Fragment)men165;
		case 4: 
			women165 = new WomenSprint165();
			return (Fragment)women165;
			

	}
		return null;
		
		
}
}
