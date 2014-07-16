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

public class WomenSprint165 extends Fragment {
	
	private static final String[] paddlers = {
		"Collyn Chan", "","Carolyn Tse",
		"Jessica Tan", "","Paige M.",
		"Jen Chan","","Sophia Chan",
		"Sophia Chan","","Cherry Chen",
		"Carol Leung", "","Carmen Tam",
		"Kathleen A.", "","Carol Leung",
		"Precidia Tom", "","Laurel Rogers",
		"","","Kathleen A.",
		"","","",
		"*As of Jul 10","",""
		};

	private static final String[] title = {"Lefts:","","Rights:"};

	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View grid = inflater.inflate(R.layout.womensprint165, container, false);
		
		// Grid for title and date
		GridView tg = (GridView)grid.findViewById(R.id.women165Title);
		tg.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddertitle, title));
		
		// Grid for men's results
		GridView g = (GridView)grid.findViewById(R.id.women165Grid);
		g.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddercell, paddlers));
		

		
		return grid;
	}

}
