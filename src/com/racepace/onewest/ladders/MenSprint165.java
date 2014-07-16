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

public class MenSprint165 extends Fragment {
	
	private static final String[] paddlers = {
		"Derek Tam", "","Ryan Kearns",
		"Shane Beaton","","Tony Chandra",
		"Gary Tang","","Charles G.",
		"Dave Wong","","Nathan Wong",
		"Lee Zhang","","Michael Chow",
		"Terry Huynh","","Benson N.",
		"Jacob Cho","","James Liu",
		"Bradley Quan", "","Jessy Tang",
		"Rob Magus", "","Anthony Sze",
		"Jun Bonifacio", "","Jack Park",
		"Joe Ku","","Anthony Cao",
		"Wesley C","","Amir Fahimi",
		"Steven Woo", "","Shaun W.",
		"Kevin Tung","","",
		"","","",
		"*As of Jul 8","",""
		
		};

	private static final String[] title = {"Lefts:","","Rights:"};

	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View grid = inflater.inflate(R.layout.mensprint165, container, false);
		
		// Grid for title and date
		GridView tg = (GridView)grid.findViewById(R.id.men165Title);
		tg.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddertitle, title));
		
		// Grid for men's results
		GridView g = (GridView)grid.findViewById(R.id.men165Grid);
		g.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddercell, paddlers));
		

		
		return grid;
	}

}
