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
public class StDavidsFragment extends Fragment {


    public StDavidsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.text_item, container, false);

        // Create a list of shops methods
        final ArrayList<Item> Shops = new ArrayList<>();
        Shops.add(new Item(R.string.StDavids_title, R.drawable.stdavids, R.string.StDavids_overview_description, R.string.StDavids_overview_location));
        Shops.add(new Item(R.string.JL_title, R.string.JL_des));
        Shops.add(new Item(R.string.Hollister_title, R.string.Hollister_des));
        Shops.add(new Item(R.string.AllSaints_title, R.string.AllSaints_des));
        Shops.add(new Item(R.string.Accessorize_title, R.string.Accessorize_des));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), Shops);

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
