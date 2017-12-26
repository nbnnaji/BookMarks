package com.example.nnaji_macpro1.bookmarks;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nnaji-MacPro1 on 12/26/17.
 */

public class CustomListAdapter extends ArrayAdapter<LinkModel> {
    public CustomListAdapter(Context context, ArrayList<LinkModel> _linkModel) {
        super(context, 0, _linkModel);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        LinkModel link = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.shopping_links, parent, false);
        }
        // Lookup view for data population
        TextView lkName = (TextView) convertView.findViewById(R.id.name);
        TextView lk = (TextView) convertView.findViewById(R.id.link);
        // Populate the data into the template view using the data object
        lkName.setText(link.name);
        lk.setText(link.url);
        // Return the completed view to render on screen
        return convertView;
    }
}