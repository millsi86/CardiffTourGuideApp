package com.example.android.cardifftourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tom.mills-mock on 07/06/2017.
 * {@link ItemAdapter} in an {@link ArrayAdapter} that can provide the layput for each list item
 * based on teh data source, which is a list of {@link Item} objects.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    // create a new {@Link ItemAdapter} object.
    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View ItemView = convertView;
        if (ItemView == null) {
            ItemView = LayoutInflater.from(getContext()).inflate(R.layout.image_item, parent, false);
        }

        // Get the {@link item} object located at this position in the list
        Item currentItem = getItem(position);

        //Find the View ID's
        TextView Title = (TextView) ItemView.findViewById(R.id.item_title);
        ImageView Image = (ImageView) ItemView.findViewById(R.id.item_image);
        TextView Description = (TextView) ItemView.findViewById(R.id.item_description);
        TextView Location = (TextView) ItemView.findViewById(R.id.item_location);
        TextView Postcode = (TextView) ItemView.findViewById(R.id.postcode);


        // If statements to identify if fields have been used for the Item
        if (currentItem.hasTitle()) {
            // If an description is available, display the provided text based on the resource ID
            Title.setText(currentItem.getTitleId());
            // Make sure the view is visible
            Title.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            Title.setVisibility(View.GONE);
        }

        if (currentItem.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            Image.setImageResource(currentItem.getImageId());
            // Make sure the view is visible
            Image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            Image.setVisibility(View.GONE);
        }

        if (currentItem.hasDes()) {
            // If an description is available, display the provided text based on the resource ID
            Description.setText(currentItem.getDesId());
            // Make sure the view is visible
            Description.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            Description.setVisibility(View.GONE);
        }

        if (currentItem.hasAddress()) {
            // If an description is available, display the provided text based on the resource ID
            Location.setText(currentItem.getAddressId());
            // Make sure the view is visible
            Location.setVisibility(View.VISIBLE);
            Postcode.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            Location.setVisibility(View.GONE);
            Postcode.setVisibility(View.GONE);
        }

        return ItemView;
    }
}
