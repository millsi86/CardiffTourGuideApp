package com.example.android.cardifftourguideapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CastlesFragment extends Fragment {


    public CastlesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.text_item, container, false);

        final ArrayList<Castle> castles = new ArrayList<>();
        castles.add(new Castle(R.string.Cardiff, R.drawable.cardiff, R.string.Cardiff_Des, R.string.Cardiff_Location));
        castles.add(new Castle(R.string.Caerphilly, R.drawable.caerphilly, R.string.Caerphilly_Des, R.string.Caerphilly_Location));
        castles.add(new Castle(R.string.Coch, R.drawable.coch, R.string.Coch_Des, R.string.Coch_Location));
        castles.add(new Castle(R.string.Ogmore, R.drawable.ogmore, R.string.Ogmore_Des, R.string.Ogmore_Location));
        castles.add(new Castle(R.string.Ruperra, R.drawable.ruperra, R.string.Ruperra_Des, R.string.Ruperra_Location));

        CastleAdapter adapter = new CastleAdapter(getActivity(), castles);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Castle castle = castles.get(position);
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + getText(castle.getCastleAddressId()));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        return rootView;
    }

}
