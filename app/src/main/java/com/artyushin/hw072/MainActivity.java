package com.artyushin.hw072;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int keyVisible = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textview = (TextView) findViewById(R.id.textView);

        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button zero = (Button) findViewById(R.id.zero);
        Button comma = (Button) findViewById(R.id.comma);
        Button clear = (Button)findViewById(R.id.clear);
        Button negative = (Button)findViewById(R.id.negative);
        Button percentage = (Button)findViewById(R.id.percentage);
        Button div = (Button)findViewById(R.id.division);
        Button mul = (Button)findViewById(R.id.mul);
        Button sub = (Button)findViewById(R.id.sub);
        Button add = (Button)findViewById(R.id.plus);
        Button equally = (Button)findViewById(R.id.equally);
        Button engineer = (Button)findViewById(R.id.engineer);
        LinearLayout keyLayout = (LinearLayout) findViewById(R.id.key);
        Button en_clear = (Button)findViewById(R.id.en_clear);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("0");
            }
        });

        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append(",");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText("");
            }
        });

        en_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText("");
            }
        });

        engineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (keyVisible == 0){
                    keyLayout.setVisibility(View.GONE);
                    keyVisible = 1;
                    engineer.setText("Стандартный калькулятор");
                }
                else{
                    keyLayout.setVisibility(View.VISIBLE);
                    keyVisible = 0;
                    engineer.setText("Инженерный калькулятор");
                }
            }
        });
    }
}