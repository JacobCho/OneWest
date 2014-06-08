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


public class LadderFragment extends Fragment {
	
	
	private String[] paddlers =
		{
		"Rob Magus","26:29", "26:55","27:05",
		"Jacob Cho","28:00","28:55","29:24",
		"Dave Wong","28:07","29:04","28:55",
		"Tony C.","28:17", "30:38","28:43",
		"Ryan Kearns","","28:33","30:36",
		"Gary Tang","","28:49","29:36",
		"Felix O.","28:54","","",
		"Anthony Cao","","28:58","29:41",
		"Lee Zhang","29:06","30:13**","30:50",
		"Shane B.","", "29:10**","30:51",
		"Jessy Tang","29:11","","",
		"Benson N.","29:35","30:48","31:49*",
		"Sunny Hahm","", "29:57","32:19",
		"Jack Park","29:59","","30:47",
		"Joe Ku","30:06","","",
		"Stephano C.","","30:21","29:48*",
		"Anthony Sze","30:47","33:12","31:45",
		"Nathan W.","30:57","31:25","32:08",
		"Gary Chan","31:03","32:31","31:44**",
		"Derek Tam","","31:39","33:18",
		"Jun B.","31:49","33:21","34:52",
		"Terry Huynh","31:55","","",
		"Mike Chow","32:44","31:23","33:19",
		"James Liu","32:56","","",
		"Charles G.","","33:09","33:31",
		"Bradley Quan","","33:11","34:39",
		"Wesley C.","33:18","","",
		"Kevin Tung","34:16","","",
		"Shaun W.","36:38","","",
		"Steven Woo","36:47","34:25","",
		};
	private String[] wpaddlers = 
		{
		"Carolyn Tse","", "31:34","33:16",
		"Paige M.","31:42","33:05","35:28",
		"Collyn Chan","32:44","34:15","34:40**",
		"Carmen Tam","", "","33:11",
		"Sophia Chan","","33:28","36:41",
		"Jen Chan","","33:45","35:18",
		"Jessica Tan","33:49","35:57","40:36",
		"Cherry Chen","","34:04","34:47",
		"Laurel R.","34:06","","38:21",
		"Kareen L.","34:23","","",
		"Amanda C.","", "35:10","",
		"Carol Leung","35:41", "36:38","40:31",
		"Kathleen A.","36:19","37:35","43:37",
		"Andrea S.","38:03","","",
		"Precidia Tom","39:29","","",
		
		};
	private String[] title = {"Men:","May 31:","Feb 15:","Dec 14:"};
	private String[] wtitle = {"Women:","May 31:","Feb 15:","Dec 14:"};
	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View grid = inflater.inflate(R.layout.ladder5k, container, false);
		
		// Grid for title and date
		GridView tg = (GridView)grid.findViewById(R.id.titleGrid);
		tg.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddertitle, title));
		
		// Grid for men's results
		GridView g = (GridView)grid.findViewById(R.id.menGrid);
		g.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddercell, paddlers));
		
		// Grid for women's title and date
		GridView wt = (GridView)grid.findViewById(R.id.wTitle);
		wt.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddertitle, wtitle));
		
		// Grid for women's results
		GridView gw = (GridView)grid.findViewById(R.id.womenGrid);
		gw.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.laddercell,wpaddlers));
		
		return grid;
	}

}
