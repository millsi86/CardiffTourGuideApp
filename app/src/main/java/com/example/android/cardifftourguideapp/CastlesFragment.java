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

        // Create a list of castles
        final ArrayList<Item> castles = new ArrayList<>();
        castles.add(new Item(R.string.Cardiff, R.drawable.cardiff, R.string.Cardiff_Des, R.string.Cardiff_Location));
        castles.add(new Item(R.string.Caerphilly, R.drawable.caerphilly, R.string.Caerphilly_Des, R.string.Caerphilly_Location));
        castles.add(new Item(R.string.Coch, R.drawable.coch, R.string.Coch_Des, R.string.Coch_Location));
        castles.add(new Item(R.string.Ogmore, R.drawable.ogmore, R.string.Ogmore_Des, R.string.Ogmore_Location));
        castles.add(new Item(R.string.Ruperra, R.drawable.ruperra, R.string.Ruperra_Des, R.string.Ruperra_Location));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), castles);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // image_item.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        //Use an Listener to launch gmaps when the postcode is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Item castle = castles.get(position);
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + getText(castle.getAddressId()));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        return rootView;
    }

}
