package com.example.android.cardifftourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BayFragment extends Fragment {


    public BayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.text_item, container, false);

        // Create a list of attractions methods
        final ArrayList<Item> Bay = new ArrayList<>();
        Bay.add(new Item(R.string.Bay_title, R.drawable.bay, R.string.Bay_des, R.string.Bay_location));
        Bay.add(new Item(R.string.Millennium_Centre_title, R.string.Millennium_Centre_des));
        Bay.add(new Item(R.string.Barrage_title, R.string.Barrage_des));
        Bay.add(new Item(R.string.Doctor_Who_title, R.string.Doctor_Who_des));
        Bay.add(new Item(R.string.Techniquest_title, R.string.Techniquest_des));
        Bay.add(new Item(R.string.Norwegian_Church_title, R.string.Norwegian_Church_des));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), Bay);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // image_item.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}
