package com.racepace.onewest.ladders;

import com.racepace.onewest.R;
import com.racepace.onewest.R.id;
import com.racepace.onewest.R.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MenSprint370 extends Fragment {
	
	private static final String[] paddlers = {
		"Rob Magus", "","Ryan Kearns",
		"Shane Beaton","","Sunny Hahm",
		"Gary Tang","","Anthony Cao",
		"Dave Wong","","Tony Chandra", 
		"Stephano C.","","Anthony Sze",
		"Jacob Cho","","Benson N.",
		"Derek Tam", "","Jessy Tang",
		"Lee Zhang", "","Charles G.",
		"Jun Bonifacio","","Nathan Wong",
		"Bradley Quan", "","Jack Park",
		"Joe Ku","","Felix Ottersbach",
		"Terry Huynh","","Michael Chow",
		"Steven Woo","","Amir Fahimi",
		"","","",
		"*As of May 31","","",
		};

	private static final String[] title = {"Lefts:","","Rights:"};

	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View grid = inflater.inflate(R.layout.mensprint370, container, false);
		
		// Grid for title and date
		GridView tg = (GridView)grid.findViewById(R.id.men370Title);
		tg.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddertitle, title));
		
		// Grid for men's results
		GridView g = (GridView)grid.findViewById(R.id.men370Grid);
		g.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddercell, paddlers));
		

		
		return grid;
	}

}
