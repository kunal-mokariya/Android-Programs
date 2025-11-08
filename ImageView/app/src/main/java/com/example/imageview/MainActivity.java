package com.example.imageview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    Button b1,b2;
    int i = 0;
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
        iv = findViewById(R.id.imageView);
        int[] img = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
        int len = img.length;
        b2 = findViewById(R.id.button2);
        b1 = findViewById(R.id.button);
        iv.setImageResource(img[0]);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(len>(i+1))
                {
                    i++;
                    iv.setImageResource(img[i]);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Image Not Avilabe", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>0)
                {
                    i--;
                    iv.setImageResource(img[i]);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Image Not Avilabe", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}