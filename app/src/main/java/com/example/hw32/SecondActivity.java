package com.example.hw32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtVw_fname = findViewById(R.id.txtVw_fname);
        TextView txtVw_lname = findViewById(R.id.txtVw_lname);
        TextView txtVw_email = findViewById(R.id.txtVw_email);
        TextView txtVw_pass = findViewById(R.id.txtVw_pass);

        String fname = getIntent().getExtras().getString("fname");
        String lname = getIntent().getExtras().getString("lname");
        String email = getIntent().getExtras().getString("email");
        String pass = getIntent().getExtras().getString("pass");

        txtVw_fname.setText(fname);
        txtVw_lname.setText(lname);
        txtVw_email.setText(email);
        txtVw_pass.setText(pass);



    }
}