package com.example.azam.mcc_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText roll_no;
    EditText department;
    Button submit;

    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DatabaseHelper(this);

        name = (EditText) findViewById(R.id.editText);
        roll_no = (EditText) findViewById(R.id.editText2);
        department = (EditText) findViewById(R.id.editText3);
        submit = (Button) findViewById(R.id.button2);

        AddData();

    }

    public void AddData() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(name.getText().toString(),
                        roll_no.getText().toString(),
                        department.getText().toString());
                if(isInserted == true) {
                    Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                    cleartext();
                }else
                    Toast.makeText(MainActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
            }

        });
    }

    public void cleartext(){
        name.setText("");
        roll_no.setText("");
        department.setText("");
    }
}
