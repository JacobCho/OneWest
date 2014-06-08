package com.racepace.onewest.workouts;

import android.content.res.Resources;
import android.graphics.Color;
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

 
public class GymWorkoutsFragment extends Fragment {
	
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		

	}

	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.gym_fragment, container, false);
        
        final AnimatedExpandableListView elv = (AnimatedExpandableListView) rootView.findViewById(R.id.list);
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
        	
        	
        	altelv.setAdapter(new AlternateAdapter());
        
        
        }
        
        return rootView;
        
      
        
        
    }
    
    
    /************ IF DEVICE VERSION IS HIGHER THAN JELLYBEAN, USE THIS ADAPTER *******************/
    private class AnimatedAdapter extends AnimatedExpandableListAdapter {
    	
    	Resources res = getResources();
    	// Jun 2 to 15
    	CharSequence juntojunday1 = Html.fromHtml(getString(R.string.juntojunday1));
    	CharSequence juntojunday1a = Html.fromHtml(getString(R.string.juntojunday1a));
    	CharSequence juntojunday1b = Html.fromHtml(getString(R.string.juntojunday1b));
    	CharSequence juntojunday1c = Html.fromHtml(getString(R.string.juntojunday1c));
    	CharSequence juntojunday2 = Html.fromHtml(getString(R.string.juntojunday2));
    	CharSequence juntojunday2a = Html.fromHtml(getString(R.string.juntojunday2a));
    	CharSequence juntojunday2b = Html.fromHtml(getString(R.string.juntojunday2b));
    	CharSequence juntojunday2c = Html.fromHtml(getString(R.string.juntojunday2c));
    	CharSequence juntojuncore = Html.fromHtml(getString(R.string.juntojuncore));
    	
    	// May 12 to 31
    	CharSequence maytomayday1 = Html.fromHtml(getString(R.string.maytomayday1));
    	CharSequence maytomayday1a = Html.fromHtml(getString(R.string.maytomayday1a));
    	CharSequence maytomayday1b = Html.fromHtml(getString(R.string.maytomayday1b));
    	CharSequence maytomayday1c = Html.fromHtml(getString(R.string.maytomayday1c));
    	CharSequence maytomayday2 = Html.fromHtml(getString(R.string.maytomayday2));
    	CharSequence maytomayday2a = Html.fromHtml(getString(R.string.maytomayday2a));
    	CharSequence maytomayday2b = Html.fromHtml(getString(R.string.maytomayday2b));
    	CharSequence maytomayday2c = Html.fromHtml(getString(R.string.maytomayday2c));
    	
    	// Apr 21 to 27
    	CharSequence raceataday1 = Html.fromHtml(getString(R.string.raceataday1));
    	CharSequence raceataday1a = Html.fromHtml(getString(R.string.raceataday1a));
    	CharSequence raceataday1b = Html.fromHtml(getString(R.string.raceataday1b));
    	CharSequence raceataday1c = Html.fromHtml(getString(R.string.raceataday1c));
    	CharSequence raceataday2 = Html.fromHtml(getString(R.string.raceataday2));
    	CharSequence raceataday2a = Html.fromHtml(getString(R.string.raceataday2a));
    	CharSequence raceataday2b = Html.fromHtml(getString(R.string.raceataday2b));
    	
    	// Apr 14 to May 2
    	CharSequence ataday1 = Html.fromHtml(getString(R.string.ataday1));
    	CharSequence ataday1a = Html.fromHtml(getString(R.string.emtmday1a));
    	CharSequence ataday1b = Html.fromHtml(getString(R.string.ataday1b));
    	CharSequence ataday1c = Html.fromHtml(getString(R.string.ataday1c));
    	CharSequence ataday2 = Html.fromHtml(getString(R.string.ataday2));
    	CharSequence ataday2a = Html.fromHtml(getString(R.string.ataday2a));
    	CharSequence ataday2b = Html.fromHtml(getString(R.string.ataday2b));
    	CharSequence ataday2c = Html.fromHtml(getString(R.string.ataday2c));
    	CharSequence atacirc1 = Html.fromHtml(getString(R.string.emtmcirc1));
    	CharSequence atacirc2 = Html.fromHtml(getString(R.string.emtmcirc2));
    	CharSequence atacirc3 = Html.fromHtml(getString(R.string.emtmcirc3));
    	
    	// Mar 24 to 30
    	CharSequence emtmday1 = Html.fromHtml(getString(R.string.emtmday1));
    	CharSequence emtmday1a = Html.fromHtml(getString(R.string.emtmday1a));
    	CharSequence emtmday1b = Html.fromHtml(getString(R.string.emtmday1b));
    	CharSequence emtmday1c = Html.fromHtml(getString(R.string.emtmday1c));
    	CharSequence emtmday2 = Html.fromHtml(getString(R.string.emtmday2));
    	CharSequence emtmday2a = Html.fromHtml(getString(R.string.emtmday2a));
    	CharSequence emtmday2b = Html.fromHtml(getString(R.string.emtmday2b));
    	CharSequence emtmday2c = Html.fromHtml(getString(R.string.emtmday2c));
    	CharSequence emtmcirc1 = Html.fromHtml(getString(R.string.emtmcirc1));
    	CharSequence emtmcirc2 = Html.fromHtml(getString(R.string.emtmcirc2));
    	CharSequence emtmcirc3 = Html.fromHtml(getString(R.string.emtmcirc3));
    	
    	// Mar 18 to 23
    	CharSequence mtmday1 = Html.fromHtml(getString(R.string.mtmday1));
    	CharSequence mtmday1a = Html.fromHtml(getString(R.string.mtmday1a));
    	CharSequence mtmday1b = Html.fromHtml(getString(R.string.mtmday1b));
    	CharSequence mtmday2 = Html.fromHtml(getString(R.string.mtmday2));
    	CharSequence mtmday2a = Html.fromHtml(getString(R.string.mtmday2a));
    	CharSequence mtmday2b = Html.fromHtml(getString(R.string.mtmday2b));
    	
    	// Feb 23 to Mar 17
    	CharSequence ftmday1 = Html.fromHtml(getString(R.string.ftmday1));
    	CharSequence ftmday1a = Html.fromHtml(getString(R.string.ftmday1a));
    	CharSequence ftmday1b = Html.fromHtml(getString(R.string.ftmday1b));
    	CharSequence ftmday1c = Html.fromHtml(getString(R.string.ftmday1c));
    	CharSequence ftmday2 = Html.fromHtml(getString(R.string.ftmday2));
    	CharSequence ftmday2a = Html.fromHtml(getString(R.string.ftmday2a));
    	CharSequence ftmday2b = Html.fromHtml(getString(R.string.ftmday2b));
    	CharSequence ftmday2c = Html.fromHtml(getString(R.string.ftmday2c));
    	CharSequence ftmday3 = Html.fromHtml(getString(R.string.ftmday3));
    	CharSequence ftmday3a = Html.fromHtml(getString(R.string.ftmday3a));
    	CharSequence ftmday3b = Html.fromHtml(getString(R.string.ftmday3b));
    	CharSequence ftmday3c = Html.fromHtml(getString(R.string.ftmday3c));
    	
    	// Feb 10 to 22
    	CharSequence ftfday1 = Html.fromHtml(getString(R.string.ftfday1));
    	CharSequence ftfday1a = Html.fromHtml(getString(R.string.ftfday1a));
    	CharSequence ftfday1b = Html.fromHtml(getString(R.string.ftfday1b));
    	CharSequence ftfday1c = Html.fromHtml(getString(R.string.ftfday1c));
    	CharSequence ftfday2 = Html.fromHtml(getString(R.string.ftfday2));
    	CharSequence ftfday2a = Html.fromHtml(getString(R.string.ftfday2a));
    	CharSequence ftfday2b = Html.fromHtml(getString(R.string.ftfday2b));
    	CharSequence ftfday2c = Html.fromHtml(getString(R.string.ftfday2c));
    	
    	// Jan 20 to Feb 9
    	CharSequence jtfday1 = Html.fromHtml(getString(R.string.jtfday1));
    	CharSequence jtfday1a = Html.fromHtml(getString(R.string.jtfday1a));
    	CharSequence jtfday1b = Html.fromHtml(getString(R.string.jtfday1b));
    	CharSequence jtfday1c = Html.fromHtml(getString(R.string.jtfday1c));
    	CharSequence jtfday1d = Html.fromHtml(getString(R.string.jtfday1d));
    	CharSequence jtfday2 = Html.fromHtml(getString(R.string.jtfday2));
    	CharSequence jtfday2a = Html.fromHtml(getString(R.string.jtfday2a));
    	CharSequence jtfday2b = Html.fromHtml(getString(R.string.jtfday2b));
    	CharSequence jtfday2c = Html.fromHtml(getString(R.string.jtfday2c));
    	CharSequence jtfday2d = Html.fromHtml(getString(R.string.jtfday2d));
    	CharSequence jtfday3 = Html.fromHtml(getString(R.string.jtfday3));
    	CharSequence jtfday3a = Html.fromHtml(getString(R.string.jtfday3a));
    	CharSequence jtfday3b = Html.fromHtml(getString(R.string.jtfday3b));
    	CharSequence jtfday3c = Html.fromHtml(getString(R.string.jtfday3c));
    	
    	//Jan 12 to 19
    	CharSequence jtjday1 = Html.fromHtml(getString(R.string.jtjday1));
    	CharSequence jtjday1a = Html.fromHtml(getString(R.string.jtjday1a));
    	CharSequence jtjday1b = Html.fromHtml(getString(R.string.jtjday1b));
    	CharSequence jtjday1c = Html.fromHtml(getString(R.string.jtjday1c));
    	CharSequence jtjday1d = Html.fromHtml(getString(R.string.jtjday1d));
    	CharSequence jtjday2 = Html.fromHtml(getString(R.string.jtjday2));
    	CharSequence jtjday2a = Html.fromHtml(getString(R.string.jtjday2a));
    	CharSequence jtjday2b = Html.fromHtml(getString(R.string.jtjday2b));
    	CharSequence jtjday2c = Html.fromHtml(getString(R.string.jtjday2c));
    	
    	//Dec 16 to Jan 6
    	CharSequence dtjday1 = Html.fromHtml(getString(R.string.dtjday1));
    	CharSequence dtjday1a = Html.fromHtml(getString(R.string.dtjday1a));
    	CharSequence dtjday1b = Html.fromHtml(getString(R.string.dtjday1b));
    	CharSequence dtjday1c = Html.fromHtml(getString(R.string.dtjday1c));
    	CharSequence dtjday2 = Html.fromHtml(getString(R.string.dtjday2));
    	CharSequence dtjday2a = Html.fromHtml(getString(R.string.dtjday2a));
    	CharSequence dtjday2b = Html.fromHtml(getString(R.string.dtjday2b));
    	CharSequence dtjday2c = Html.fromHtml(getString(R.string.dtjday2c));
    	CharSequence dtjday3 = Html.fromHtml(getString(R.string.dtjday3));
    	CharSequence dtjday3a = Html.fromHtml(getString(R.string.dtjday3a));
    	CharSequence dtjday3b = Html.fromHtml(getString(R.string.dtjday3b));
    	CharSequence dtjday3c = Html.fromHtml(getString(R.string.dtjday3c));
    	
    	//Nov 26 to Dec 9
    	CharSequence ntdday1 = Html.fromHtml(getString(R.string.ntdday1));
    	CharSequence ntdday1a = Html.fromHtml(getString(R.string.ntdday1a));
    	CharSequence ntdday1b = Html.fromHtml(getString(R.string.ntdday1b));
    	CharSequence ntdday1c = Html.fromHtml(getString(R.string.ntdday1c));
    	CharSequence ntdday2 = Html.fromHtml(getString(R.string.ntdday2));
    	CharSequence ntdday2a = Html.fromHtml(getString(R.string.ntdday2a));
    	CharSequence ntdday2b = Html.fromHtml(getString(R.string.ntdday2b));
    	CharSequence ntdday2c = Html.fromHtml(getString(R.string.ntdday2c));
    	CharSequence ntdday3 = Html.fromHtml(getString(R.string.ntdday3));
    	CharSequence ntdday3a = Html.fromHtml(getString(R.string.ntdday3a));
    	CharSequence ntdday3b = Html.fromHtml(getString(R.string.ntdday3b));
    	CharSequence ntdday3c = Html.fromHtml(getString(R.string.ntdday3c));
    	CharSequence ntdday3d = Html.fromHtml(getString(R.string.ntdday3d));
    	CharSequence ntdday3e = Html.fromHtml(getString(R.string.ntdday3e));
    	
    	//Nov 4 to 25
    	CharSequence ntnday1 = Html.fromHtml(getString(R.string.ntnday1));
    	CharSequence ntnday1a = Html.fromHtml(getString(R.string.ntnday1a));
    	CharSequence ntnday1b = Html.fromHtml(getString(R.string.ntnday1b));
    	CharSequence ntnday2 = Html.fromHtml(getString(R.string.ntnday2));
    	CharSequence ntnday2a = Html.fromHtml(getString(R.string.ntnday2a));
    	CharSequence ntnday2b = Html.fromHtml(getString(R.string.ntnday2b));
    	CharSequence ntnday3 = Html.fromHtml(getString(R.string.ntnday3));
    	CharSequence ntnday3a = Html.fromHtml(getString(R.string.ntnday3a));
    	CharSequence ntnday3b = Html.fromHtml(getString(R.string.ntnday3b));
    	CharSequence ntnday3c = Html.fromHtml(getString(R.string.ntnday3c));
    	CharSequence ntnday3d = Html.fromHtml(getString(R.string.ntnday3d));
    	CharSequence ntnday3e = Html.fromHtml(getString(R.string.ntnday3e));
    	CharSequence ntnday3f = Html.fromHtml(getString(R.string.ntnday3f));

    	// Sets
    	CharSequence []juntojunsets = res.getTextArray(R.array.juntojunsets);
    	CharSequence []maytomaysets = res.getTextArray(R.array.maytomaysets);
    	CharSequence []raceatasets = res.getTextArray(R.array.raceatasets);
    	CharSequence []atasets = res.getTextArray(R.array.atasets);
    	CharSequence []mtasets = res.getTextArray(R.array.mtasets);
    	CharSequence []emtmsets = res.getTextArray(R.array.emtmsets);
    	CharSequence []mtmsets = res.getTextArray(R.array.mtmsets);
    	CharSequence []ftmsets = res.getTextArray(R.array.ftmsets);
    	CharSequence []ftfsets = res.getTextArray(R.array.ftfsets);
    	CharSequence []jtfsets1 = res.getTextArray(R.array.jtfsets1);
    	CharSequence []jtjsets = res.getTextArray(R.array.jtjsets);
    	CharSequence []dtjsets = res.getTextArray(R.array.dtjsets);
    	CharSequence []ntdsets = res.getTextArray(R.array.ntdsets);
    	CharSequence []ntnsets = res.getTextArray(R.array.ntnsets);
    	
    	private CharSequence[] groups = res.getTextArray(R.array.GymDates);
    	 
        private CharSequence[][] children = {
        	// Jun 2 to 15
        	{ juntojunday1, juntojunday1a, juntojunday1b, juntojunday1c, juntojunday2, juntojunday2a, juntojunday2b, juntojunday2c, juntojuncore},	
        	// May 12 to 31	
        	{ maytomayday1, maytomayday1a, maytomayday1b, maytomayday1c, maytomayday2, maytomayday2a, maytomayday2b, maytomayday2c},	
        	// Apr 14 to May 11
            { ataday1, ataday1a, ataday1b, ataday1c, ataday2, ataday2a, ataday2b, ataday2c, atacirc1, atacirc2, atacirc3     },
        	// Apr 21 to 27	
        	{ raceataday1, raceataday1a, raceataday1b, raceataday1c, raceataday2, raceataday2a, raceataday2b},
        	// Mar 31 to Apr 13
        	{ emtmday1, emtmday1a, emtmday1b, emtmday1c, emtmday2, emtmday2a, emtmday2b, emtmday2c, emtmcirc1, emtmcirc2, emtmcirc3 },	
        	// Mar 24 to 30
        	{ emtmday1, emtmday1a, emtmday1b, emtmday1c, emtmday2, emtmday2a, emtmday2b, emtmday2c, emtmcirc1, emtmcirc2, emtmcirc3 },	
        	// Mar 18 to 23
        	{ mtmday1, mtmday1a, mtmday1b, mtmday2, mtmday2a, mtmday2b },
        	// Feb 23 to Mar 17
        	{ ftmday1,ftmday1a,ftmday1b,ftmday1c,ftmday2,ftmday2a,ftmday2b,ftmday2c,ftmday3,ftmday3a,ftmday3b,ftmday3c,
        		},
        	// Feb 10 to 22
        	{ ftfday1,ftfday1a,ftfday1b,ftfday1c,ftfday2,ftfday2a,ftfday2b,ftfday2c	
        	},
        	// Jan 20 to Feb 9
        	{ jtfday1,jtfday1a,jtfday1b,jtfday1c,jtfday1d,jtfday2,jtfday2a,jtfday2b,jtfday2c,jtfday2d,jtfday3,jtfday3a,jtfday3b,jtfday3c
        	  },
        	// Jan 12 to Jan 19
        	{jtjday1,jtjday1a,jtjday1b,jtjday1c,jtjday1d,jtjday2,jtjday2a,jtjday2b,jtjday2c
        	 },
        	// Dec 16 to Jan 6
        	{ dtjday1,dtjday1a,dtjday1b,dtjday1c,dtjday2,dtjday2a,dtjday2b,dtjday2c,dtjday3,dtjday3a,dtjday3b,dtjday3c
        	},
        	// Nov 26 to Dec 9
        	{ ntdday1,ntdday1a,ntdday1b,ntdday1c,ntdday2,ntdday2a,ntdday2b,ntdday2c,ntdday3,ntdday3a,ntdday3b,ntdday3c,ntdday3d,ntdday3e },
        	
        	// Nov 4 to 25
            { ntnday1,ntnday1a,ntnday1b,ntnday2,ntnday2a,ntnday2b,ntnday3,ntnday3a,ntnday3b,ntnday3c,ntnday3d,ntnday3e,ntnday3f },
          
        };
        
        private CharSequence[][] sets = {
        		// Jun 2 to 15
        		{juntojunsets[0],juntojunsets[1],juntojunsets[2],juntojunsets[3],juntojunsets[4],juntojunsets[5],juntojunsets[6],juntojunsets[7],juntojunsets[8]},
        		
        		// May 12 to 31
        		{maytomaysets[0],maytomaysets[1],maytomaysets[2],maytomaysets[3],maytomaysets[4],maytomaysets[5],maytomaysets[6],maytomaysets[7]},
        		
        		// Apr 14
        		{atasets[0],atasets[1],atasets[2],atasets[3],atasets[4],atasets[5],atasets[6],atasets[7],atasets[8],atasets[9],atasets[10] },
        		
        		// Apr 21 to 27	
        		{raceatasets[0],raceatasets[1],raceatasets[2],raceatasets[3],raceatasets[4],raceatasets[5],raceatasets[6]},
        		
        		// Mar 31 to Apr 13
        		{mtasets[0],mtasets[1],mtasets[2],mtasets[3],mtasets[4],mtasets[5],mtasets[6],mtasets[7],mtasets[8],mtasets[9],mtasets[10] },
        		
        		// Mar 24 to 30
        		{emtmsets[0],emtmsets[1],emtmsets[2],emtmsets[3],emtmsets[4],emtmsets[5],emtmsets[6],emtmsets[7],emtmsets[8],emtmsets[9],emtmsets[10] },
        		
        		// Mar 18 to 23
        		{mtmsets[0],mtmsets[1],mtmsets[2],mtmsets[3],mtmsets[4],mtmsets[5] },
        		
        		// Feb 23 to Mar 17
        		{ftmsets[0],ftmsets[1],ftmsets[2],ftmsets[3],ftmsets[4],ftmsets[5],ftmsets[6],ftmsets[7],ftmsets[8],ftmsets[9],ftmsets[10],ftmsets[11]}, 
        		
        		// Feb 10 to 22
        		{ftfsets[0],ftfsets[1],ftfsets[2],ftfsets[3],ftfsets[4],ftfsets[5],ftfsets[6],ftfsets[7]},
        		
        		// Jan 20 to Feb 9
        		{jtfsets1[0],jtfsets1[1],jtfsets1[2],jtfsets1[3],jtfsets1[4],jtfsets1[5],jtfsets1[6],jtfsets1[7],jtfsets1[8],jtfsets1[9],jtfsets1[10],jtfsets1[11],jtfsets1[12],jtfsets1[13],jtfsets1[14]},
        		 
        		 // Jan 12 to 19
        		{jtjsets[0],jtjsets[1],jtjsets[2],jtjsets[3],jtjsets[4],jtjsets[5],jtjsets[6],jtjsets[7],jtjsets[8]},
        		 
        		 // Dec 16 to Jan 6
        		{dtjsets[0],dtjsets[1],dtjsets[2],dtjsets[3],dtjsets[4],dtjsets[5],dtjsets[6],dtjsets[7],dtjsets[8],dtjsets[9],dtjsets[10],dtjsets[11]},
        		 
        		 // Nov 26 to Dec 9
        		{ntdsets[0],ntdsets[1],ntdsets[2],ntdsets[3],ntdsets[4],ntdsets[5],ntdsets[6],ntdsets[7],ntdsets[8],ntdsets[9],ntdsets[10],ntdsets[11],ntdsets[12],ntdsets[13]},
        		
        		// Nov 4 to 25
        		{ntnsets[0],ntnsets[1],ntnsets[2],ntnsets[3],ntnsets[4],ntnsets[5],ntnsets[6],ntnsets[7],ntnsets[8],ntnsets[9],ntnsets[10],ntnsets[11],ntnsets[12]},

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
            
            ((TextView)child.findViewById(R.id.textViewSets)).setText(sets[i][i1]);
            return child;
        }
 
        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }
        
    }
        
        
        /************ IF DEVICE VERSION IS LESS THAN JELLYBEAN, USE THIS ADAPTER *******************/
        private class AlternateAdapter extends BaseExpandableListAdapter {
        	
        	Resources res = getResources();
        	// Jun 2 to 15
        	CharSequence juntojunday1 = Html.fromHtml(getString(R.string.juntojunday1));
        	CharSequence juntojunday1a = Html.fromHtml(getString(R.string.juntojunday1a));
        	CharSequence juntojunday1b = Html.fromHtml(getString(R.string.juntojunday1b));
        	CharSequence juntojunday1c = Html.fromHtml(getString(R.string.juntojunday1c));
        	CharSequence juntojunday2 = Html.fromHtml(getString(R.string.juntojunday2));
        	CharSequence juntojunday2a = Html.fromHtml(getString(R.string.juntojunday2a));
        	CharSequence juntojunday2b = Html.fromHtml(getString(R.string.juntojunday2b));
        	CharSequence juntojunday2c = Html.fromHtml(getString(R.string.juntojunday2c));
        	CharSequence juntojuncore = Html.fromHtml(getString(R.string.juntojuncore));
        	
        	// May 12 to 31
        	CharSequence maytomayday1 = Html.fromHtml(getString(R.string.maytomayday1));
        	CharSequence maytomayday1a = Html.fromHtml(getString(R.string.maytomayday1a));
        	CharSequence maytomayday1b = Html.fromHtml(getString(R.string.maytomayday1b));
        	CharSequence maytomayday1c = Html.fromHtml(getString(R.string.maytomayday1c));
        	CharSequence maytomayday2 = Html.fromHtml(getString(R.string.maytomayday2));
        	CharSequence maytomayday2a = Html.fromHtml(getString(R.string.maytomayday2a));
        	CharSequence maytomayday2b = Html.fromHtml(getString(R.string.maytomayday2b));
        	CharSequence maytomayday2c = Html.fromHtml(getString(R.string.maytomayday2c));
        	
        	// Apr 21 to 27
        	CharSequence raceataday1 = Html.fromHtml(getString(R.string.raceataday1));
        	CharSequence raceataday1a = Html.fromHtml(getString(R.string.raceataday1a));
        	CharSequence raceataday1b = Html.fromHtml(getString(R.string.raceataday1b));
        	CharSequence raceataday1c = Html.fromHtml(getString(R.string.raceataday1c));
        	CharSequence raceataday2 = Html.fromHtml(getString(R.string.raceataday2));
        	CharSequence raceataday2a = Html.fromHtml(getString(R.string.raceataday2a));
        	CharSequence raceataday2b = Html.fromHtml(getString(R.string.raceataday2b));
        	
        	// Apr 14 to May 2
        	CharSequence ataday1 = Html.fromHtml(getString(R.string.ataday1));
        	CharSequence ataday1a = Html.fromHtml(getString(R.string.emtmday1a));
        	CharSequence ataday1b = Html.fromHtml(getString(R.string.ataday1b));
        	CharSequence ataday1c = Html.fromHtml(getString(R.string.ataday1c));
        	CharSequence ataday2 = Html.fromHtml(getString(R.string.ataday2));
        	CharSequence ataday2a = Html.fromHtml(getString(R.string.ataday2a));
        	CharSequence ataday2b = Html.fromHtml(getString(R.string.ataday2b));
        	CharSequence ataday2c = Html.fromHtml(getString(R.string.ataday2c));
        	CharSequence atacirc1 = Html.fromHtml(getString(R.string.emtmcirc1));
        	CharSequence atacirc2 = Html.fromHtml(getString(R.string.emtmcirc2));
        	CharSequence atacirc3 = Html.fromHtml(getString(R.string.emtmcirc3));
        	
        	// Mar 24 to 30
        	CharSequence emtmday1 = Html.fromHtml(getString(R.string.emtmday1));
        	CharSequence emtmday1a = Html.fromHtml(getString(R.string.emtmday1a));
        	CharSequence emtmday1b = Html.fromHtml(getString(R.string.emtmday1b));
        	CharSequence emtmday1c = Html.fromHtml(getString(R.string.emtmday1c));
        	CharSequence emtmday2 = Html.fromHtml(getString(R.string.emtmday2));
        	CharSequence emtmday2a = Html.fromHtml(getString(R.string.emtmday2a));
        	CharSequence emtmday2b = Html.fromHtml(getString(R.string.emtmday2b));
        	CharSequence emtmday2c = Html.fromHtml(getString(R.string.emtmday2c));
        	CharSequence emtmcirc1 = Html.fromHtml(getString(R.string.emtmcirc1));
        	CharSequence emtmcirc2 = Html.fromHtml(getString(R.string.emtmcirc2));
        	CharSequence emtmcirc3 = Html.fromHtml(getString(R.string.emtmcirc3));
        	
        	// Mar 18 to 23
        	CharSequence mtmday1 = Html.fromHtml(getString(R.string.mtmday1));
        	CharSequence mtmday1a = Html.fromHtml(getString(R.string.mtmday1a));
        	CharSequence mtmday1b = Html.fromHtml(getString(R.string.mtmday1b));
        	CharSequence mtmday2 = Html.fromHtml(getString(R.string.mtmday2));
        	CharSequence mtmday2a = Html.fromHtml(getString(R.string.mtmday2a));
        	CharSequence mtmday2b = Html.fromHtml(getString(R.string.mtmday2b));
        	
        	// Feb 23 to Mar 17
        	CharSequence ftmday1 = Html.fromHtml(getString(R.string.ftmday1));
        	CharSequence ftmday1a = Html.fromHtml(getString(R.string.ftmday1a));
        	CharSequence ftmday1b = Html.fromHtml(getString(R.string.ftmday1b));
        	CharSequence ftmday1c = Html.fromHtml(getString(R.string.ftmday1c));
        	CharSequence ftmday2 = Html.fromHtml(getString(R.string.ftmday2));
        	CharSequence ftmday2a = Html.fromHtml(getString(R.string.ftmday2a));
        	CharSequence ftmday2b = Html.fromHtml(getString(R.string.ftmday2b));
        	CharSequence ftmday2c = Html.fromHtml(getString(R.string.ftmday2c));
        	CharSequence ftmday3 = Html.fromHtml(getString(R.string.ftmday3));
        	CharSequence ftmday3a = Html.fromHtml(getString(R.string.ftmday3a));
        	CharSequence ftmday3b = Html.fromHtml(getString(R.string.ftmday3b));
        	CharSequence ftmday3c = Html.fromHtml(getString(R.string.ftmday3c));
        	
        	// Feb 10 to 22
        	CharSequence ftfday1 = Html.fromHtml(getString(R.string.ftfday1));
        	CharSequence ftfday1a = Html.fromHtml(getString(R.string.ftfday1a));
        	CharSequence ftfday1b = Html.fromHtml(getString(R.string.ftfday1b));
        	CharSequence ftfday1c = Html.fromHtml(getString(R.string.ftfday1c));
        	CharSequence ftfday2 = Html.fromHtml(getString(R.string.ftfday2));
        	CharSequence ftfday2a = Html.fromHtml(getString(R.string.ftfday2a));
        	CharSequence ftfday2b = Html.fromHtml(getString(R.string.ftfday2b));
        	CharSequence ftfday2c = Html.fromHtml(getString(R.string.ftfday2c));
        	
        	// Jan 20 to Feb 9
        	CharSequence jtfday1 = Html.fromHtml(getString(R.string.jtfday1));
        	CharSequence jtfday1a = Html.fromHtml(getString(R.string.jtfday1a));
        	CharSequence jtfday1b = Html.fromHtml(getString(R.string.jtfday1b));
        	CharSequence jtfday1c = Html.fromHtml(getString(R.string.jtfday1c));
        	CharSequence jtfday1d = Html.fromHtml(getString(R.string.jtfday1d));
        	CharSequence jtfday2 = Html.fromHtml(getString(R.string.jtfday2));
        	CharSequence jtfday2a = Html.fromHtml(getString(R.string.jtfday2a));
        	CharSequence jtfday2b = Html.fromHtml(getString(R.string.jtfday2b));
        	CharSequence jtfday2c = Html.fromHtml(getString(R.string.jtfday2c));
        	CharSequence jtfday2d = Html.fromHtml(getString(R.string.jtfday2d));
        	CharSequence jtfday3 = Html.fromHtml(getString(R.string.jtfday3));
        	CharSequence jtfday3a = Html.fromHtml(getString(R.string.jtfday3a));
        	CharSequence jtfday3b = Html.fromHtml(getString(R.string.jtfday3b));
        	CharSequence jtfday3c = Html.fromHtml(getString(R.string.jtfday3c));
        	
        	//Jan 12 to 19
        	CharSequence jtjday1 = Html.fromHtml(getString(R.string.jtjday1));
        	CharSequence jtjday1a = Html.fromHtml(getString(R.string.jtjday1a));
        	CharSequence jtjday1b = Html.fromHtml(getString(R.string.jtjday1b));
        	CharSequence jtjday1c = Html.fromHtml(getString(R.string.jtjday1c));
        	CharSequence jtjday1d = Html.fromHtml(getString(R.string.jtjday1d));
        	CharSequence jtjday2 = Html.fromHtml(getString(R.string.jtjday2));
        	CharSequence jtjday2a = Html.fromHtml(getString(R.string.jtjday2a));
        	CharSequence jtjday2b = Html.fromHtml(getString(R.string.jtjday2b));
        	CharSequence jtjday2c = Html.fromHtml(getString(R.string.jtjday2c));
        	
        	//Dec 16 to Jan 6
        	CharSequence dtjday1 = Html.fromHtml(getString(R.string.dtjday1));
        	CharSequence dtjday1a = Html.fromHtml(getString(R.string.dtjday1a));
        	CharSequence dtjday1b = Html.fromHtml(getString(R.string.dtjday1b));
        	CharSequence dtjday1c = Html.fromHtml(getString(R.string.dtjday1c));
        	CharSequence dtjday2 = Html.fromHtml(getString(R.string.dtjday2));
        	CharSequence dtjday2a = Html.fromHtml(getString(R.string.dtjday2a));
        	CharSequence dtjday2b = Html.fromHtml(getString(R.string.dtjday2b));
        	CharSequence dtjday2c = Html.fromHtml(getString(R.string.dtjday2c));
        	CharSequence dtjday3 = Html.fromHtml(getString(R.string.dtjday3));
        	CharSequence dtjday3a = Html.fromHtml(getString(R.string.dtjday3a));
        	CharSequence dtjday3b = Html.fromHtml(getString(R.string.dtjday3b));
        	CharSequence dtjday3c = Html.fromHtml(getString(R.string.dtjday3c));
        	
        	//Nov 26 to Dec 9
        	CharSequence ntdday1 = Html.fromHtml(getString(R.string.ntdday1));
        	CharSequence ntdday1a = Html.fromHtml(getString(R.string.ntdday1a));
        	CharSequence ntdday1b = Html.fromHtml(getString(R.string.ntdday1b));
        	CharSequence ntdday1c = Html.fromHtml(getString(R.string.ntdday1c));
        	CharSequence ntdday2 = Html.fromHtml(getString(R.string.ntdday2));
        	CharSequence ntdday2a = Html.fromHtml(getString(R.string.ntdday2a));
        	CharSequence ntdday2b = Html.fromHtml(getString(R.string.ntdday2b));
        	CharSequence ntdday2c = Html.fromHtml(getString(R.string.ntdday2c));
        	CharSequence ntdday3 = Html.fromHtml(getString(R.string.ntdday3));
        	CharSequence ntdday3a = Html.fromHtml(getString(R.string.ntdday3a));
        	CharSequence ntdday3b = Html.fromHtml(getString(R.string.ntdday3b));
        	CharSequence ntdday3c = Html.fromHtml(getString(R.string.ntdday3c));
        	CharSequence ntdday3d = Html.fromHtml(getString(R.string.ntdday3d));
        	CharSequence ntdday3e = Html.fromHtml(getString(R.string.ntdday3e));
        	
        	//Nov 4 to 25
        	CharSequence ntnday1 = Html.fromHtml(getString(R.string.ntnday1));
        	CharSequence ntnday1a = Html.fromHtml(getString(R.string.ntnday1a));
        	CharSequence ntnday1b = Html.fromHtml(getString(R.string.ntnday1b));
        	CharSequence ntnday2 = Html.fromHtml(getString(R.string.ntnday2));
        	CharSequence ntnday2a = Html.fromHtml(getString(R.string.ntnday2a));
        	CharSequence ntnday2b = Html.fromHtml(getString(R.string.ntnday2b));
        	CharSequence ntnday3 = Html.fromHtml(getString(R.string.ntnday3));
        	CharSequence ntnday3a = Html.fromHtml(getString(R.string.ntnday3a));
        	CharSequence ntnday3b = Html.fromHtml(getString(R.string.ntnday3b));
        	CharSequence ntnday3c = Html.fromHtml(getString(R.string.ntnday3c));
        	CharSequence ntnday3d = Html.fromHtml(getString(R.string.ntnday3d));
        	CharSequence ntnday3e = Html.fromHtml(getString(R.string.ntnday3e));
        	CharSequence ntnday3f = Html.fromHtml(getString(R.string.ntnday3f));

        	// Sets
        	CharSequence []juntojunsets = res.getTextArray(R.array.juntojunsets);
        	CharSequence []maytomaysets = res.getTextArray(R.array.maytomaysets);
        	CharSequence []raceatasets = res.getTextArray(R.array.raceatasets);
        	CharSequence []atasets = res.getTextArray(R.array.atasets);
        	CharSequence []mtasets = res.getTextArray(R.array.mtasets);
        	CharSequence []emtmsets = res.getTextArray(R.array.emtmsets);
        	CharSequence []mtmsets = res.getTextArray(R.array.mtmsets);
        	CharSequence []ftmsets = res.getTextArray(R.array.ftmsets);
        	CharSequence []ftfsets = res.getTextArray(R.array.ftfsets);
        	CharSequence []jtfsets1 = res.getTextArray(R.array.jtfsets1);
        	CharSequence []jtjsets = res.getTextArray(R.array.jtjsets);
        	CharSequence []dtjsets = res.getTextArray(R.array.dtjsets);
        	CharSequence []ntdsets = res.getTextArray(R.array.ntdsets);
        	CharSequence []ntnsets = res.getTextArray(R.array.ntnsets);
        	
        	private CharSequence[] groups = res.getTextArray(R.array.GymDates);
        	 
            private CharSequence[][] children = {
            	// Jun 2 to 15
                { juntojunday1, juntojunday1a, juntojunday1b, juntojunday1c, juntojunday2, juntojunday2a, juntojunday2b, juntojunday2c, juntojuncore},
            	// May 12 to 31
            	{ maytomayday1, maytomayday1a, maytomayday1b, maytomayday1c, maytomayday2, maytomayday2a, maytomayday2b, maytomayday2c},	
            	// Apr 14 to May 11
                { ataday1, ataday1a, ataday1b, ataday1c, ataday2, ataday2a, ataday2b, ataday2c, atacirc1, atacirc2, atacirc3     },
            	// Apr 21 to 27	
            	{ raceataday1, raceataday1a, raceataday1b, raceataday1c, raceataday2, raceataday2a, raceataday2b},
            	// Mar 31 to Apr 13
            	{ emtmday1, emtmday1a, emtmday1b, emtmday1c, emtmday2, emtmday2a, emtmday2b, emtmday2c, emtmcirc1, emtmcirc2, emtmcirc3 },	
            	// Mar 24 to 30
            	{ emtmday1, emtmday1a, emtmday1b, emtmday1c, emtmday2, emtmday2a, emtmday2b, emtmday2c, emtmcirc1, emtmcirc2, emtmcirc3 },	
            	// Mar 18 to 23
            	{ mtmday1, mtmday1a, mtmday1b, mtmday2, mtmday2a, mtmday2b },
            	// Feb 23 to Mar 17
            	{ ftmday1,ftmday1a,ftmday1b,ftmday1c,ftmday2,ftmday2a,ftmday2b,ftmday2c,ftmday3,ftmday3a,ftmday3b,ftmday3c,
            		},
            	// Feb 10 to 22
            	{ ftfday1,ftfday1a,ftfday1b,ftfday1c,ftfday2,ftfday2a,ftfday2b,ftfday2c	
            	},
            	// Jan 20 to Feb 9
            	{ jtfday1,jtfday1a,jtfday1b,jtfday1c,jtfday1d,jtfday2,jtfday2a,jtfday2b,jtfday2c,jtfday2d,jtfday3,jtfday3a,jtfday3b,jtfday3c
            	  },
            	// Jan 12 to Jan 19
            	{jtjday1,jtjday1a,jtjday1b,jtjday1c,jtjday1d,jtjday2,jtjday2a,jtjday2b,jtjday2c
            	 },
            	// Dec 16 to Jan 6
            	{ dtjday1,dtjday1a,dtjday1b,dtjday1c,dtjday2,dtjday2a,dtjday2b,dtjday2c,dtjday3,dtjday3a,dtjday3b,dtjday3c
            	},
            	// Nov 26 to Dec 9
            	{ ntdday1,ntdday1a,ntdday1b,ntdday1c,ntdday2,ntdday2a,ntdday2b,ntdday2c,ntdday3,ntdday3a,ntdday3b,ntdday3c,ntdday3d,ntdday3e },
            	
            	// Nov 4 to 25
                { ntnday1,ntnday1a,ntnday1b,ntnday2,ntnday2a,ntnday2b,ntnday3,ntnday3a,ntnday3b,ntnday3c,ntnday3d,ntnday3e,ntnday3f },
              
            };
            
            private CharSequence[][] sets = {
            		// Jun 2 to 15
            		{juntojunsets[0],juntojunsets[1],juntojunsets[2],juntojunsets[3],juntojunsets[4],juntojunsets[5],juntojunsets[6],juntojunsets[7],juntojunsets[8]},
            		
            		// May 12 to 31
            		{maytomaysets[0],maytomaysets[1],maytomaysets[2],maytomaysets[3],maytomaysets[4],maytomaysets[5],maytomaysets[6],maytomaysets[7]},
            		
            		// Apr 14
            		{atasets[0],atasets[1],atasets[2],atasets[3],atasets[4],atasets[5],atasets[6],atasets[7],atasets[8],atasets[9],atasets[10] },
            		
            		// Apr 21 to 27	
            		{raceatasets[0],raceatasets[1],raceatasets[2],raceatasets[3],raceatasets[4],raceatasets[5],raceatasets[6]},
            		
            		// Mar 31 to Apr 13
            		{mtasets[0],mtasets[1],mtasets[2],mtasets[3],mtasets[4],mtasets[5],mtasets[6],mtasets[7],mtasets[8],mtasets[9],mtasets[10] },
            		
            		// Mar 24 to 30
            		{emtmsets[0],emtmsets[1],emtmsets[2],emtmsets[3],emtmsets[4],emtmsets[5],emtmsets[6],emtmsets[7],emtmsets[8],emtmsets[9],emtmsets[10] },
            		
            		// Mar 18 to 23
            		{mtmsets[0],mtmsets[1],mtmsets[2],mtmsets[3],mtmsets[4],mtmsets[5] },
            		
            		// Feb 23 to Mar 17
            		{ftmsets[0],ftmsets[1],ftmsets[2],ftmsets[3],ftmsets[4],ftmsets[5],ftmsets[6],ftmsets[7],ftmsets[8],ftmsets[9],ftmsets[10],ftmsets[11]}, 
            		
            		// Feb 10 to 22
            		{ftfsets[0],ftfsets[1],ftfsets[2],ftfsets[3],ftfsets[4],ftfsets[5],ftfsets[6],ftfsets[7]},
            		
            		// Jan 20 to Feb 9
            		{jtfsets1[0],jtfsets1[1],jtfsets1[2],jtfsets1[3],jtfsets1[4],jtfsets1[5],jtfsets1[6],jtfsets1[7],jtfsets1[8],jtfsets1[9],jtfsets1[10],jtfsets1[11],jtfsets1[12],jtfsets1[13],jtfsets1[14]},
            		 
            		 // Jan 12 to 19
            		{jtjsets[0],jtjsets[1],jtjsets[2],jtjsets[3],jtjsets[4],jtjsets[5],jtjsets[6],jtjsets[7],jtjsets[8]},
            		 
            		 // Dec 16 to Jan 6
            		{dtjsets[0],dtjsets[1],dtjsets[2],dtjsets[3],dtjsets[4],dtjsets[5],dtjsets[6],dtjsets[7],dtjsets[8],dtjsets[9],dtjsets[10],dtjsets[11]},
            		 
            		 // Nov 26 to Dec 9
            		{ntdsets[0],ntdsets[1],ntdsets[2],ntdsets[3],ntdsets[4],ntdsets[5],ntdsets[6],ntdsets[7],ntdsets[8],ntdsets[9],ntdsets[10],ntdsets[11],ntdsets[12],ntdsets[13]},
            		
            		// Nov 4 to 25
            		{ntnsets[0],ntnsets[1],ntnsets[2],ntnsets[3],ntnsets[4],ntnsets[5],ntnsets[6],ntnsets[7],ntnsets[8],ntnsets[9],ntnsets[10],ntnsets[11],ntnsets[12]},

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
	            
	            ((TextView)child.findViewById(R.id.textViewSets)).setText(sets[i][i1]);
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