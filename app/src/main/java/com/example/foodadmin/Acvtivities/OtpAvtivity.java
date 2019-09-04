package com.example.foodadmin.Acvtivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.foodadmin.R;

public class OtpAvtivity extends AppCompatActivity {
Toolbar toolotp;

    TextView verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_avtivity);

        toolotp=findViewById(R.id.toolotp);

        setSupportActionBar(toolotp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        verify=findViewById(R.id.verify);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OtpAvtivity.this,HomePageActivity.class);
                startActivity(intent);
            }
        });
    }
}
