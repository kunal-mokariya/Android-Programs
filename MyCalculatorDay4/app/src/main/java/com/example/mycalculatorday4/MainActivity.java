package com.example.mycalculatorday4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText tv1;
    String txt = "";
    float ans = 0;
    int addition = 0;
    int sub = 0;

    int multi = 1;
    int div = 1;
    int mod = 1;
    int task = 0;

    int at = 0;
    int st = 0;
    int mt = 0;
    int dt = 0;
    int md = 0;

    String bb1 = "";
    String bb2 = "";
    String bb3 = "";
    String bb4 = "";
    String bb5 = "";
    String bb6 = "";
    String bb7 = "";
    String bb8 = "";
    String bb9 = "";
    String bb0 = "";
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b12,b13,b14,b15,b16,b17,b18;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv1 = findViewById(R.id.editTextText);
        b1 = findViewById(R.id.button13);
        b2 = findViewById(R.id.button14);
        b3 = findViewById(R.id.button15);
        b4 = findViewById(R.id.button9);
        b5 = findViewById(R.id.button10);
        b6 = findViewById(R.id.button11);
        b7 = findViewById(R.id.button5);
        b8 = findViewById(R.id.button6);
        b9 = findViewById(R.id.button7);
        b0 = findViewById(R.id.button17);

        //b11 = findViewById(R.id.button16);
        b18 = findViewById(R.id.button18);
        b17 = findViewById(R.id.button16);
        b16 = findViewById(R.id.button12);
        b15 = findViewById(R.id.button8);
        b14 = findViewById(R.id.button4);
        b13 = findViewById(R.id.button);
        b12 = findViewById(R.id.button2);
        b11 = findViewById(R.id.button3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1)
                {
                    bb1 = bb1+"1";
                    txt = txt+bb1;
                    tv1.setText(txt);
                }
                else
                {
                    txt = txt + "1";
                    tv1.setText(txt);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1)
                {
                    bb2 = bb2+"2";
                    txt = txt+bb2;
                    tv1.setText(txt);
                }
                else
                {
                    txt = txt + "2";
                    tv1.setText(txt);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1)
                {
                    bb3 = bb3+"3";
                    tv1.setText(bb3);
                }
                else
                {
                    txt = txt + "3";
                    tv1.setText(txt);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1)
                {
                    bb4 = bb4+"4";
                    tv1.setText(bb4);
                }
                else
                {
                    txt = txt + "4";
                    tv1.setText(txt);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1)
                {
                    bb5 = bb5+"5";
                    tv1.setText(bb5);
                }
                else
                {
                    txt = txt + "5";
                    tv1.setText(txt);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1)
                {
                    bb6 = bb6+"6";
                    tv1.setText(bb6);
                }
                else
                {
                    txt = txt + "6";
                    tv1.setText(txt);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1)
                {
                    bb7 = bb7+"7";
                    tv1.setText(bb7);
                }
                else
                {
                    txt = txt + "7";
                    tv1.setText(txt);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1)
                {
                    bb8 = bb8+"8";
                    tv1.setText(bb8);
                }
                else
                {
                    txt = txt + "8";
                    tv1.setText(txt);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1)
                {
                    bb9 = bb9+"9";
                    tv1.setText(bb9);
                }
                else
                {
                    txt = txt + "9";
                    tv1.setText(txt);
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(task==1)
                {
                    bb0 = bb0+"0";
                    tv1.setText(bb0);
                }
                else
                {
                    txt = txt + "0";
                    tv1.setText(txt);
                }

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mt = 0;
                dt = 0;
                md = 1;
                mod = mod+ Integer.parseInt(tv1.getText().toString());
                tv1.setText("");
                task = 1;
                st = 0;
                at = 0;
                bb1 = "";
                bb2 = "";
                bb3 = "";
                bb4 = "";
                bb5 = "";
                bb6 = "";
                bb7 = "";
                bb8 = "";
                bb9 = "";
                bb0 = "";
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mt = 0;
                dt = 1;
                md = 0;
                div = div+Integer.parseInt(tv1.getText().toString());
                tv1.setText("");
                task = 1;
                st = 0;
                at = 0;
                bb1 = "";
                bb2 = "";
                bb3 = "";
                bb4 = "";
                bb5 = "";
                bb6 = "";
                bb7 = "";
                bb8 = "";
                bb9 = "";
                bb0 = "";
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mt = 1;
                dt = 0;
                multi = multi+ Integer.parseInt(tv1.getText().toString());
                tv1.setText("");
                task = 1;
                st = 0;
                at = 0;
                md = 0;
                bb1 = "";
                bb2 = "";
                bb3 = "";
                bb4 = "";
                bb5 = "";
                bb6 = "";
                bb7 = "";
                bb8 = "";
                bb9 = "";
                bb0 = "";

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                at = 0;
                mt = 0;
                dt = 0;
                md = 0;
                sub = sub+Integer.parseInt(tv1.getText().toString());
                txt = "";
                task = 1;
                st = 1;

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = 0;
                mt = 0;
                dt = 0;
                md = 0;
                addition = addition + Integer.parseInt(tv1.getText().toString());
                txt = "";
                task = 1;
                at = 1;


            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(task==1 && at==1)
                {
                    addition = addition + Integer.parseInt(tv1.getText().toString());
                    tv1.setText("");
                    tv1.setText(String.valueOf(addition));
                    addition = 0;

                }
                if(task==1 && st==1)
                {
                    sub = sub - (Integer.parseInt(tv1.getText().toString()));
                    tv1.setText("");
                    tv1.setText(String.valueOf(sub));
                    sub = 0;
                }
                if(task==1 && mt==1)
                {
                    multi = multi * (Integer.parseInt(tv1.getText().toString()));
                    tv1.setText("");
                    tv1.setText(String.valueOf(multi));
                    multi = 1;
                }
                if(task==1 && dt==1)
                {
                    div = div / (Integer.parseInt(tv1.getText().toString()));
                    tv1.setText("");
                    tv1.setText(String.valueOf(div));
                    div=1;
                }
                if(task==1 && md==1)
                {
                    mod = mod%(Integer.parseInt(tv1.getText().toString()));
                    tv1.setText("");
                    tv1.setText(String.valueOf(mod));
                    mod = 1;
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
                txt="";
                bb1 = "";
                bb2 = "";
                bb3 = "";
                bb4 = "";
                bb5 = "";
                bb6 = "";
                bb7 = "";
                bb8 = "";
                bb9 = "";
                bb0 = "";
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = tv1.getText().toString();
                String temp1 = temp.substring(0,temp.length()-1);
                tv1.setText("");
                tv1.setText(temp1);
                txt = temp1;
            }
        });
    }
}