package com.racepace.onewest.workouts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.racepace.onewest.R;

public class GifList extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View links = inflater.inflate(R.layout.giflist, container, false);
		
		ListView list = (ListView) links.findViewById(R.id.giflist);
		String[] values = getResources().getStringArray(R.array.giflinks);
		list.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.listtitle, values));
		
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            	
            	
            	
            	switch(position) {
            	
            	case 0:
            		Intent backextend = new Intent(android.content.Intent.ACTION_VIEW, 
                			    Uri.parse("http://gfycat.com/FeminineTestyGrosbeak"));
                			startActivity(backextend);
                			break;
            	
            	case 1:
            		Intent squat = new Intent(android.content.Intent.ACTION_VIEW, 
                			    Uri.parse("http://gfycat.com/GrouchyBrownEastrussiancoursinghounds"));
                			startActivity(squat);
                			break;
            			
            	case 2:
            		Intent terry = new Intent(android.content.Intent.ACTION_VIEW, 
                			    Uri.parse("http://gfycat.com/MadHospitableFirecrest#?direction=reverse"));
                			startActivity(terry);
                			break;
                			
            	case 3:
            		Intent grappler = new Intent(android.content.Intent.ACTION_VIEW, 
                			    Uri.parse("http://gfycat.com/TinyGorgeousConey"));
                			startActivity(grappler);
                			break;
                
            	case 4:
            		Intent crazy = new Intent(android.content.Intent.ACTION_VIEW, 
                			    Uri.parse("http://gfycat.com/IlliterateCrazyCormorant"));
                			startActivity(crazy);
                			break;
                			
            	case 5:
            		Intent lyingtris = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://gfycat.com/IdealisticHappygoluckyBasenji"));
            			startActivity(lyingtris);
            			break;			
            			
            	case 6:
            		Intent medball = new Intent(android.content.Intent.ACTION_VIEW, 
                			    Uri.parse("http://gfycat.com/ExemplaryShockingAmericankestrel"));
                			startActivity(medball);
                			break;
                			
            	case 7:
            		Intent overheadtricep = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://gfycat.com/SillyWeeklyArizonaalligatorlizard"));
            			startActivity(overheadtricep);
            			break; 			
      			
            	case 8:
            		Intent hangingpike = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://gfycat.com/AnnualScientificHamadryas"));
            			startActivity(hangingpike);
            			break;		
            			
            	case 9:
            		Intent plate = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://gfycat.com/WhisperedImpressionableAntarcticgiantpetrel"));
            			startActivity(plate);
            			break;
            			
            	case 10:
            		Intent powerclean = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://gfycat.com/SorrowfulImmaterialImpala"));
            			startActivity(powerclean);
            			break;
            			
            	case 11:
            		Intent pushpress = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://gfycat.com/ScaryVelvetyConure"));
            			startActivity(pushpress);
            			break;
            	
            	case 12:
            		Intent russian = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://gfycat.com/LikelyFortunateDodobird"));
            			startActivity(russian);
            			break;		
            			
            	case 13:
            		Intent hammer = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://gfycat.com/IllWhichIslandwhistler"));
            			startActivity(hammer);
            			break;
            			
            	case 14:
            		Intent snatch = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://gfycat.com/NauticalEmbellishedBedlingtonterrier"));
            			startActivity(snatch);
            			break;		
  	
            	}
            	
            	
            	
            }
            });
		
		return links;
	}
	
}
