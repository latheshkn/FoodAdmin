package com.example.foodadmin.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodadmin.Acvtivities.AddNewItemActivity;
import com.example.foodadmin.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {
    RecyclerView recycerview_menu;
    RecyclerView.LayoutManager layoutManagernew;
     FloatingActionButton floating;
    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_menu, container, false);

        floating=view.findViewById(R.id.floating);

        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getContext(), AddNewItemActivity.class);
                getActivity().startActivity(intent);
            }
        });
        recycerview_menu=view.findViewById(R.id.recycerview_menu);
        layoutManagernew=new LinearLayoutManager(getContext());

        recycerview_menu.setLayoutManager(layoutManagernew);


        ArrayList<ModelRecyclerMenu> order =new ArrayList<>();

        order.add(new ModelRecyclerMenu("Roti","150",R.drawable.food));
        order.add(new ModelRecyclerMenu("Roti","150",R.drawable.food));
        order.add(new ModelRecyclerMenu("Roti","150",R.drawable.food));
        order.add(new ModelRecyclerMenu("Roti","150",R.drawable.food));
        order.add(new ModelRecyclerMenu("Roti","150",R.drawable.food));
        order.add(new ModelRecyclerMenu("Roti","150",R.drawable.food));
        order.add(new ModelRecyclerMenu("Roti","150",R.drawable.food));


        MenuAdapter apdapt=new MenuAdapter(order);


        recycerview_menu.setAdapter(apdapt);

        return view;
    }

}
