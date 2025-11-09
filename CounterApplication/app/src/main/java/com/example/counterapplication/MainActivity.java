package com.example.counterapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Long i = 0L;
    Button b1,b2,b3;
    TextView tv1;


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

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        tv1 = findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    i--;
                    tv1.setText("");
                    if ((i >= 0 && i <= 100) ||(i <= 0 && i >= -100)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xFF5297FF);
                    }
                    if ((i >= 101 && i <= 200) ||(i <= -101 && i >= -200)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xFF3BE5FF);
                    }
                    if (i >= 201 && i <= 300||(i <= -201 && i >= -300)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0x29FF62FF);
                    }
                    if (i >= 301 && i <= 400||(i <= -301 && i >= -400)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xB5FF54FF);
                    }
                    if (i >= 401 && i <= 500||(i <= -401 && i >= -500)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xB5FF54FF);
                    }
                    if (i >= 501 || i<=-501) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xFF4A74FF);
                    }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    i++;
                    tv1.setText("");
                    if ((i >= 0 && i <= 100)|| (i<=0 && i>=-100)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xFF5297FF);
                    }
                    if ((i >= 101 && i <= 200) || (i<=-101 && i>=-200)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xFF3BE5FF);
                    }
                    if ((i >= 201 && i <= 300) || (i<=-201 && i>=-300)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0x29FF62FF);
                    }
                    if ((i >= 301 && i <= 400) || (i<=-401 && i>=-400)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xB5FF54FF);
                    }
                    if ((i >= 401 && i <= 500) || (i<=-401 && i>=-500)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xB5FF54FF);
                    }
                    if ((i >= 501) || (i<=-501)) {
                        tv1.setText(String.valueOf(i));
                        tv1.setBackgroundColor(0xFF4A74FF);
                    }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 0l;
                tv1.setText("");
                tv1.setText(String.valueOf(i));
            }
        });
    }
}