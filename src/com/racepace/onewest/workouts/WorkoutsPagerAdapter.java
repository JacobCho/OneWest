package com.racepace.onewest.workouts;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class WorkoutsPagerAdapter extends FragmentStatePagerAdapter {
	PagerAdapter mPagerAdapter;

	private GymWorkoutsFragment gymWorkoutsFragment;
	private OCWorkoutsFragment ocWorkoutsFragment;
	private GifList giflist;

	private final String[] TITLES = {"Gym Workouts", "OC Workouts","Workout GIFs"};

	public WorkoutsPagerAdapter(FragmentManager fm) {
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
			gymWorkoutsFragment = new GymWorkoutsFragment();
			return (Fragment)gymWorkoutsFragment;

		case 1:
			ocWorkoutsFragment = new OCWorkoutsFragment();
			return (Fragment)ocWorkoutsFragment;
			
		case 2:
			giflist = new GifList();
			return (Fragment)giflist;
			

	}
		return null;
		
		
}



}
