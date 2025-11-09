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
    String[] txt = {""};
    int index = 0;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
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
        b11 = findViewById(R.id.button16);
        b18 = findViewById(R.id.button18);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ab = "";
                int le = txt.length;
                for(int i=0;i<le;i++)
                {
                    ab = ab+txt[i];
                }
                txt[index] = txt[index]+"1";
                tv1.setText(ab);
                index++;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ab = "";
                int le = txt.length;
                for(int i=0;i<=le;i++)
                {
                    ab = ab+txt[i];
                }
                txt[index] = txt[index]+"2";
                tv1.setText(ab);
                index++;
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}