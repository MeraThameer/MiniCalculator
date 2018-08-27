package com.example.pc.minicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edittext1, edittext2 , editText3;
    private Button button,button2,button3,button4,button5;
    double a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }
    public void addListenerOnButton() {
        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();
                String value2 = edittext2.getText().toString();
                //String value3=editText3.getText().toString();
                a = Double.parseDouble(value1);
                b = Double.parseDouble(value2);
                c = a + b;
                editText3.setText(String.valueOf(c));

                //Toast.makeText(getApplicationContext(),String.valueOf(c), Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();
                String value2 = edittext2.getText().toString();
                //String value3=editText3.getText().toString();
                a = Double.parseDouble(value1);
                b = Double.parseDouble(value2);
                c = a - b;
                editText3.setText(String.valueOf(c));

                //Toast.makeText(getApplicationContext(),String.valueOf(c), Toast.LENGTH_LONG).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();
                String value2 = edittext2.getText().toString();
                //String value3=editText3.getText().toString();
                a = Double.parseDouble(value1);
                b = Double.parseDouble(value2);
                c = a * b;
                editText3.setText(String.valueOf(c));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();
                String value2 = edittext2.getText().toString();
                //String value3=editText3.getText().toString();
                a = Double.parseDouble(value1);
                b = Double.parseDouble(value2);
                c = a / b;
                editText3.setText(String.valueOf(c));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();
                String value2 = edittext2.getText().toString();
                //String value3=editText3.getText().toString();
                a = Double.parseDouble(value1);
                b = Double.parseDouble(value2);
                c = a%b;
                editText3.setText(String.valueOf(c));
            }
        });

    }}
