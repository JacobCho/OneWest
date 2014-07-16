package com.racepace.onewest.workouts;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.racepace.onewest.R;
import com.racepace.onewest.widgets.AnimatedExpandableListView;
import com.racepace.onewest.widgets.AnimatedExpandableListView.AnimatedExpandableListAdapter;

 
public class OCWorkoutsFragment extends Fragment {
	

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.oc_fragment, container, false);
        
        final AnimatedExpandableListView elv2 = (AnimatedExpandableListView) rootView.findViewById(R.id.list2);
        final ExpandableListView altelv = (ExpandableListView) rootView.findViewById(R.id.altlist);
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
        	
        elv2.setOnGroupClickListener(new OnGroupClickListener() {

                 @Override
                 public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                     // We call collapseGroupWithAnimation(int) and
                     // expandGroupWithAnimation(int) to animate group 
                     // expansion/collapse.
                     if (elv2.isGroupExpanded(groupPosition)) {
                     	elv2.collapseGroupWithAnimation(groupPosition);
                     } else {
                     	elv2.expandGroupWithAnimation(groupPosition);
                     }
                     return true;
                 }
                 
             });
        
        elv2.setAdapter(new AnimatedAdapter());
        
        } else { 
        	elv2.setVisibility(View.GONE);
        	altelv.setVisibility(View.VISIBLE);
        	
        	altelv.setOnGroupClickListener(new OnGroupClickListener() {

                @Override
                public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                    // We call collapseGroupWithAnimation(int) and
                    // expandGroupWithAnimation(int) to animate group 
                    // expansion/collapse.
                    if (altelv.isGroupExpanded(groupPosition)) {
                    	altelv.collapseGroup(groupPosition);
                    } else {
                    	altelv.expandGroup(groupPosition);
                    }
                    return true;
                }
                
            });
        	
        	altelv.setAdapter(new AlternateAdapter());
        	
        }
       
        return rootView;
    }
   
    /************ IF DEVICE VERSION IS HIGHER THAN JELLYBEAN, USE THIS ADAPTER *******************/
    private class AnimatedAdapter extends AnimatedExpandableListAdapter {
    	// Aug 3
    	CharSequence aug10primary = Html.fromHtml(getString(R.string.aug10primary));
    	CharSequence aug10sec = Html.fromHtml(getString(R.string.aug10sec));
    	CharSequence aug10db = Html.fromHtml(getString(R.string.aug10db));
    	
    	// Aug 3
    	CharSequence aug3primary = Html.fromHtml(getString(R.string.aug3primary));
    	CharSequence aug3sec = Html.fromHtml(getString(R.string.aug3sec));
    	CharSequence aug3db = Html.fromHtml(getString(R.string.aug3db));
    	
    	// Jul 27
    	CharSequence jul27primary = Html.fromHtml(getString(R.string.jul27primary));
    	CharSequence jul27sec = Html.fromHtml(getString(R.string.jul27sec));
    	CharSequence jul27db = Html.fromHtml(getString(R.string.jul27db));
    	
    	// Jul 20
    	CharSequence jul20primary = Html.fromHtml(getString(R.string.jul20primary));
    	CharSequence jul20sec = Html.fromHtml(getString(R.string.jul20sec));
    	CharSequence jul20db = Html.fromHtml(getString(R.string.jul20db));
    	
    	// Jul 13
    	CharSequence jul13primary = Html.fromHtml(getString(R.string.jul13primary));
    	CharSequence jul13sec = Html.fromHtml(getString(R.string.jul13sec));
    	CharSequence jul13db = Html.fromHtml(getString(R.string.jul13db));
    	
    	// Jul 6
    	CharSequence jul6primary = Html.fromHtml(getString(R.string.jul6primary));
    	CharSequence jul6sec = Html.fromHtml(getString(R.string.jul6sec));
    	CharSequence jul6db = Html.fromHtml(getString(R.string.jul6db));
    	
    	// Jun 29
    	CharSequence jun29primary = Html.fromHtml(getString(R.string.jun29primary));
    	CharSequence jun29sec = Html.fromHtml(getString(R.string.jun29sec));
    	CharSequence jun29db = Html.fromHtml(getString(R.string.jun29db));
    	
    	// Jun 22
    	CharSequence jun22primary = Html.fromHtml(getString(R.string.jun22primary));
    	CharSequence jun22db = Html.fromHtml(getString(R.string.jun22db));
    	
    	// Jun 15
    	CharSequence jun15primary = Html.fromHtml(getString(R.string.jun15primary));
    	CharSequence jun15db = Html.fromHtml(getString(R.string.jun15db));
    	
    	// Jun 8
    	CharSequence jun8primary = Html.fromHtml(getString(R.string.jun8primary));
    	CharSequence jun8sec = Html.fromHtml(getString(R.string.jun8sec));
    	CharSequence jun8db = Html.fromHtml(getString(R.string.jun8db));
    	CharSequence jun8db2 = Html.fromHtml(getString(R.string.jun8db2));
    	
    	// Jun 1
    	CharSequence jun1primary = Html.fromHtml(getString(R.string.jun1primary));
    	CharSequence jun1sec = Html.fromHtml(getString(R.string.jun1sec));
    	CharSequence jun1db = Html.fromHtml(getString(R.string.jun1db));
    	CharSequence jun1db2 = Html.fromHtml(getString(R.string.jun1db2));
    	
    	// May 25
    	CharSequence may25coached = Html.fromHtml(getString(R.string.may25coached));
    	CharSequence may25primary = Html.fromHtml(getString(R.string.may25primary));
    	CharSequence may25db = Html.fromHtml(getString(R.string.may25db));
    	
    	// May 18
    	CharSequence may18coached = Html.fromHtml(getString(R.string.may18coached));
    	CharSequence may18primary = Html.fromHtml(getString(R.string.may18primary));
    	CharSequence may18db = Html.fromHtml(getString(R.string.may18db));

    	// May 11
    	CharSequence may11coached = Html.fromHtml(getString(R.string.may11coached));
    	CharSequence may11primary = Html.fromHtml(getString(R.string.may11primary));
    	CharSequence may11db = Html.fromHtml(getString(R.string.may11db));
    	
    	// May 4
    	CharSequence may4coached = Html.fromHtml(getString(R.string.may4coached));
    	CharSequence may4primary = Html.fromHtml(getString(R.string.may4primary));
    	CharSequence may4db = Html.fromHtml(getString(R.string.may4db));
    	
    	// Apr 27
    	CharSequence apr27coached = Html.fromHtml(getString(R.string.apr27coached));
    	CharSequence apr27primary = Html.fromHtml(getString(R.string.apr27primary));
    	CharSequence apr27db = Html.fromHtml(getString(R.string.apr27db));
    	
    	// Apr 20
    	CharSequence apr20coached = Html.fromHtml(getString(R.string.apr20coached));
    	CharSequence apr20primary = Html.fromHtml(getString(R.string.apr20primary));
    	CharSequence apr20db = Html.fromHtml(getString(R.string.apr20db));
    	
    	// Apr 13
    	CharSequence apr13coached = Html.fromHtml(getString(R.string.apr13coached));
    	CharSequence apr13primary = Html.fromHtml(getString(R.string.apr13primary));
    	CharSequence apr13db = Html.fromHtml(getString(R.string.apr13db));
    	
    	// Apr 6
    	CharSequence apr6coached = Html.fromHtml(getString(R.string.apr6coached));
    	CharSequence apr6primary = Html.fromHtml(getString(R.string.apr6primary));
    	CharSequence apr6db = Html.fromHtml(getString(R.string.apr6db));
    	
    	// Mar 30
    	CharSequence mar30coached = Html.fromHtml(getString(R.string.mar30coached));
    	CharSequence mar30primary = Html.fromHtml(getString(R.string.mar30primary));
    	CharSequence mar30db = Html.fromHtml(getString(R.string.mar30db));
    	
    	// Mar 23
    	CharSequence mar23primary = Html.fromHtml(getString(R.string.mar23primary));
    	
    	// Mar 16
    	CharSequence mar16coached = Html.fromHtml(getString(R.string.mar16coached));
    	CharSequence mar16primary = Html.fromHtml(getString(R.string.mar16primary));
    	CharSequence mar16sec = Html.fromHtml(getString(R.string.mar16sec));
    	
    	// Mar 9
    	CharSequence mar9coached = Html.fromHtml(getString(R.string.mar9coached));
    	CharSequence mar9primary = Html.fromHtml(getString(R.string.mar9primary));
    	CharSequence mar9sec = Html.fromHtml(getString(R.string.mar9sec));
    	
    	// Mar 2
    	CharSequence mar2coached = Html.fromHtml(getString(R.string.mar2coached));
    	CharSequence mar2primary = Html.fromHtml(getString(R.string.mar2primary));
    	CharSequence mar2sec = Html.fromHtml(getString(R.string.mar2sec));
    	/*
    	// Feb 23
    	CharSequence feb23coached = Html.fromHtml(getString(R.string.feb23coached));
    	CharSequence feb23primary = Html.fromHtml(getString(R.string.feb23primary));
    	CharSequence feb23sec = Html.fromHtml(getString(R.string.feb23sec));
    	
    	// Feb 16
    	CharSequence feb16coached = Html.fromHtml(getString(R.string.feb16coached));
    	CharSequence feb16primary = Html.fromHtml(getString(R.string.feb16primary));
    	CharSequence feb16sec = Html.fromHtml(getString(R.string.feb16sec));
    	
    	// Feb 9
    	CharSequence feb9coached = Html.fromHtml(getString(R.string.feb9coached));
    	CharSequence feb9primary = Html.fromHtml(getString(R.string.feb9primary));
    	CharSequence feb9sec = Html.fromHtml(getString(R.string.feb9sec));
    	
    	// Feb 2
    	CharSequence feb2coached = Html.fromHtml(getString(R.string.feb2coached));
    	CharSequence feb2primary = Html.fromHtml(getString(R.string.feb2primary));
    	CharSequence feb2sec = Html.fromHtml(getString(R.string.feb2sec));
    	
    	// Jan 26
    	CharSequence jan26coached = Html.fromHtml(getString(R.string.jan26coached));
    	CharSequence jan26primary = Html.fromHtml(getString(R.string.jan26primary));
    	CharSequence jan26sec = Html.fromHtml(getString(R.string.jan26sec));
    	
    	// Jan 19
    	CharSequence jan19coached = Html.fromHtml(getString(R.string.jan19coached));
    	CharSequence jan19primary = Html.fromHtml(getString(R.string.jan19primary));
    	CharSequence jan19sec = Html.fromHtml(getString(R.string.jan19sec));
    	
    	// Jan 12
    	CharSequence jan12coached = Html.fromHtml(getString(R.string.jan12coached));
    	CharSequence jan12primary = Html.fromHtml(getString(R.string.jan12primary));
    	CharSequence jan12sec = Html.fromHtml(getString(R.string.jan12sec));
    	
    	// Jan 5
    	CharSequence jan5coached = Html.fromHtml(getString(R.string.jan5coached));
    	CharSequence jan5primary = Html.fromHtml(getString(R.string.jan5primary));
    	CharSequence jan5sec = Html.fromHtml(getString(R.string.jan5sec));
    	
    	// Dec 29
    	CharSequence dec29coached = Html.fromHtml(getString(R.string.dec29coached));
    	CharSequence dec29primary = Html.fromHtml(getString(R.string.dec29primary));
    	CharSequence dec29sec = Html.fromHtml(getString(R.string.dec29sec));
    	
    	// Dec 22
    	CharSequence dec22 = Html.fromHtml(getString(R.string.dec22));
    	
    	// Dec 15
    	CharSequence dec15coached = Html.fromHtml(getString(R.string.dec15coached));
    	CharSequence dec15primary = Html.fromHtml(getString(R.string.dec15primary));
    	CharSequence dec15sec = Html.fromHtml(getString(R.string.dec15sec));
    	CharSequence dec15bonus = Html.fromHtml(getString(R.string.dec15bonus));
    	
    	// Dec 8
    	CharSequence dec8coached = Html.fromHtml(getString(R.string.dec8coached));
    	CharSequence dec8primary = Html.fromHtml(getString(R.string.dec8primary));
    	CharSequence dec8sec = Html.fromHtml(getString(R.string.dec8sec));
    	CharSequence dec8bonus = Html.fromHtml(getString(R.string.dec8bonus));
    	
    	// Dec 1
    	CharSequence dec1coached = Html.fromHtml(getString(R.string.dec1coached));
    	CharSequence dec1primary = Html.fromHtml(getString(R.string.dec1primary));
    	CharSequence dec1sec = Html.fromHtml(getString(R.string.dec1sec));
    	CharSequence dec1bonus = Html.fromHtml(getString(R.string.dec1bonus));
    	
    	// Nov 24
    	CharSequence nov24coached = Html.fromHtml(getString(R.string.nov24coached));
    	CharSequence nov24primary = Html.fromHtml(getString(R.string.nov24primary));
    	CharSequence nov24sec = Html.fromHtml(getString(R.string.nov24sec));
    	CharSequence nov24bonus = Html.fromHtml(getString(R.string.nov24bonus));
    	
    	// Nov 17
    	CharSequence nov17coached = Html.fromHtml(getString(R.string.nov17coached));
    	CharSequence nov17primary = Html.fromHtml(getString(R.string.nov17primary));
    	CharSequence nov17sec = Html.fromHtml(getString(R.string.nov17sec));
    	CharSequence nov17bonus = Html.fromHtml(getString(R.string.nov17bonus));
    	
    	// Nov 10
    	CharSequence nov10coached = Html.fromHtml(getString(R.string.nov10coached));
    	CharSequence nov10primary = Html.fromHtml(getString(R.string.nov10primary));
    	CharSequence nov10sec = Html.fromHtml(getString(R.string.nov10sec));
    	CharSequence nov10bonus = Html.fromHtml(getString(R.string.nov10bonus));
    	
    	// Nov 3
    	CharSequence nov3coached = Html.fromHtml(getString(R.string.nov3coached));
    	CharSequence nov3primary = Html.fromHtml(getString(R.string.nov3primary));
    	CharSequence nov3sec = Html.fromHtml(getString(R.string.nov3sec));
    	CharSequence nov3bonus = Html.fromHtml(getString(R.string.nov3bonus));
    	
    	// Oct 27
    	CharSequence oct27coached = Html.fromHtml(getString(R.string.oct27coached));
    	CharSequence oct27primary = Html.fromHtml(getString(R.string.oct27primary));
    	CharSequence oct27sec = Html.fromHtml(getString(R.string.oct27sec));
    	CharSequence oct27bonus = Html.fromHtml(getString(R.string.oct27bonus));
    	
    	// Oct 20
    	CharSequence oct20coached = Html.fromHtml(getString(R.string.oct20coached));
    	CharSequence oct20primary = Html.fromHtml(getString(R.string.oct20primary));
    	CharSequence oct20sec = Html.fromHtml(getString(R.string.oct20sec));
    	CharSequence oct20bonus = Html.fromHtml(getString(R.string.oct20bonus));  */
   	 
        private CharSequence[] groups = getResources().getTextArray(R.array.OCDates);
 
        private CharSequence[][] children = {
        	{ aug10primary, aug10sec, aug10db },
        	{ aug3primary, aug3sec, aug3db },
        	{ jul27primary, jul27sec, jul27db },
        	{ jul20primary, jul20sec, jul20db },	
        	{ jul13primary, jul13sec, jul13db },
        	{ jul6primary, jul6sec, jul6db },
        	{ jun29primary, jun29sec, jun29db},
        	{ jun22primary, jun22db },
        	{ jun15primary, jun15db },
        	{ jun8primary, jun8sec, jun8db },
        	{ jun1primary, jun1sec, jun1db },
        	{ may25coached, may25primary, may25db },
        	{ may18coached, may18primary, may18db },
        	{ may11coached, may11primary, may11db },
        	{ may4coached, may4primary, may4db },
        	{ apr27coached, apr27primary, apr27db },	
        	{ apr20coached, apr20primary, apr20db },
        	{ apr13coached, apr13primary, apr13db },
        	{ apr6coached, apr6primary, apr6db },
        	{ mar30coached, mar30primary, mar30db },
        	{ mar23primary },
        	{ mar16coached, mar16primary, mar16sec },
        	{ mar9coached, mar9primary, mar9sec },
        	{ mar2coached, mar2primary, mar2sec },	
        	/*
        	{ feb23coached, feb23primary, feb23sec },	
        	{ feb16coached, feb16primary, feb16sec },	
        	{ feb9coached, feb9primary, feb9sec },
        	{ feb2coached, feb2primary, feb2sec },
        	{ jan26coached, jan26primary, jan26sec },	
        	{ jan19coached, jan19primary, jan19sec },
        	{ jan12coached, jan12primary, jan12sec },
        	{ jan5coached, jan5primary, jan5sec},
        	{ dec29coached, dec29primary, dec29sec },
            { dec22},
            { dec15coached, dec15primary, dec15sec, dec15bonus},
            { dec8coached, dec8primary, dec8sec, dec8bonus },
            { dec1coached, dec1primary, dec1sec, dec1bonus},
            { nov24coached, nov24primary, nov24sec, nov24bonus },
            { nov17coached, nov17primary, nov17sec, nov17bonus},
            { nov10coached, nov10primary, nov10sec, nov10bonus },
            { nov3coached, nov3primary, nov3sec, nov3bonus },
            { oct27coached, oct27primary, oct27sec, oct27bonus },
            { oct20coached, oct20primary, oct20sec, oct20bonus } */
        };
 
        @Override
        public int getGroupCount() {
            return groups.length;
        }
 
        @Override
        public int getRealChildrenCount(int i) {
            return children[i].length;
        }
 
        @Override
        public CharSequence getGroup(int i) {
            return groups[i];
        }
 
        @Override
        public CharSequence getChild(int i, int i1) {
            return children[i][i1];
        }
 
        @Override
        public long getGroupId(int i) {
            return i;
        }
 
        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }
 
        @Override
        public boolean hasStableIds() {
            return true;
        }
 
        @Override
        public View getGroupView(int i, boolean isExpanded, View view, ViewGroup viewGroup) {
            TextView textView = (TextView)getActivity().getLayoutInflater().inflate(R.layout.listtitle, null);
            textView.setText(getGroup(i));
            if (isExpanded) {
            	textView.setBackgroundColor(Color.parseColor("#c0392b"));
            	textView.setTextColor(Color.WHITE);
            }
            else {
            	textView.setBackgroundColor(Color.WHITE);
            }
            return textView;
            
        }
 
        @Override
        public View getRealChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        	LinearLayout child = (LinearLayout)getActivity().getLayoutInflater().inflate(R.layout.child_row, null);
            ((TextView)child.findViewById(R.id.textViewChild)).setText(getChild(i, i1));
            
            return child;
        }
 
        @Override
        public boolean isChildSelectable(int i, int i1) {
            return false;
        }

    }
    
    private class AlternateAdapter extends BaseExpandableListAdapter {
    	// Aug 3
    	CharSequence aug10primary = Html.fromHtml(getString(R.string.aug10primary));
    	CharSequence aug10sec = Html.fromHtml(getString(R.string.aug10sec));
    	CharSequence aug10db = Html.fromHtml(getString(R.string.aug10db));
    	
    	// Aug 3
    	CharSequence aug3primary = Html.fromHtml(getString(R.string.aug3primary));
    	CharSequence aug3sec = Html.fromHtml(getString(R.string.aug3sec));
    	CharSequence aug3db = Html.fromHtml(getString(R.string.aug3db));
    	
    	// Jul 27
    	CharSequence jul27primary = Html.fromHtml(getString(R.string.jul27primary));
    	CharSequence jul27sec = Html.fromHtml(getString(R.string.jul27sec));
    	CharSequence jul27db = Html.fromHtml(getString(R.string.jul27db));
    	
    	// Jul 20
    	CharSequence jul20primary = Html.fromHtml(getString(R.string.jul20primary));
    	CharSequence jul20sec = Html.fromHtml(getString(R.string.jul20sec));
    	CharSequence jul20db = Html.fromHtml(getString(R.string.jul20db));
    	
    	// Jul 13
    	CharSequence jul13primary = Html.fromHtml(getString(R.string.jul13primary));
    	CharSequence jul13sec = Html.fromHtml(getString(R.string.jul13sec));
    	CharSequence jul13db = Html.fromHtml(getString(R.string.jul13db));
    	
    	// Jul 6
    	CharSequence jul6primary = Html.fromHtml(getString(R.string.jul6primary));
    	CharSequence jul6sec = Html.fromHtml(getString(R.string.jul6sec));
    	CharSequence jul6db = Html.fromHtml(getString(R.string.jul6db));
    	
    	// Jun 29
    	CharSequence jun29primary = Html.fromHtml(getString(R.string.jun29primary));
    	CharSequence jun29sec = Html.fromHtml(getString(R.string.jun29sec));
    	CharSequence jun29db = Html.fromHtml(getString(R.string.jun29db));
    	
    	// Jun 22
    	CharSequence jun22primary = Html.fromHtml(getString(R.string.jun22primary));
    	CharSequence jun22db = Html.fromHtml(getString(R.string.jun22db));
    	
    	// Jun 15
    	CharSequence jun15primary = Html.fromHtml(getString(R.string.jun15primary));
    	CharSequence jun15db = Html.fromHtml(getString(R.string.jun15db));
    	
    	// Jun 8
    	CharSequence jun8primary = Html.fromHtml(getString(R.string.jun8primary));
    	CharSequence jun8sec = Html.fromHtml(getString(R.string.jun8sec));
    	CharSequence jun8db = Html.fromHtml(getString(R.string.jun8db));
    	CharSequence jun8db2 = Html.fromHtml(getString(R.string.jun8db2));
    	
    	// Jun 1
    	CharSequence jun1primary = Html.fromHtml(getString(R.string.jun1primary));
    	CharSequence jun1sec = Html.fromHtml(getString(R.string.jun1sec));
    	CharSequence jun1db = Html.fromHtml(getString(R.string.jun1db));
    	CharSequence jun1db2 = Html.fromHtml(getString(R.string.jun1db2));
    	
    	// May 25
    	CharSequence may25coached = Html.fromHtml(getString(R.string.may25coached));
    	CharSequence may25primary = Html.fromHtml(getString(R.string.may25primary));
    	CharSequence may25db = Html.fromHtml(getString(R.string.may25db));
    	
    	// May 18
    	CharSequence may18coached = Html.fromHtml(getString(R.string.may18coached));
    	CharSequence may18primary = Html.fromHtml(getString(R.string.may18primary));
    	CharSequence may18db = Html.fromHtml(getString(R.string.may18db));

    	// May 11
    	CharSequence may11coached = Html.fromHtml(getString(R.string.may11coached));
    	CharSequence may11primary = Html.fromHtml(getString(R.string.may11primary));
    	CharSequence may11db = Html.fromHtml(getString(R.string.may11db));
    	
    	// May 4
    	CharSequence may4coached = Html.fromHtml(getString(R.string.may4coached));
    	CharSequence may4primary = Html.fromHtml(getString(R.string.may4primary));
    	CharSequence may4db = Html.fromHtml(getString(R.string.may4db));
    	
    	// Apr 27
    	CharSequence apr27coached = Html.fromHtml(getString(R.string.apr27coached));
    	CharSequence apr27primary = Html.fromHtml(getString(R.string.apr27primary));
    	CharSequence apr27db = Html.fromHtml(getString(R.string.apr27db));
    	
    	// Apr 20
    	CharSequence apr20coached = Html.fromHtml(getString(R.string.apr20coached));
    	CharSequence apr20primary = Html.fromHtml(getString(R.string.apr20primary));
    	CharSequence apr20db = Html.fromHtml(getString(R.string.apr20db));
    	
    	// Apr 13
    	CharSequence apr13coached = Html.fromHtml(getString(R.string.apr13coached));
    	CharSequence apr13primary = Html.fromHtml(getString(R.string.apr13primary));
    	CharSequence apr13db = Html.fromHtml(getString(R.string.apr13db));
    	
    	// Apr 6
    	CharSequence apr6coached = Html.fromHtml(getString(R.string.apr6coached));
    	CharSequence apr6primary = Html.fromHtml(getString(R.string.apr6primary));
    	CharSequence apr6db = Html.fromHtml(getString(R.string.apr6db));
    	
    	// Mar 30
    	CharSequence mar30coached = Html.fromHtml(getString(R.string.mar30coached));
    	CharSequence mar30primary = Html.fromHtml(getString(R.string.mar30primary));
    	CharSequence mar30db = Html.fromHtml(getString(R.string.mar30db));
    	
    	// Mar 23
    	CharSequence mar23primary = Html.fromHtml(getString(R.string.mar23primary));
    	
    	// Mar 16
    	CharSequence mar16coached = Html.fromHtml(getString(R.string.mar16coached));
    	CharSequence mar16primary = Html.fromHtml(getString(R.string.mar16primary));
    	CharSequence mar16sec = Html.fromHtml(getString(R.string.mar16sec));
    	
    	// Mar 9
    	CharSequence mar9coached = Html.fromHtml(getString(R.string.mar9coached));
    	CharSequence mar9primary = Html.fromHtml(getString(R.string.mar9primary));
    	CharSequence mar9sec = Html.fromHtml(getString(R.string.mar9sec));
    	
    	// Mar 2
    	CharSequence mar2coached = Html.fromHtml(getString(R.string.mar2coached));
    	CharSequence mar2primary = Html.fromHtml(getString(R.string.mar2primary));
    	CharSequence mar2sec = Html.fromHtml(getString(R.string.mar2sec));
    	/*
    	// Feb 23
    	CharSequence feb23coached = Html.fromHtml(getString(R.string.feb23coached));
    	CharSequence feb23primary = Html.fromHtml(getString(R.string.feb23primary));
    	CharSequence feb23sec = Html.fromHtml(getString(R.string.feb23sec));
    	
    	// Feb 16
    	CharSequence feb16coached = Html.fromHtml(getString(R.string.feb16coached));
    	CharSequence feb16primary = Html.fromHtml(getString(R.string.feb16primary));
    	CharSequence feb16sec = Html.fromHtml(getString(R.string.feb16sec));
    	
    	// Feb 9
    	CharSequence feb9coached = Html.fromHtml(getString(R.string.feb9coached));
    	CharSequence feb9primary = Html.fromHtml(getString(R.string.feb9primary));
    	CharSequence feb9sec = Html.fromHtml(getString(R.string.feb9sec));
    	
    	// Feb 2
    	CharSequence feb2coached = Html.fromHtml(getString(R.string.feb2coached));
    	CharSequence feb2primary = Html.fromHtml(getString(R.string.feb2primary));
    	CharSequence feb2sec = Html.fromHtml(getString(R.string.feb2sec));
    	
    	// Jan 26
    	CharSequence jan26coached = Html.fromHtml(getString(R.string.jan26coached));
    	CharSequence jan26primary = Html.fromHtml(getString(R.string.jan26primary));
    	CharSequence jan26sec = Html.fromHtml(getString(R.string.jan26sec));
    	
    	// Jan 19
    	CharSequence jan19coached = Html.fromHtml(getString(R.string.jan19coached));
    	CharSequence jan19primary = Html.fromHtml(getString(R.string.jan19primary));
    	CharSequence jan19sec = Html.fromHtml(getString(R.string.jan19sec));
    	
    	// Jan 12
    	CharSequence jan12coached = Html.fromHtml(getString(R.string.jan12coached));
    	CharSequence jan12primary = Html.fromHtml(getString(R.string.jan12primary));
    	CharSequence jan12sec = Html.fromHtml(getString(R.string.jan12sec));
    	
    	// Jan 5
    	CharSequence jan5coached = Html.fromHtml(getString(R.string.jan5coached));
    	CharSequence jan5primary = Html.fromHtml(getString(R.string.jan5primary));
    	CharSequence jan5sec = Html.fromHtml(getString(R.string.jan5sec));
    	
    	// Dec 29
    	CharSequence dec29coached = Html.fromHtml(getString(R.string.dec29coached));
    	CharSequence dec29primary = Html.fromHtml(getString(R.string.dec29primary));
    	CharSequence dec29sec = Html.fromHtml(getString(R.string.dec29sec));
    	
    	// Dec 22
    	CharSequence dec22 = Html.fromHtml(getString(R.string.dec22));
    	
    	// Dec 15
    	CharSequence dec15coached = Html.fromHtml(getString(R.string.dec15coached));
    	CharSequence dec15primary = Html.fromHtml(getString(R.string.dec15primary));
    	CharSequence dec15sec = Html.fromHtml(getString(R.string.dec15sec));
    	CharSequence dec15bonus = Html.fromHtml(getString(R.string.dec15bonus));
    	
    	// Dec 8
    	CharSequence dec8coached = Html.fromHtml(getString(R.string.dec8coached));
    	CharSequence dec8primary = Html.fromHtml(getString(R.string.dec8primary));
    	CharSequence dec8sec = Html.fromHtml(getString(R.string.dec8sec));
    	CharSequence dec8bonus = Html.fromHtml(getString(R.string.dec8bonus));
    	
    	// Dec 1
    	CharSequence dec1coached = Html.fromHtml(getString(R.string.dec1coached));
    	CharSequence dec1primary = Html.fromHtml(getString(R.string.dec1primary));
    	CharSequence dec1sec = Html.fromHtml(getString(R.string.dec1sec));
    	CharSequence dec1bonus = Html.fromHtml(getString(R.string.dec1bonus));
    	
    	// Nov 24
    	CharSequence nov24coached = Html.fromHtml(getString(R.string.nov24coached));
    	CharSequence nov24primary = Html.fromHtml(getString(R.string.nov24primary));
    	CharSequence nov24sec = Html.fromHtml(getString(R.string.nov24sec));
    	CharSequence nov24bonus = Html.fromHtml(getString(R.string.nov24bonus));
    	
    	// Nov 17
    	CharSequence nov17coached = Html.fromHtml(getString(R.string.nov17coached));
    	CharSequence nov17primary = Html.fromHtml(getString(R.string.nov17primary));
    	CharSequence nov17sec = Html.fromHtml(getString(R.string.nov17sec));
    	CharSequence nov17bonus = Html.fromHtml(getString(R.string.nov17bonus));
    	
    	// Nov 10
    	CharSequence nov10coached = Html.fromHtml(getString(R.string.nov10coached));
    	CharSequence nov10primary = Html.fromHtml(getString(R.string.nov10primary));
    	CharSequence nov10sec = Html.fromHtml(getString(R.string.nov10sec));
    	CharSequence nov10bonus = Html.fromHtml(getString(R.string.nov10bonus));
    	
    	// Nov 3
    	CharSequence nov3coached = Html.fromHtml(getString(R.string.nov3coached));
    	CharSequence nov3primary = Html.fromHtml(getString(R.string.nov3primary));
    	CharSequence nov3sec = Html.fromHtml(getString(R.string.nov3sec));
    	CharSequence nov3bonus = Html.fromHtml(getString(R.string.nov3bonus));
    	
    	// Oct 27
    	CharSequence oct27coached = Html.fromHtml(getString(R.string.oct27coached));
    	CharSequence oct27primary = Html.fromHtml(getString(R.string.oct27primary));
    	CharSequence oct27sec = Html.fromHtml(getString(R.string.oct27sec));
    	CharSequence oct27bonus = Html.fromHtml(getString(R.string.oct27bonus));
    	
    	// Oct 20
    	CharSequence oct20coached = Html.fromHtml(getString(R.string.oct20coached));
    	CharSequence oct20primary = Html.fromHtml(getString(R.string.oct20primary));
    	CharSequence oct20sec = Html.fromHtml(getString(R.string.oct20sec));
    	CharSequence oct20bonus = Html.fromHtml(getString(R.string.oct20bonus)); */
   	 
        private CharSequence[] groups = getResources().getTextArray(R.array.OCDates);
 
        private CharSequence[][] children = {
        	{ aug10primary, aug10sec, aug10db },
            { aug3primary, aug3sec, aug3db },
            { jul27primary, jul27sec, jul27db },
            { jul20primary, jul20sec, jul20db },	
            { jul13primary, jul13sec, jul13db },
            { jul6primary, jul6sec, jul6db },
            { jun29primary, jun29sec, jun29db},
            { jun22primary, jun22db },
        	{ jun15primary, jun15db },
        	{ jun8primary, jun8sec, jun8db },
        	{ jun1primary, jun1sec, jun1db },
        	{ may25coached, may25primary, may25db },
        	{ may18coached, may18primary, may18db },
        	{ may11coached, may11primary, may11db },
        	{ may4coached, may4primary, may4db },
        	{ apr27coached, apr27primary, apr27db },	
        	{ apr20coached, apr20primary, apr20db },
        	{ apr13coached, apr13primary, apr13db },
        	{ apr6coached, apr6primary, apr6db },
        	{ mar30coached, mar30primary, mar30db },
        	{ mar23primary },
        	{ mar16coached, mar16primary, mar16sec },
        	{ mar9coached, mar9primary, mar9sec },
        	{ mar2coached, mar2primary, mar2sec },	
        	/*
        	{ feb23coached, feb23primary, feb23sec },	
        	{ feb16coached, feb16primary, feb16sec },	
        	{ feb9coached, feb9primary, feb9sec },
        	{ feb2coached, feb2primary, feb2sec },
        	{ jan26coached, jan26primary, jan26sec },	
        	{ jan19coached, jan19primary, jan19sec },
        	{ jan12coached, jan12primary, jan12sec },
        	{ jan5coached, jan5primary, jan5sec},
        	{ dec29coached, dec29primary, dec29sec },
            { dec22},
            { dec15coached, dec15primary, dec15sec, dec15bonus},
            { dec8coached, dec8primary, dec8sec, dec8bonus },
            { dec1coached, dec1primary, dec1sec, dec1bonus},
            { nov24coached, nov24primary, nov24sec, nov24bonus },
            { nov17coached, nov17primary, nov17sec, nov17bonus},
            { nov10coached, nov10primary, nov10sec, nov10bonus },
            { nov3coached, nov3primary, nov3sec, nov3bonus },
            { oct27coached, oct27primary, oct27sec, oct27bonus },
            { oct20coached, oct20primary, oct20sec, oct20bonus } */
        };
        
        @Override
		public CharSequence getChild(int i, int i1) {
			return children[i][i1];
		}

		@Override
		public long getChildId(int i, int i1) {
			return i1;
		}

		@Override
		public View getChildView(int i, int i1, boolean b,
				View view, ViewGroup viewGroup) {
			LinearLayout child = (LinearLayout)getActivity().getLayoutInflater().inflate(R.layout.child_row, null);
            ((TextView)child.findViewById(R.id.textViewChild)).setText(getChild(i, i1)); 
            
            return child;
		}

		@Override
		public int getChildrenCount(int i) {
			return children[i].length;
		}

		@Override
		public CharSequence getGroup(int i) {
			return groups[i];
		}

		@Override
		public int getGroupCount() {
			return groups.length;
		}

		@Override
		public long getGroupId(int i) {
			return i;
		}

		@Override
		public View getGroupView(int i, boolean isExpanded, View view,
				ViewGroup viewGroup) {
			TextView textView = (TextView)getActivity().getLayoutInflater().inflate(R.layout.listtitle, null);
            textView.setText(getGroup(i));
            if (isExpanded) {
            	textView.setBackgroundColor(Color.parseColor("#c0392b"));  
            	textView.setTextColor(Color.WHITE);
            }
            else {
            	textView.setBackgroundColor(Color.WHITE);
            }
            return textView;
		}

		@Override
		public boolean hasStableIds() {
			return true;
		}

		@Override
		public boolean isChildSelectable(int i, int i1) {
			return true;
		}
    	
    }

}