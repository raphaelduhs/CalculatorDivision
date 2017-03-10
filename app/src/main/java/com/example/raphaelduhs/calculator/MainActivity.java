package com.example.raphaelduhs.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculate (View view) {

        EditText val1 = (EditText) findViewById(R.id.valueOne);
        EditText val2 = (EditText) findViewById(R.id.valueTwo);

        TextView result = (TextView) findViewById(R.id.result);

       double numb1 = Double.parseDouble(val1.getText().toString());
       double numb2 = Double.parseDouble(val2.getText().toString());

        double solution = numb1 / numb2;

        result.setText("Resultat = "+ solution);



    }
}
