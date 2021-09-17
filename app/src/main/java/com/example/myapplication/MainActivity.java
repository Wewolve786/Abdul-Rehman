package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    EditText Edit1, Edit2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnEqual;
    TextView tvShow;

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        Edit1 = findViewById(R.id.Ed1);
        Edit2 = findViewById(R.id.Ed2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        tvShow = findViewById(R.id.tvShow);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, k;
                a = Integer.parseInt(Edit1.getText().toString());
                b = Integer.parseInt(Edit2.getText().toString());
                k = a + b;
                tvShow.setText("Result=" + k);
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, k;
                a = Integer.parseInt(Edit1.getText().toString());
                b = Integer.parseInt(Edit2.getText().toString());
                k = a - b;
                tvShow.setText("Result=" + k);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, k;
                a = Integer.parseInt(Edit1.getText().toString());
                b = Integer.parseInt(Edit2.getText().toString());
                k = a * b;
                tvShow.setText("Result=" + k);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, k;
                a = Integer.parseInt(Edit1.getText().toString());
                b = Integer.parseInt(Edit2.getText().toString());
                k = a / b;
                tvShow.setText("Result=" + k);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, k;
                a = Integer.parseInt(Edit1.getText().toString());
                b = Integer.parseInt(Edit2.getText().toString());
                tvShow.setText("");
            }
        });

//    }
//
//    ArrayList
//    public class Main{
//        public void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Ferrari");
        Collections.sort(cars);
        // Loop through an ArrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i));
        }

        for (String element: cars) {
            System.out.print(element);
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
        }

    }
}