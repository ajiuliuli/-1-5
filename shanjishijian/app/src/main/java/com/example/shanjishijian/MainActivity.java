package com.example.shanjishijian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button test1;
    Button test2;
    Button test3;
    Button test4;
    Button test5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test1 = (Button)findViewById(R.id.button1);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,test1.class);
                startActivity(intent);
            }
        });

        test2 = (Button)findViewById(R.id.button2);
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,test2.class);
                startActivity(intent);
            }
        });

        test3 = (Button)findViewById(R.id.button3);
        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,test3.class);
                startActivity(intent);
            }
        });

        test4 = (Button)findViewById(R.id.button4);
        test4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,test4.class);
                startActivity(intent);
            }
        });

        test5 = (Button)findViewById(R.id.button5);
        test5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,test5.class);
                startActivity(intent);
            }
        });
    }
}
