package com.example.elshawy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double mValueOne = 0, mValueTwo = 0, results = 0;
    boolean Addition, Subtract, Multiplication, Division , done = false;

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button_add, button_subtact, button_divide, button_multiple, button_more, button_clear,
            button_square, button_square_root, button_invert, button_decimal_point, button_sin, button_cos,
            button_tan, button0, button_equal;

    TextView display_screen , display_results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button_add = findViewById(R.id.buttonAdd);
        button_subtact = findViewById(R.id.buttonSubtract);
        button_divide = findViewById(R.id.buttonDivide);
        button_multiple = findViewById(R.id.buttonMultiply);
        button_square_root = findViewById(R.id.buttonSquareRoot);
        button_invert = findViewById(R.id.buttonInvert);
        button_decimal_point = findViewById(R.id.buttonDecimalPoint);
        button_sin = findViewById(R.id.buttonSine);
        button_cos = findViewById(R.id.buttonCosine);
        button_tan = findViewById(R.id.buttonTangent);
        button_equal = findViewById(R.id.buttonEquals);
        button_clear = findViewById(R.id.buttonClear);
        button_more = findViewById(R.id.buttonMore);
        button_square = findViewById(R.id.buttonSquared);


        display_screen = findViewById(R.id.dispaly_screen);
        display_results = findViewById(R.id.dispaly_results);

        final LinearLayout layout = findViewById(R.id.row11) ;


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "0");
                layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );

                if (done == true){
                    display_results.setText(" ");
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "1");
               layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );
                if (done == true){
                    display_results.setText(" ");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "2");
                layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );
                if (done == true){
                    display_results.setText(" ");
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "3");
                layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );
                if (done == true){
                    display_results.setText(" ");
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "4");
                layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );
                if (done == true){
                    display_results.setText(" ");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "5");
                layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );
                if (done == true){
                    display_results.setText(" ");
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "6");
                layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );
                if (done == true){
                    display_results.setText(" ");
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "7");
                layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );
                if (done == true){
                    display_results.setText(" ");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "8");
                layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );
                if (done == true){
                    display_results.setText(" ");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(display_screen.getText() + "9");
                layout.setVisibility(View.VISIBLE);
                display_results.setText(display_results.getText() + " " +display_screen.getText() );
                if (done == true){
                    display_results.setText(" ");
                }
            }
        });
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("4444444444", "onClick: add " + Addition);
                if (display_screen == null) {
                    display_screen.setText("");
                } else {
                    Addition = true;
                    mValueOne = Double.parseDouble(display_screen.getText() + "");
                    display_screen.setText( " ");
                    display_results.setText(mValueOne + " + " );

                }
            }
        });
        button_subtact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Subtract = true;
                Log.e("4444444444", "onClick: subtract " + Subtract);
                if (display_screen == null) {
                    display_screen.setText("");
                } else {
                    mValueOne = Double.parseDouble(display_screen.getText() + "");
                    display_screen.setText( " ");
                    display_results.setText(mValueOne + " - " );               }

            }
        });
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Division = true;
                Log.e("4444444444", "onClick: divide " + Division);
                if (display_screen == null) {
                    display_screen.setText("");
                } else {
                    mValueOne = Double.parseDouble(display_screen.getText() + "");
                    display_screen.setText( " ");
                    display_results.setText(mValueOne + " / " );               }
            }
        });
        button_multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Multiplication = true;
                Log.e("4444444444", "onClick: multiple " + Multiplication);
                if (display_screen == null) {
                    display_screen.setText("");
                } else {
                    mValueOne = Double.parseDouble(display_screen.getText() + "");
                    display_screen.setText( " ");
                    display_results.setText(mValueOne + " * " );                }
            }
        });
        button_square_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double square = Double.parseDouble(display_screen.getText() + "");
                display_screen.setText("√" + square);
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_screen.setText(" ");
                display_results.setText(" ");
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                done = true ;
                mValueTwo = Double.parseDouble(display_screen.getText().toString());


                if (Addition == true) {
                    Log.e("add", "Equals: done");
                    results = mValueOne + mValueTwo;
                    display_screen.setText( " ");
                    display_results.setText(results + " " );


                }

                if (Subtract == true) {
                    Log.e("subtract", "Equals: done");
                    if (mValueOne > mValueTwo) {
                        results = mValueOne - mValueTwo;
                        display_screen.setText( " ");
                        display_results.setText(results + " " );
                    } else if (mValueTwo > mValueOne) {
                        results = mValueTwo - mValueOne;
                        display_screen.setText( " ");
                        display_results.setText(results + " " );
                    }
                }

                if (Multiplication == true) {
                    Log.e("Multiplecation", "Equals: done");
                    results = mValueOne * mValueTwo;
                    display_screen.setText( " ");
                    display_results.setText(results + " " );
                }

                if (Division == true) {
                    Log.e("Divition", "Equals: done");
                    if (mValueOne > mValueTwo) {
                        results = mValueOne / mValueTwo;
                        display_screen.setText( " ");
                        display_results.setText(results + " " );
                    } else if (mValueTwo > mValueOne) {
                        results = mValueTwo / mValueOne;
                        display_screen.setText( " ");
                        display_results.setText(results + " " );
                    }
                }


            }


        });


    }
}



