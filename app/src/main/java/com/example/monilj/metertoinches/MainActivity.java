package com.example.monilj.metertoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = (EditText) findViewById(R.id.meterEditText);
        resultTextView = (TextView) findViewById(R.id.resultID);
        convertButton = (Button) findViewById(R.id.convertButtonId);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //conversion logic
                //1m 39.370m
                double multiplier = 39.37;
                double result = 00.00;

                if(enterMeters.getText().toString().equals(""))
                {
                 resultTextView.setText(R.string.error_message);
                 resultTextView.setTextColor(Color.RED);
                }
                else {
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());
                    result = meterValue * multiplier;
                    resultTextView.setText(Double.toString(result));
                }
            }
        });
    }
}
