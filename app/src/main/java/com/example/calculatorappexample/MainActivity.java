package com.example.calculatorappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    ImageView btn_ac,btn_dot,btn_plus,btn_minus,btn_equal,btn_module,btn_multiplication,btn_divide;

    TextView inputTxt,outputTxt;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTxt=findViewById(R.id.inputTxt);
        outputTxt=findViewById(R.id.outputTxt);

        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);

        btn_dot=findViewById(R.id.btn_dot);
        btn_ac=findViewById(R.id.btn_ac);
        btn_plus=findViewById(R.id.btn_plus);
        btn_minus=findViewById(R.id.btn_minus);
        btn_equal=findViewById(R.id.btn_equal);
        btn_module=findViewById(R.id.btn_module);
        btn_multiplication=findViewById(R.id.btn_multiplication);
        btn_divide=findViewById(R.id.btn_divide);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"9");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +".");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"+");
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText("");
                outputTxt.setText("");
            }
        });
        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"%");
            }
        });
        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"*");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"-");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data +"/");
            }
        });

    }
}