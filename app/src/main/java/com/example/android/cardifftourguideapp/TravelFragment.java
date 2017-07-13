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
public class TravelFragment extends Fragment {


    public TravelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.text_item, container, false);

        final ArrayList<Item> TransportTypes = new ArrayList<>();
        TransportTypes.add(new Item(R.drawable.aerial));
        TransportTypes.add(new Item(R.string.Cardiff_by_car_title, R.string.Cardiff_by_car_des, R.string.Cardiff_by_car_location));
        TransportTypes.add(new Item(R.string.Cardiff_by_Air_title, R.string.Cardiff_by_Air_des, R.string.Cardiff_by_air_location));
        TransportTypes.add(new Item(R.string.Cardiff_by_train_title, R.string.Cardiff_by_train_des, R.string.Cardiff_by_train_location));

        ItemAdapter adapter = new ItemAdapter(getActivity(), TransportTypes);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Item castle = TransportTypes.get(position);
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + getText(castle.getAddressId()));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        return rootView;
    }

}
