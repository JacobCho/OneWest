package com.racepace.onewest.ladders;

import com.astuetz.PagerSlidingTabStrip;
import com.racepace.onewest.R;
import com.racepace.onewest.R.id;
import com.racepace.onewest.R.layout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LaddersContainer extends Fragment {
	private PagerSlidingTabStrip tabs;
	private ViewPager pager;
	private LaddersPagerAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ladderscontainer, container, false);
        
        
		
		tabs = (PagerSlidingTabStrip) view.findViewById(R.id.ladderstabs);
		tabs.setIndicatorColor(Color.parseColor("#c0392b"));
		tabs.setDividerColor(Color.parseColor("#d4d4d4"));
		pager = (ViewPager) view.findViewById(R.id.ladderspager);
		pager.setOffscreenPageLimit(1); 
		adapter = new LaddersPagerAdapter(getFragmentManager());
		
		pager.setAdapter(adapter);

		final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources()
				.getDisplayMetrics());
		pager.setPageMargin(pageMargin);

		tabs.setViewPager(pager);
		
		
		return view;
		
}

}
