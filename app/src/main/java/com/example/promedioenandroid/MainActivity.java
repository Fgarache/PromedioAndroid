package com.example.promedioenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private EditText number3;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.NUMBER_1);
        number2 = findViewById(R.id.NUMBER_2);
        number3 = findViewById(R.id.NUMBER_3);
        result = findViewById(R.id.RESULT);
    }

    public void average (View view){
        int value1=Integer.parseInt(number1.getText().toString());
        int value2=Integer.parseInt(number2.getText().toString());
        int value3=Integer.parseInt(number3.getText().toString());
        int average2 = (value1+value2+value3)/3;

        String result2 = String.valueOf(average2);
        if (average2 >= 60) {
            result.setText("Felicidades, aprovastes. \n Nota: "+result2);
        }else{
            result.setText("Reprovado. nota: "+result2);
        }



    }
}