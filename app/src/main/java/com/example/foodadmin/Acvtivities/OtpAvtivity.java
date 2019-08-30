package com.example.foodadmin.Acvtivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.example.foodadmin.R;

public class OtpAvtivity extends AppCompatActivity {
Toolbar toolotp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_avtivity);

        toolotp=findViewById(R.id.toolotp);

        setSupportActionBar(toolotp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
