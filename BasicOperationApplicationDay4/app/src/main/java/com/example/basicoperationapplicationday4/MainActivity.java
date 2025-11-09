package com.example.basicoperationapplicationday4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int a = 0;
    int b = 0;
    EditText txt1,txt2;
    Button b1,b2,b3,b4;
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
        txt1 = findViewById(R.id.editTextText);
        txt2 = findViewById(R.id.editTextText2);
        tv1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(txt1.getText().toString());
                b = Integer.parseInt(txt2.getText().toString());
                tv1.setText("");
                int ans = a+b;
                tv1.setText(String.valueOf(ans));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(txt1.getText().toString());
                b = Integer.parseInt(txt2.getText().toString());
                tv1.setText("");
                int ans = a-b;
                tv1.setText(String.valueOf(ans));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(txt1.getText().toString());
                b = Integer.parseInt(txt2.getText().toString());
                tv1.setText("");
                int ans = a/b;
                tv1.setText(String.valueOf(ans));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(txt1.getText().toString());
                b = Integer.parseInt(txt2.getText().toString());
                tv1.setText("");
                int ans = a*b;
                tv1.setText(String.valueOf(ans));
            }
        });
    }
}