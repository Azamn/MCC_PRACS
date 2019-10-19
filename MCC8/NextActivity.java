package com.example.azam.mcc_8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    TextView second,txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Toast.makeText(getApplicationContext(), "We are moved to second Activity", Toast.LENGTH_LONG).show();
    }
}
