package com.example.foodadmin.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodadmin.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnGoingOrder_Fragment extends Fragment {

    RecyclerView recycler_ongoing_order;
    RecyclerView.LayoutManager layoutManager;

    public OnGoingOrder_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_on_going_order_, container, false);

        recycler_ongoing_order=view.findViewById(R.id.recycler_ongoing_order);
        layoutManager=new LinearLayoutManager(getContext());

        recycler_ongoing_order.setLayoutManager(layoutManager);

        ArrayList<ModelRecyclerNewOreder> order =new ArrayList<>();

        order.add(new ModelRecyclerNewOreder("lathesh",R.drawable.food));
        order.add(new ModelRecyclerNewOreder("manjunath",R.drawable.food));
        order.add(new ModelRecyclerNewOreder("pannkaj",R.drawable.food));
        order.add(new ModelRecyclerNewOreder("prakash",R.drawable.food));
        order.add(new ModelRecyclerNewOreder("vinod",R.drawable.food));

        OnGoingOrderAdapter apdapt=new OnGoingOrderAdapter(order);


        recycler_ongoing_order.setAdapter(apdapt);

        return view;
    }

}
