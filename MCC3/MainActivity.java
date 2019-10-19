package com.example.azam.mcc_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name, roll_no, email;
    TextView rform,name1,roll_no1,email1,gender1,enroll;
    RadioButton male,female;
    CheckBox python,java,php;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editText);
        roll_no = findViewById(R.id.editText2);
        email = findViewById(R.id.editText3);

        rform = findViewById(R.id.textView);
        name1 = findViewById(R.id.textView2);
        roll_no1 = findViewById(R.id.textView3);
        email1 = findViewById(R.id.textView4);
        gender1 = findViewById(R.id.textView5);
        enroll = findViewById(R.id.textView6);

        male = findViewById(R.id.radioButton);
        female = findViewById(R.id.radioButton2);

        java = findViewById(R.id.checkBox);
        python = findViewById(R.id.checkBox2);
        php = findViewById(R.id.checkBox3);

        register = findViewById(R.id.button);
    }
}
