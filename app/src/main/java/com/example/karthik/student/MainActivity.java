package com.example.karthik.student;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void username(View view){
        TextView un=findViewById(R.id.username);
        //get userinput username from un
    }
    public void pass(View view){
        TextView pass=findViewById(R.id.pass);
        //get userinput password from pass
    }
    public void codesec(View view){
        Intent code=new Intent(this,enterrcode.class);
        startActivity(code);
    }
}
