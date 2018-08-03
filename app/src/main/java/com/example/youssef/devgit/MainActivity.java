package com.example.youssef.devgit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText emaill ,password,mobilenumber;
    TextView move;
    Context context;
    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sharedPref = this.getPreferences(Context.MODE_PRIVATE);


        emaill=findViewById(R.id.email);
        password=findViewById(R.id.pass);
        mobilenumber=findViewById(R.id.mob);
        move=findViewById(R.id.cont);



        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = getSharedPreferences("my",MODE_PRIVATE).edit();
                editor.putString("mob",mobilenumber.getText().toString());
                editor.putString("pass",password.getText().toString());
                editor.putString("useremail",emaill.getText().toString());
                editor.apply();

                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }
}
