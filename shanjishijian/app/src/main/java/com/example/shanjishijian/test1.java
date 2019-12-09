package com.example.shanjishijian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class test1 extends AppCompatActivity {

    EditText name;
    EditText password;
    Button button;
    Button push;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("abc") && password.getText().toString().equals("123")) {
                    Toast.makeText(test1.this, "登陆成功", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(test1.this,"登录失败，请输入正确的用户名和密码！",Toast.LENGTH_SHORT).show();
                    name.setText("");
                    password.setText("");
                }
            }
        });

        push = (Button)findViewById(R.id.push);
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(test1.this,test2.class);
                intent.putExtra("test1File",name.getText().toString() + password.getText().toString());
                startActivity(intent);
            }
        });
    }
}
