package com.example.azam.mcc_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText pAmount;
    EditText rate, time;

    TextView emi ,pAmount1,rate1,time1,output;

    Button calculate;

    float amount,rates,times,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pAmount = findViewById(R.id.editText);
        rate = findViewById(R.id.editText2);
        time = findViewById(R.id.editText3);

        emi = findViewById(R.id.textView);
        pAmount1 = findViewById(R.id.textView2);
        rate1 = findViewById(R.id.textView3);
        time1 = findViewById(R.id.textView4);
        output = findViewById(R.id.textView5);

        calculate = findViewById(R.id.button);

        emiCalculate();
    }

    public void emiCalculate() {
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                amount = Float.parseFloat( pAmount.getText().toString());
                rates = Float.parseFloat(rate.getText().toString());
                times = Float.parseFloat(time.getText().toString());

                rates = rates / (12 * 100); // one month interest
                times = times * 12; // one month period
                result = (amount * rates * (float)Math.pow(1 + rates, times))
                        / (float)(Math.pow(1 + rates, times) - 1);

                output.setText("Your EMI for One Month is :" + result);

            }
        });

    }
}
