package com.example.calculator_task5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edit;
Button button1,button2,button3,button_add,button4,button5,button6,button_sub,button7
        ,button8,button9,button_multi,button10,button11,button12,button_divition,button_equal;



     float mValue1,mValue2;

      boolean Addition,Subtract,Multiplication,Division;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intFunction();
        intLisiner();
        
    }

    private void intLisiner() {


        //1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText() + "1");


            }
        });
        //2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "2");


            }
        });
        //3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "3");


            }
        });

        //add
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    try {
                        mValue1 = Float.parseFloat(edit.getText() + "");
                        Addition = true;
                    }catch (Exception e){
                        Toast.makeText(MainActivity.this, "please Enter a value ", Toast.LENGTH_SHORT).show();
                    }

                    edit.setText(null);
                }



        });
        //4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "4");

            }
        });
        //5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "5");


            }
        });

        //6

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "6");


            }

        });

        //sub
        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              try {
                  mValue1 = Float.parseFloat(edit.getText() + "");
                  Subtract = true;

              }catch (Exception e){
                  Toast.makeText(MainActivity.this, "please Enter a value ", Toast.LENGTH_SHORT).show();
              }

                edit.setText(null);
            }


        });


        //7
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            edit.setText(edit.getText() + "7");

            }

        });

        //8

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "8");


            }
        });

        //9
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "9");


            }
        });


        //mul
        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValue1 = Float.parseFloat(edit.getText() + "");
                    Multiplication = true;


                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "please Enter a value ", Toast.LENGTH_SHORT).show();
                }

                edit.setText(null);

            }
        });

        //.dot

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + ".");


            }
        });

        //(digit 0)






        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "0");


            }
        });


           //cancle

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText("");
            }
        });

        //divition
        button_divition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  try {
                      mValue1 = Float.parseFloat(edit.getText() + "");
                      Division = true;

                  }catch (Exception e){
                      Toast.makeText(MainActivity.this, "please Enter a value  ", Toast.LENGTH_SHORT).show();
                  }

                edit.setText(null);

            }
        });

        //equal buttom
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mValue2 = Float.parseFloat(edit.getText() + "");

                    if (Addition == true) {
                        edit.setText(mValue1 + mValue2 + "");
                        Addition = false;
                    }

                    if (Subtract == true) {
                        edit.setText(mValue1 - mValue2 + "");
                        Subtract = false;
                    }

                    if (Multiplication == true) {
                        edit.setText(mValue1 * mValue2 + "");
                        Multiplication = false;
                    }

                    if (Division == true) {
                        edit.setText(mValue1 / mValue2 + "");
                        Division = false;
                    }

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "please Enter a value ", Toast.LENGTH_SHORT).show();
                }



            }
        });



    }

    private void intFunction() {

        edit = findViewById(R.id.et1);
        button1 = findViewById(R.id.bt1);
        button2 = findViewById(R.id.bt2);
        button3 = findViewById(R.id.bt3);
        button_add = findViewById(R.id.btadd);
        button4=findViewById(R.id.bt4);
        button5 = findViewById(R.id.bt5);
        button6= findViewById(R.id.bt6);
        button_sub = findViewById(R.id.btsub);
        button7=findViewById(R.id.bt7);
        button8=findViewById(R.id.bt8);
        button9=findViewById(R.id.bt9);
        button_multi = findViewById(R.id.btmul);
        button10=findViewById(R.id.bt10);
        button11=findViewById(R.id.bt11);
        button12=findViewById(R.id.bt12);
        button_divition=findViewById(R.id.btdiv);
        button_equal =findViewById(R.id.btequl);

    }


}