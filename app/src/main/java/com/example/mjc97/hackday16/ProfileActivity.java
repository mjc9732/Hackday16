package com.example.mjc97.hackday16;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    ImageView propic;
    TextView proname;
    ProgressBar prog1;
    ProgressBar prog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_template);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.pro_toolbar);
        prog1 = (ProgressBar) findViewById(R.id.progress);
        prog2 = (ProgressBar) findViewById(R.id.progress1);
        myToolbar.setTitle("Jennifer Cole");
        myToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(myToolbar);

        prog1.setMax(56);
        prog1.setProgress(21);

        prog2.setMax(5);
        prog2.setProgress(3);

        propic = (ImageView) findViewById(R.id.propic_iv);
        propic.setImageResource(R.drawable.propic2);
        //proname = (TextView) findViewById(R.id.propic_tv);
    }
}
