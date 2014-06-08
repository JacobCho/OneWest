package com.racepace.onewest.workouts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.racepace.onewest.R;
import com.racepace.onewest.R.id;
import com.racepace.onewest.R.layout;

public class WorkOutsContainerFrag extends Fragment {
	
	private PagerSlidingTabStrip tabs;
	private ViewPager pager;
	private WorkoutsPagerAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.workoutscontainer, container, false);
        
        
		
		tabs = (PagerSlidingTabStrip) view.findViewById(R.id.workoutstabs);
		tabs.setIndicatorColor(Color.parseColor("#c0392b"));
		tabs.setDividerColor(Color.parseColor("#d4d4d4"));
		pager = (ViewPager) view.findViewById(R.id.workoutspager);
		pager.setOffscreenPageLimit(1); 
		adapter = new WorkoutsPagerAdapter(getFragmentManager());
	
		pager.setAdapter(adapter);

		final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources()
				.getDisplayMetrics());
		pager.setPageMargin(pageMargin);

		tabs.setViewPager(pager);
		
		
		return view;
		
}

	
}