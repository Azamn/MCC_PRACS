package com.example.azam.mcc_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    EditText email;
    EditText password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editText);
        password = findViewById(R.id.editText2);
        login = findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String validEmail = "[a-zA-Z0-9\\+\\.\\_\\-\\+]{1,256}"+
                        "\\@"+
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                        "("+
                        "\\."+
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                        ")";

                String mail = email.getText().toString();
                Matcher matcher = Pattern.compile(validEmail).matcher(mail);
                if(matcher.matches()){
                    Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Enter Valid Email",Toast.LENGTH_LONG).show();
                }if(password.getText().toString().equals("")){
                    password.setError("Enter Password");
                }

            }
        });
    }
}
