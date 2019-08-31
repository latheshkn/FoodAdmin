package com.example.foodadmin.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.example.foodadmin.Acvtivities.MainActivity;
import com.example.foodadmin.Acvtivities.ProfileEditActivity;
import com.example.foodadmin.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    ImageView imgedit;
    Toolbar toolprofile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        imgedit=view.findViewById(R.id.imgedit);

        imgedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), ProfileEditActivity.class);
                getActivity().startActivity(intent);
            }
        });


        toolprofile = view.findViewById(R.id.toolprofile);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolprofile);

        return view;
    }

}