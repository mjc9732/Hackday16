package com.example.mjc97.hackday16;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MockProActivity extends AppCompatActivity {

    ImageView propic;
    TextView proname;
    ProgressBar prog1;
    ProgressBar prog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_template);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.pro_toolbar);
        myToolbar.setTitle("State Farm Employee");
        myToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(myToolbar);

        prog1 = (ProgressBar) findViewById(R.id.progress);
        prog2 = (ProgressBar) findViewById(R.id.progress1);

        prog1.setMax(56);
        prog2.setMax(5);
        prog1.setProgress(26);
        prog2.setMax(5);

        propic = (ImageView) findViewById(R.id.propic_iv);
        propic.setImageResource(R.drawable.mockface);
        //proname = (TextView) findViewById(R.id.propic_tv);
        //proname.setText("Name: Michael Ball" + "\n" + "Honor received: 17 | Can give: 2");

    }
}
