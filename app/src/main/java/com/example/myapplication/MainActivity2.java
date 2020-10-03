package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btfll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        anhxa1();
        btfll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,"+ 1",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity2.this,custom_view.class);
                startActivity(intent);
            }
        });

    }
    private  void anhxa1(){
        btfll=(Button)findViewById(R.id.buttofollow);
    }
}