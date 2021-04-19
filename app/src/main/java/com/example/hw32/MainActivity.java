package com.example.hw32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edTxt_fname = findViewById(R.id.edTxt_fname);
        EditText edTxt_lname = findViewById(R.id.edTxt_lname );
        EditText edTxt_email = findViewById(R.id.edTxt_email);
        EditText edTxt_pass = findViewById(R.id.edTxt_pass);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = edTxt_fname.getText().toString();
                String lname = edTxt_lname.getText().toString();
                String email = edTxt_email.getText().toString();
                String pass = edTxt_pass.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("fname",fname);
                intent.putExtra("lname",lname);
                intent.putExtra( "email",email);
                intent.putExtra("pass",pass);

                startActivity(intent);
            }
        });
    }
}