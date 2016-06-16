package com.example.mjc97.hackday16;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class MockProActivity extends AppCompatActivity {

    ImageView propic;
    TextView proname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_template);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.pro_toolbar);
        myToolbar.setTitle("State Farm Employee");
        myToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(myToolbar);

        propic = (ImageView) findViewById(R.id.propic_iv);
        propic.setImageResource(R.drawable.mockface);
        proname = (TextView) findViewById(R.id.propic_tv);
        proname.setText("Name: Michael Ball" + "\n" + "Honor received: 17 | Can give: 2");

    }
}
