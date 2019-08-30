package com.example.foodadmin.Fragments;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodadmin.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AllOrderFragment extends Fragment {

ViewPager viewpager_allorder;

TabLayout tablayout_allorder;

    public AllOrderFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_all_order, container, false);

        viewpager_allorder =view.findViewById(R.id.viewpager_allorder);

        tablayout_allorder=view.findViewById(R.id.tablayout_allorder);

        tablayout_allorder.setupWithViewPager(viewpager_allorder);

        Vpadapter asd=new Vpadapter(getFragmentManager());

        asd.Addfg(new NewOrderFragment(),"New order");
        asd.Addfg(new OnGoingOrder_Fragment(),"Ongoing order");
        asd.Addfg(new PastOrderFragment(),"past order");
        viewpager_allorder.setAdapter(asd);
        return view;
    }


    class  Vpadapter extends FragmentPagerAdapter{
ArrayList<Fragment> fragments;
ArrayList<String> titles;

        public Vpadapter(FragmentManager fm) {
            super(fm);

            fragments=new ArrayList<>();
            titles=new ArrayList<>();
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }

        public void Addfg(Fragment fg, String title){
            fragments.add(fg);
            titles.add(title);
        }
    }

}
