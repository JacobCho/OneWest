package com.racepace.onewest.information;

import com.racepace.onewest.R;
import com.racepace.onewest.R.array;
import com.racepace.onewest.R.id;
import com.racepace.onewest.R.layout;

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

public class InfoLinks extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View links = inflater.inflate(R.layout.infolinks, container, false);
		
	
		ListView list = (ListView) links.findViewById(R.id.infolist);
		String[] values = getResources().getStringArray(R.array.linktitles);
		list.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.listtitle, values));
		
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            	
            	
            	
            	switch(position) {
            	
            	//Attendance
            	case 0:
            		Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("https://docs.google.com/spreadsheet/ccc?key=0AjBbdibRTHRddHF1dlZGY2ZNc20ydVduOXFnR20zX2c&usp=drive_web#gid=8"));
            			startActivity(intent);
            			break;
            	
                // OC-1 Coached Sessions
            	case 1:
            		Intent intent2 = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("https://docs.google.com/spreadsheet/ccc?key=0AlxvWObjE7lwdDlRTWlqS0NtbUxtekJIQVcyV081YUE&usp=drive_web#gid=0"));
            			startActivity(intent2);
            			break;
            			
            	// Women's OC-6 Doodle
            			
            	case 2:
            		Intent womenoc6 = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://doodle.com/78mtwg74guh6udvg"));
            			startActivity(womenoc6);
            			break;		
            			
            	// Men's OC-6 Doodle
            			
            	case 3:
            		Intent menoc6 = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://doodle.com/568z738d7sb4nf2v"));
            			startActivity(menoc6);
            			break;
            			
            	// Women's DB Doodle
            			
            	case 4:
            		Intent womendb = new Intent(android.content.Intent.ACTION_VIEW, 
            			    Uri.parse("http://doodle.com/78mtwg74guh6udvg"));
            			startActivity(womendb);
            			break;		
            	
            	// Lotus Ice Breaker		
            	case 5:
            		
            		double barnetlatitude = 49.290432;
            		double barnetlongitude = -122.923738;
            		String label = "Barnet Marine Park";
            		String uriBegin = "geo:" + barnetlatitude + "," + barnetlongitude;
            		String query = barnetlatitude + "," + barnetlongitude + "(" + label + ")";
            		String encodedQuery = Uri.encode(query);
            		String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
            		Uri uri = Uri.parse(uriString);
            		Intent intent3 = new Intent(android.content.Intent.ACTION_VIEW, uri);
            		startActivity(intent3);
            		break;
            		
            	// March Madness		
            	case 6:
            		
            		double madlatitude = 49.275573;
            		double madlongitude = -123.142335;
            		String madlabel = "Burrard Marina";
            		String madUriBegin = "geo:" + madlatitude + "," + madlongitude;
            		String madQuery = madlatitude + "," + madlongitude + "(" + madlabel + ")";
            		String madEncodedQuery = Uri.encode(madQuery);
            		String madUriString = madUriBegin + "?q=" + madEncodedQuery + "&z=16";
            		Uri madUri = Uri.parse(madUriString);
            		Intent madintent = new Intent(android.content.Intent.ACTION_VIEW, madUri);
            		startActivity(madintent);
            		break;
            		
            	// CORA Sprints
            	case 7:
            		double coralat = 49.244809;
            		double coralong = -122.959303;
            		String coralabel = "Burnaby Lake";
            		String coraUriBegin = "geo: " + coralat + "," + coralong;
            		String coraQuery = coralat + "," + coralong + "(" + coralabel + ")";
            		String coraEncodedQuery = Uri.encode(coraQuery);
            		String coraUriString = coraUriBegin + "?q=" + coraEncodedQuery + "&z=16";
            		Uri coraUri = Uri.parse(coraUriString);
            		Intent intent4 = new Intent(android.content.Intent.ACTION_VIEW, coraUri);
            		startActivity(intent4);
            		break;
            		
            	// Spanaway
            	case 8:
            		double spanlat = 47.1097351;
            		double spanlong = -122.4474083;
            		String spanlabel = "Spanaway Lake";
            		String spanUriBegin = "geo: " + spanlat + "," + spanlong;
            		String spanQuery = spanlat + "," + spanlong + "(" + spanlabel + ")";
            		String spanEncodedQuery = Uri.encode(spanQuery);
            		String spanUriString = spanUriBegin + "?q=" + spanEncodedQuery + "&z=16";
            		Uri spanUri = Uri.parse(spanUriString);
            		Intent intent5 = new Intent(android.content.Intent.ACTION_VIEW, spanUri);
            		startActivity(intent5);
            		break;
            		
            	// Green Lake
            	case 9:
            		double greenlat = 47.6766603;
            		double greenlong = -122.3375945;
            		String greenlabel = "Green Lake";
            		String greenUriBegin = "geo: " + greenlat + "," + greenlong;
            		String greenQuery = greenlat + "," + greenlong + "(" + greenlabel + ")";
            		String greenEncodedQuery = Uri.encode(greenQuery);
            		String greenUriString = greenUriBegin + "?q=" + greenEncodedQuery + "&z=16";
            		Uri greenUri = Uri.parse(greenUriString);
            		Intent intent6 = new Intent(android.content.Intent.ACTION_VIEW, greenUri);
            		startActivity(intent6);
            		break;
            		
            	// Silver Lake
            	case 10:
            		double silverlat = 47.894528;
            		double silverlong = -122.202944;
            		String silverlabel = "Silver Lake";
            		String silverUriBegin = "geo: " + silverlat + "," + silverlong;
            		String silverQuery = silverlat + "," + silverlong + "(" + silverlabel + ")";
            		String silverEncodedQuery = Uri.encode(silverQuery);
            		String silverUriString = silverUriBegin + "?q=" + silverEncodedQuery + "&z=16";
            		Uri silverUri = Uri.parse(silverUriString);
            		Intent intent7 = new Intent(android.content.Intent.ACTION_VIEW, silverUri);
            		startActivity(intent7);
            		break;
            		
            	// Alcan
            	case 11:
            		double alcanlat = 49.2721309;
            		double alcanlong = -123.1037492;
            		String alcanlabel = "Home of 4th place & B16";
            		String alcanUriBegin = "geo: " + alcanlat + "," + alcanlong;
            		String alcanQuery = alcanlat + "," + alcanlong + "(" + alcanlabel + ")";
            		String alcanEncodedQuery = Uri.encode(alcanQuery);
            		String alcanUriString = alcanUriBegin + "?q=" + alcanEncodedQuery + "&z=16";
            		Uri alcanUri = Uri.parse(alcanUriString);
            		Intent intent8 = new Intent(android.content.Intent.ACTION_VIEW, alcanUri);
            		startActivity(intent8);
            		break;	
            		
            	// Harrison
            	case 12:
            		double harrisonlat = 49.3003558;
            		double harrisonlong = -121.7850288;
            		String harrisonlabel = "Harrison";
            		String harrisonUriBegin = "geo: " + harrisonlat + "," + harrisonlong;
            		String harrisonQuery = harrisonlat + "," + harrisonlong + "(" + harrisonlabel + ")";
            		String harrisonEncodedQuery = Uri.encode(harrisonQuery);
            		String harrisonUriString = harrisonUriBegin + "?q=" + harrisonEncodedQuery + "@z=16";
            		Uri harrisonUri = Uri.parse(harrisonUriString);
            		Intent intent9 = new Intent(android.content.Intent.ACTION_VIEW, harrisonUri);
            		startActivity(intent9);
            		break;
            		
            			
            	}
            	
            	
            	
            }
            });
		
		return links;
	}
	
	

}
