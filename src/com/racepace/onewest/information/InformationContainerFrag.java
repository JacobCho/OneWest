package com.racepace.onewest.information;

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

public class InformationContainerFrag extends Fragment {
	private PagerSlidingTabStrip tabs;
	private ViewPager pager;
	private InfoPagerAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.infocontainer, container, false);
        
        
		
		tabs = (PagerSlidingTabStrip) view.findViewById(R.id.infotabs);
		tabs.setIndicatorColor(Color.parseColor("#c0392b"));
		tabs.setDividerColor(Color.parseColor("#d4d4d4"));
		pager = (ViewPager) view.findViewById(R.id.infopager);
		pager.setOffscreenPageLimit(1); 
		adapter = new InfoPagerAdapter(getFragmentManager());
		
		pager.setAdapter(adapter);

		final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources()
				.getDisplayMetrics());
		pager.setPageMargin(pageMargin);

		tabs.setViewPager(pager);
		
		
		return view;
		
}

}
