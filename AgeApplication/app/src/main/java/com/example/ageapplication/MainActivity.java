package com.example.ageapplication;

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;

import android.os.Build;
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

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Button b1;
    EditText txt1,txt2,txt3;
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
        tv1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);
        txt1 = findViewById(R.id.editTextText);
        txt2 = findViewById(R.id.editTextText2);
        txt3 = findViewById(R.id.editTextText3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int date = Integer.parseInt(txt1.getText().toString());
                int month =Integer.parseInt(txt2.getText().toString());
                int year = Integer.parseInt(txt3.getText().toString());

                LocalDate date1 = of(year,month,date);
                LocalDate lt = LocalDate.now();

                Period p = Period.between(date1,lt);
                tv1.setText(String.valueOf("Year: "+p.getYears())+"\nMonth: "+p.getMonths()+"\nDays: "+p.getDays());

            }
        });
    }
}