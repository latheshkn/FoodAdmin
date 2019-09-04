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
public class NewOrderFragment extends Fragment {

RecyclerView recycler_new_order;
RecyclerView.LayoutManager layoutManagernew;
    public NewOrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_new_order, container, false);


       recycler_new_order=view.findViewById(R.id.recycler_new_order);
        layoutManagernew=new LinearLayoutManager(getContext());

        recycler_new_order.setLayoutManager(layoutManagernew);


        ArrayList<ModelRecyclerNewOreder> order =new ArrayList<>();

        order.add(new ModelRecyclerNewOreder("lathesh",R.drawable.food));
        order.add(new ModelRecyclerNewOreder("manjunath",R.drawable.food));
        order.add(new ModelRecyclerNewOreder("pannkaj",R.drawable.food));
        order.add(new ModelRecyclerNewOreder("prakash",R.drawable.food));
        order.add(new ModelRecyclerNewOreder("vinod",R.drawable.food));

        NewOrderAdapter apdapt=new NewOrderAdapter(order);


        recycler_new_order.setAdapter(apdapt);

       return view;
    }

}
