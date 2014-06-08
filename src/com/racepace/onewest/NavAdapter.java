package com.racepace.onewest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NavAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] titles;

	public NavAdapter(Context context, String[] titles) {
		super(context, R.layout.menu_text, titles);
		this.context = context;
		this.titles = titles;
	}
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if (convertView == null) {
			LayoutInflater inflater = LayoutInflater.from(getContext());
				convertView = inflater.inflate(R.layout.menu_text, null);
		}
		
		TextView menuTitle = (TextView) convertView.findViewById(R.id.menu_text);
		menuTitle.setText(titles[position]);
		
		ImageView icon = (ImageView) convertView.findViewById(R.id.menu_icon);
		
		String title = titles[position];
		if (title.startsWith("Workouts")) {
			icon.setImageResource(R.drawable.dumbbell);
		} else if (title.startsWith("Information")) {
			icon.setImageResource(R.drawable.info);
		} else {
			icon.setImageResource(R.drawable.ladder);
		}
		
		return convertView;
	}

}
