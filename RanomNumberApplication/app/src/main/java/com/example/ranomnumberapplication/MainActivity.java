package com.example.ranomnumberapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView tv1;
    Button b1;
    EditText txt1,txt2;

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
        txt1 = findViewById(R.id.editTextText);
        txt2 = findViewById(R.id.editTextText2);
        tv1 = findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String aa = txt1.getText().toString();
                String bb = txt2.getText().toString();
                int a1= aa.length();
                int a2 = bb.length();
               tv1.setText("");
                if((a1>0)&&(a2>0))
                {
                    int s = Integer.parseInt(txt1.getText().toString());
                    int e = Integer.parseInt(txt2.getText().toString());
                    if(s<e)
                    {
                        int temp = (int) (Math.random() * ((s - e) + 1)) + e;
                        tv1.setText(String.valueOf(temp));
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Start Value Must Be Big Then End Value", Toast.LENGTH_LONG).show();
                    }
                }
                if((a1>0) && (a2==0))
                {
                    int s = Integer.parseInt(txt1.getText().toString());
                    int temp = (int) (Math.random() * ((s - 100) + 1)) + 100;
                    tv1.setText(String.valueOf(temp));
                }
                if((a1==0)&&(a2>0))
                {
                    int e = Integer.parseInt(txt2.getText().toString());
                    int temp = (int) (Math.random() * ((0 - e) + 1)) + e;
                    tv1.setText(String.valueOf(temp));
                }
                if((a1==0)&&(a2==0))
                {
                    int temp = (int) (Math.random() * 100);
                    tv1.setText(String.valueOf(temp));
                }
            }
        });
    }
}