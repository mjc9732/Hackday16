package com.example.mjc97.hackday16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    ImageView propic;
    TextView proname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_template);
        propic = (ImageView) findViewById(R.id.propic_iv);
        propic.setImageResource(R.drawable.propic2);
        proname = (TextView) findViewById(R.id.propic_tv);
        proname.setText("Name: Jennifer Coleman" + "\n" + "Honor received: 7 | Can give: 4");
    }
}
