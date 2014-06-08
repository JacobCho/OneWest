package com.racepace.onewest.information;

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

 
public class ImportantDatesFragment extends Fragment {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dates_fragment, container, false);
        
        final AnimatedExpandableListView elv = (AnimatedExpandableListView) rootView.findViewById(R.id.list3);
        final ExpandableListView altelv = (ExpandableListView) rootView.findViewById(R.id.altlist);
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
        
        elv.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                // We call collapseGroupWithAnimation(int) and
                // expandGroupWithAnimation(int) to animate group 
                // expansion/collapse.
                if (elv.isGroupExpanded(groupPosition)) {
                	elv.collapseGroupWithAnimation(groupPosition);
                } else {
                	elv.expandGroupWithAnimation(groupPosition);
                }
                return true;
            }
            
        });
        
        elv.setAdapter(new AnimatedAdapter());
        
        } else { 
        	elv.setVisibility(View.GONE);
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
        	
        	altelv.setAdapter(new AlternateAdapter ());
        
        }
        return rootView;
    }
    
    /************ IF DEVICE VERSION IS HIGHER THAN JELLYBEAN, USE THIS ADAPTER *******************/
    private class AnimatedAdapter extends AnimatedExpandableListAdapter {
    	
    	// General Prep. Phase (First Array)
    	CharSequence GPP = Html.fromHtml(getString(R.string.GPP));
    	
    	// Sport Specific Phase
    	CharSequence SSP1 = Html.fromHtml(getString(R.string.SSP1));
    	CharSequence SSP2 = Html.fromHtml(getString(R.string.SSP2));
    	CharSequence SSP3 = Html.fromHtml(getString(R.string.SSP3));
    	CharSequence SSP4 = Html.fromHtml(getString(R.string.SSP4));
    	CharSequence SSP5 = Html.fromHtml(getString(R.string.SSP5));
    	
    	// Pre Competition Phase
    	CharSequence PCP1 = Html.fromHtml(getString(R.string.PCP1));
    	CharSequence PCP2 = Html.fromHtml(getString(R.string.PCP2));
    	CharSequence PCP3 = Html.fromHtml(getString(R.string.PCP3));
    	CharSequence PCP4 = Html.fromHtml(getString(R.string.PCP4));
    	CharSequence PCP5 = Html.fromHtml(getString(R.string.PCP5));
    	CharSequence PCP6 = Html.fromHtml(getString(R.string.PCP6));
    	
    	// Competition Phase
    	CharSequence CP1 = Html.fromHtml(getString(R.string.CP1));
    	CharSequence CP2 = Html.fromHtml(getString(R.string.CP2));
    	CharSequence CP3 = Html.fromHtml(getString(R.string.CP3));
    	CharSequence CP4 = Html.fromHtml(getString(R.string.CP4));
    	CharSequence CP5 = Html.fromHtml(getString(R.string.CP5));
    	CharSequence CP6 = Html.fromHtml(getString(R.string.CP6));
    	CharSequence CP7 = Html.fromHtml(getString(R.string.CP7));
    	CharSequence CP8 = Html.fromHtml(getString(R.string.CP8));
    	CharSequence CP9 = Html.fromHtml(getString(R.string.CP9));
    	
    	// Peak Taper Phase
    	CharSequence PTP1 = Html.fromHtml(getString(R.string.PTP1));
    	CharSequence PTP2 = Html.fromHtml(getString(R.string.PTP2));
    	CharSequence PTP3 = Html.fromHtml(getString(R.string.PTP3));
    	
    	// Club Crews
    	CharSequence CCWC1 = Html.fromHtml(getString(R.string.CCWC1));
    	CharSequence CCWC2 = Html.fromHtml(getString(R.string.CCWC2));
    	CharSequence CCWC3 = Html.fromHtml(getString(R.string.CCWC3));
    	
   	 
        private CharSequence[] groups = getResources().getTextArray(R.array.ImpDates);
        
        private CharSequence[][] children = {
        	{ GPP },
            { SSP1, SSP2, SSP3, SSP4, SSP5 },
            { PCP1, PCP2, PCP3, PCP4, PCP5, PCP6 },
            { CP1, CP2, CP3, CP4, CP5, CP6, CP7, CP8, CP9},
            { PTP1, PTP2, PTP3,},
            { CCWC1, CCWC2, CCWC3 },
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
            textView.setTypeface(Typeface.DEFAULT_BOLD);
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
    
    /************ IF DEVICE VERSION IS LESS THAN JELLYBEAN, USE THIS ADAPTER *******************/
    private class AlternateAdapter extends BaseExpandableListAdapter {
    	
    	// General Prep. Phase (First Array)
    	CharSequence GPP = Html.fromHtml(getString(R.string.GPP));
    	
    	// Sport Specific Phase
    	CharSequence SSP1 = Html.fromHtml(getString(R.string.SSP1));
    	CharSequence SSP2 = Html.fromHtml(getString(R.string.SSP2));
    	CharSequence SSP3 = Html.fromHtml(getString(R.string.SSP3));
    	CharSequence SSP4 = Html.fromHtml(getString(R.string.SSP4));
    	CharSequence SSP5 = Html.fromHtml(getString(R.string.SSP5));
    	
    	// Pre Competition Phase
    	CharSequence PCP1 = Html.fromHtml(getString(R.string.PCP1));
    	CharSequence PCP2 = Html.fromHtml(getString(R.string.PCP2));
    	CharSequence PCP3 = Html.fromHtml(getString(R.string.PCP3));
    	CharSequence PCP4 = Html.fromHtml(getString(R.string.PCP4));
    	CharSequence PCP5 = Html.fromHtml(getString(R.string.PCP5));
    	CharSequence PCP6 = Html.fromHtml(getString(R.string.PCP6));
    	
    	// Competition Phase
    	CharSequence CP1 = Html.fromHtml(getString(R.string.CP1));
    	CharSequence CP2 = Html.fromHtml(getString(R.string.CP2));
    	CharSequence CP3 = Html.fromHtml(getString(R.string.CP3));
    	CharSequence CP4 = Html.fromHtml(getString(R.string.CP4));
    	CharSequence CP5 = Html.fromHtml(getString(R.string.CP5));
    	CharSequence CP6 = Html.fromHtml(getString(R.string.CP6));
    	CharSequence CP7 = Html.fromHtml(getString(R.string.CP7));
    	CharSequence CP8 = Html.fromHtml(getString(R.string.CP8));
    	CharSequence CP9 = Html.fromHtml(getString(R.string.CP9));
    	
    	// Peak Taper Phase
    	CharSequence PTP1 = Html.fromHtml(getString(R.string.PTP1));
    	CharSequence PTP2 = Html.fromHtml(getString(R.string.PTP2));
    	CharSequence PTP3 = Html.fromHtml(getString(R.string.PTP3));
    	
    	
    	// Club Crews
    	CharSequence CCWC1 = Html.fromHtml(getString(R.string.CCWC1));
    	CharSequence CCWC2 = Html.fromHtml(getString(R.string.CCWC2));
    	CharSequence CCWC3 = Html.fromHtml(getString(R.string.CCWC3));
    	
   	 
        private CharSequence[] groups = getResources().getTextArray(R.array.ImpDates);
        
        private CharSequence[][] children = {
        	{ GPP },
            { SSP1, SSP2, SSP3, SSP4, SSP5 },
            { PCP1, PCP2, PCP3, PCP4, PCP5, PCP6 },
            { CP1, CP2, CP3, CP4, CP5, CP6, CP7, CP8, CP9},
            { PTP1, PTP2, PTP3,},
            { CCWC1, CCWC2, CCWC3 },
        };
        
        @Override
        public int getGroupCount() {
            return groups.length;
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
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        	LinearLayout child = (LinearLayout)getActivity().getLayoutInflater().inflate(R.layout.child_row, null);
            ((TextView)child.findViewById(R.id.textViewChild)).setText(getChild(i, i1));
            return child;
        }
 
        @Override
        public boolean isChildSelectable(int i, int i1) {
            return false;
        }
    	
    }
 
}
