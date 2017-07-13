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
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ItemView = convertView;
        if (ItemView == null) {
            ItemView = LayoutInflater.from(getContext()).inflate(R.layout.image_item, parent, false);
        }

        Item currentItem = (Item) getItem(position);

        TextView Title = (TextView) ItemView.findViewById(R.id.item_title);

        if (currentItem.hasTitle()) {
            // If an description is available, display the provided text based on the resource ID
            Title.setText(currentItem.getTitleId());
            // Make sure the view is visible
            Title.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            Title.setVisibility(View.GONE);
        }

        ImageView Image = (ImageView) ItemView.findViewById(R.id.item_image);

        if (currentItem.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            Image.setImageResource(currentItem.getImageId());
            // Make sure the view is visible
            Image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            Image.setVisibility(View.GONE);
        }

        TextView Description = (TextView) ItemView.findViewById(R.id.item_description);

        if (currentItem.hasDes()) {
            // If an description is available, display the provided text based on the resource ID
            Description.setText(currentItem.getDesId());
            // Make sure the view is visible
            Description.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            Description.setVisibility(View.GONE);
        }

        TextView Location = (TextView) ItemView.findViewById(R.id.item_location);
        TextView Postcode = (TextView) ItemView.findViewById(R.id.postcode);

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
