package com.example.displaynameusingarrayonebyone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button b1,b2;
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
        tv = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        String[] temp = getResources().getStringArray(R.array.my);
        int[] i = {0};
        int len = temp.length;
        tv.setText("");
        tv.setText(temp[0].toString());

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(len>=(i[0]+2) && (i[0])>=0)
                    {
                        i[0]++;
                        tv.setText("");
                        String abv = String.valueOf(len);
                        tv.setText(temp[i[0]]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Record Not Avilable", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i[0]>0) {
                        i[0]--;
                        tv.setText("");
                        tv.setText(temp[i[0]].toString());
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Record Not Avilable", Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }
}