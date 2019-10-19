package com.example.azam.mcc_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button add,sub,mul,div;
    TextView calculator , result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.editText2);
        e2 = findViewById(R.id.editText3);

        calculator = findViewById(R.id.textView);
        result = findViewById(R.id.textView);

        add = findViewById(R.id.button);
        sub = findViewById(R.id.button3);
        mul = findViewById(R.id.button4);
        div = findViewById(R.id.button6);

        addition();
        subtraction();
        multiply();
        division();
    }

    public void division() {
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(e1.getText().toString());
                int second = Integer.parseInt(e2.getText().toString());

                int output = first / second;

                result.setText("Division of two Number "+first+ "and"+second+ "is :" + output);
            }
        });

    }

    public void multiply() {
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(e1.getText().toString());
                int second = Integer.parseInt(e2.getText().toString());

                int output = first * second;

                result.setText("Multiplication of two Number "+first+ "and"+second+ "is :" + output);
            }
        });

    }

    public void subtraction() {
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(e1.getText().toString());
                int second = Integer.parseInt(e2.getText().toString());

                int output = first - second;

                result.setText("Subtraction of two Number "+first+ "and"+second+ "is :" + output);

            }
        });
    }

    public void addition() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int first = Integer.parseInt(e1.getText().toString());
                int second = Integer.parseInt(e2.getText().toString());

                int output = first + second;

                result.setText("Addition of two Number "+first+ "and"+second+ "is :" + output);

            }
        });
    }
}
