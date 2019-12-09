package com.example.shanjishijian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class test2 extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        textView = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        String data = intent.getStringExtra("test1File");
        textView.setText(data);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent("com.example.shanjishijian.ACTION_START");
                intent1.addCategory("android.intent.category.DEFAULT");
                startActivity(intent1);
            }
        });
    }
}
