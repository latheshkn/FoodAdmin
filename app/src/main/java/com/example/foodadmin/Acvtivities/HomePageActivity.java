package com.example.foodadmin.Acvtivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.foodadmin.Fragments.AllOrderFragment;
import com.example.foodadmin.Fragments.MenuFragment;
import com.example.foodadmin.Fragments.ProfileFragment;
import com.example.foodadmin.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePageActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Fragment fragment =new MenuFragment();
        FragmentTransaction ts=getSupportFragmentManager().beginTransaction();
        ts.replace(R.id.frame,fragment);
        ts.commit();
        bottom_navigation=findViewById(R.id.bottom_navigation);

//        to add the customised icons to the navigation bar
        bottom_navigation.setItemIconTintList(null);

        bottom_navigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        int id= item.getItemId();
                        Fragment fragment=null;
                       if (id==R.id.profile){

                           fragment =new ProfileFragment();
                       }
                       if (id==R.id.menu){
                           fragment=new MenuFragment();
                       }
                       if (id==R.id.order){
                           fragment=new AllOrderFragment();
                       }

                       if (fragment!=null){

                           FragmentTransaction ts=getSupportFragmentManager().beginTransaction();
                           ts.replace(R.id.frame,fragment);
                           ts.commit();

                       }
                      return  true;
                    }


                });

    }
}
