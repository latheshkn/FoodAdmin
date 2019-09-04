package com.example.foodadmin.Acvtivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.foodadmin.R;

public class VerifyMobileActivity extends AppCompatActivity {

    Button btncontinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_mobile);

        btncontinue=findViewById(R.id.btncontinue);

        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VerifyMobileActivity.this,OtpAvtivity.class);
                startActivity(intent);
            }
        });
    }
}
