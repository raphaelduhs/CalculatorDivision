package com.example.raphaelduhs.calculator;

import android.graphics.Color;
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
        TextView dividend = (TextView) findViewById(R.id.Dividend);
        TextView divisor = (TextView) findViewById(R.id.Divisor);


        // prüft ob der erste Wert leer ist
        if (val1.getText().length() == 0) {
            result.setText("Bitte Dividend eintragen!");
            dividend.setTextColor(Color.RED);

            if (val2.getText().length() == 0) {

                result.setText("Bitte Dividend und Divisor eintragen!");
                divisor.setTextColor(Color.RED);}

            // prüft ob der zweite Wert leer ist
        } else if (val2.getText().length() == 0) {

            dividend.setTextColor(Color.BLACK);
            result.setText("Bitte Divisor eintragen!");
            divisor.setTextColor(Color.RED);

         // wenn die passenden Werte da sind führe Berechnung aus
        } else {

            // prüft ob der Divisor 0 ist
            if (Double.parseDouble(val2.getText().toString()) == 0 ) {
                result.setText("Achtung Division durch 0 nicht möglich!");

            }
            else {

            dividend.setTextColor(Color.BLACK);
            divisor.setTextColor(Color.BLACK);
            double numb1 = Double.parseDouble(val1.getText().toString());
            double numb2 = Double.parseDouble(val2.getText().toString());
            System.out.println(numb1);
            System.out.println(numb2);
            double solution = numb1 / numb2;
            result.setText("Resultat = "+ solution);
            result.setTextSize(25f);}

            }






    }
}
