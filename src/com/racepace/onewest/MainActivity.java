package com.racepace.onewest;

import java.util.Random;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.racepace.onewest.information.InformationContainerFrag;
import com.racepace.onewest.ladders.LaddersContainer;
import com.racepace.onewest.workouts.WorkOutsContainerFrag;

public class MainActivity extends SlidingFragmentActivity {
	
	String fragposition;

	
	protected int getLayoutResId() {
		return R.layout.activity_masterdetail;
	}
	
	
	@TargetApi(11)
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(getLayoutResId());
		setBehindContentView(R.layout.menu);
		
		if (savedInstanceState != null) {
			savedInstanceState.getString("position");
			if (fragposition == "workouts") {
				getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.mainContentFrame, new WorkOutsContainerFrag())
				.commit();
			}
			else if (fragposition == "information") {
				getSupportFragmentManager().beginTransaction()
            	.replace(R.id.mainContentFrame, new InformationContainerFrag())
            	.commit();
			}
			else if (fragposition == "ladders") {
				getSupportFragmentManager().beginTransaction()
            	.replace(R.id.mainContentFrame, new LaddersContainer())
            	.commit();
			}
		}
		else {
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.mainContentFrame, new WorkOutsContainerFrag())
		.commit();
		}
		
		 ActionBar actionBar = getActionBar();
 
		 if(findViewById(R.id.tabletView) != null) {
			 setBehindContentView(R.layout.empty);
			 FrameLayout menuContainer = (FrameLayout) findViewById(R.id.menuContainer);
			 menuContainer.addView(getLayoutInflater().inflate(R.layout.menu, null));
			 
			 slidingmenuadapter();
	 
		 }
		 else {
			 slidingmenuadapter();

		       SlidingMenu menu = getSlidingMenu();
		       
		        menu.setMode(SlidingMenu.LEFT);
		        menu.setShadowWidthRes(R.dimen.shadow_width);
		        menu.setShadowDrawable(R.drawable.shadow);
		        menu.setBehindWidthRes(R.dimen.slidingmenu_offset);
		        menu.setFadeDegree(0.35f);
		        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		        menu.setSlidingEnabled(false);
		        setSlidingActionBarEnabled(true);	        
		        actionBar.setDisplayHomeAsUpEnabled(true);
		 }
		 

		 
	    }
	
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	        case android.R.id.home:
	            toggle();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	        }
	    }
	    
	    // Random Image Setter
	    private void randomphoto() {
	    	int [] photos = { R.drawable.alcan, R.drawable.gary, R.drawable.women, R.drawable.cora,
	    			 R.drawable.madness, R.drawable.longboat, R.drawable.victor,
	    };

	    	ImageView image = (ImageView)findViewById(R.id.menupic);
	    	
	    	Random rand = new Random();
	    	int i = rand.nextInt(photos.length);

	    	image.setImageResource(photos[i]);

	    	
	    }
	    
	    // Nav Menu Adapter
	    private void slidingmenuadapter() {

	        ListView lv = (ListView) findViewById(R.id.listView1);   
	        
	        String[] values = getResources().getStringArray(R.array.menu);
	        NavAdapter adapter = new NavAdapter(this, values);
	        lv.setAdapter(adapter);
	        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                	
                	
                	SlidingMenu menu = getSlidingMenu();
                	WorkOutsContainerFrag workoutsContainerFrag = new WorkOutsContainerFrag();
                	InformationContainerFrag informationContainerFrag = new InformationContainerFrag();
                	LaddersContainer laddersContainer = new LaddersContainer();

                    switch (position) {
                    case 0: 
                    	getSupportFragmentManager().beginTransaction()
                    	.remove(informationContainerFrag)
                    	.remove(laddersContainer)
                    	.replace(R.id.mainContentFrame, workoutsContainerFrag)
                    	.commit();
                    	randomphoto();
                    	if (findViewById(R.id.tabletView) == null){
                    		menu.toggle();
                    	}
                    	fragposition = "workouts";
                    	break;
                    	
                    case 1:
                    	getSupportFragmentManager().beginTransaction()
                    	.remove(workoutsContainerFrag)
                    	.remove(laddersContainer)
                    	.replace(R.id.mainContentFrame, informationContainerFrag)
                    	.commit();
                    	randomphoto();
                    	if (findViewById(R.id.tabletView) == null){
                    		menu.toggle();
                    	}
                    	fragposition = "information";
                    	break;
                    	
                    case 2:
                    	getSupportFragmentManager().beginTransaction()
                    	.remove(workoutsContainerFrag)
                    	.remove(informationContainerFrag)
                    	.replace(R.id.mainContentFrame, laddersContainer)
                    	.commit();	
                    	randomphoto();
                    	if (findViewById(R.id.tabletView) == null){
                    		menu.toggle();
                    	}
                    	fragposition = "ladders";
                    	break;
                    }
                }
            });
	    }
	  
	    @Override
	    public void onSaveInstanceState(Bundle outState) {
	       super.onSaveInstanceState(outState);
	       outState.putString("position", fragposition);
	    }
	    
	    
		// Network Connection Checker
		public boolean isNetworkOnline() {
		    boolean status=false;
		    try{
		        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		        NetworkInfo netInfo = cm.getNetworkInfo(0);
		        if (netInfo != null && netInfo.getState()==NetworkInfo.State.CONNECTED) {
		            status= true;
		        }else {
		            netInfo = cm.getNetworkInfo(1);
		            if(netInfo!=null && netInfo.getState()==NetworkInfo.State.CONNECTED)
		                status= true;
		        }
		    }catch(Exception e){
		        e.printStackTrace();  
		        return false;
		    }
		    return status;

		    }  
		

}


