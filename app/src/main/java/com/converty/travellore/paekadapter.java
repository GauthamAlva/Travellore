package com.converty.travellore;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class paekadapter extends ArrayAdapter<park> {
    public paekadapter(Activity context, ArrayList<park> parkArrayList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, parkArrayList);

    }

    @Nullable
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.park_design, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        park current = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView heading = (TextView) listItemView.findViewById(R.id.headingp);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        heading.setText(current.getheader());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView info = (TextView) listItemView.findViewById(R.id.infop);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        info.setText(current.getinfo());

        ImageView img = (ImageView) listItemView.findViewById(R.id.imagepark);
        img.setImageResource(current.getimg());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}