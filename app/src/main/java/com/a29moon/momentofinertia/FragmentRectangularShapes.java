package com.a29moon.momentofinertia;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentRectangularShapes extends Fragment {

    public FragmentRectangularShapes() {
        // Required empty fragment constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fragment_rectangular_shapes, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_rectangular_shapes);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Create a set of data needed to populate the items in the RecyclerView
        CalcItem calcItemData[] = {
                new CalcItem("Simple Rectangle", "A simple rectangular shape.", 1),
                new CalcItem("Simple Rectangle 2", "A simple rectangular shape for two.", 2),
                new CalcItem("Turned Rectangle", "A turned rectangular shape.", 3)
        };

        // Create an Adapter to manage the data
        CalcItemAdapter calcItemAdapter = new CalcItemAdapter(calcItemData);
        recyclerView.setAdapter(calcItemAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        // Inflate the layout for this fragment
        return rootView;
    }

}
