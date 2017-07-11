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

public class CastleAdapter extends ArrayAdapter<Castle> {

    public CastleAdapter(Context context, ArrayList<Castle> castles) {
        super(context, 0, castles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View castleItemView = convertView;
        if (castleItemView == null) {
            castleItemView = LayoutInflater.from(getContext()).inflate(R.layout.image_item, parent, false);
        }

        Castle currentCastle = (Castle) getItem(position);

        TextView castleTitle = (TextView) castleItemView.findViewById(R.id.item_title);

        castleTitle.setText(currentCastle.getCastleTitleId());

        ImageView castleImage = (ImageView) castleItemView.findViewById(R.id.item_image);

        castleImage.setImageResource(currentCastle.getCastleImageId());

        TextView castleDescription = (TextView) castleItemView.findViewById(R.id.item_description);

        castleDescription.setText(currentCastle.getCastleDesId());

        TextView castleLocation = (TextView) castleItemView.findViewById(R.id.item_location);

        castleLocation.setText(currentCastle.getCastleAddressId());

        return castleItemView;
    }
}
