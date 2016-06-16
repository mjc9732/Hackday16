package com.example.mjc97.hackday16;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button mButton;
   // EditText eText1;
    //EditText eText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //eText1 = (EditText) findViewById(R.id.editText);
       // eText1.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);

        mButton = (Button) findViewById(R.id.loginButton);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FinderActivity.class));
            }
        });


    }
}
