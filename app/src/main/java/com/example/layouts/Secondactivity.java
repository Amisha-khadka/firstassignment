package com.example.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Secondactivity extends AppCompatActivity {
    TextView email, password,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_secondactivity);
        email = findViewById(R.id.email_display);
        password=findViewById(R.id.password_display);
        gender =findViewById(R.id.gender_display);
        Intent intent = getIntent();
        String email_in=intent.getStringExtra("email");
        String password_in=intent.getStringExtra("password");
        String gender_in= intent.getStringExtra("gender");
        email.setText(email_in);
        password.setText(password_in);
        gender.setText(gender_in);
    }

}