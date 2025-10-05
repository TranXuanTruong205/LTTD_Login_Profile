package com.example.login_profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn_2339 = findViewById(R.id.btnLogin);
        btn_2339.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent_2339 = new Intent(LoginActivity.this,activity_profile.class);
                startActivity(myintent_2339);
            }
        });
    }
}