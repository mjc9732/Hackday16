package com.example.mjc97.hackday16;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.widget.AdapterView.OnItemClickListener;



public class TeamProfileActivity extends Activity {

    ListView list;
    String[] itemname ={
            "Ned Stark",
            "Catelyn Stark",
            "Robb Stark",
            "Sansa Stark",
            "Arya Stark",
            "Brandon Stark",
            "Jon Snow",
            "Brienne of Tarth",
            "Hodor"
    };

    String[] team ={
            "Team Stark",
            "Team Stark",
            "Team Stark",
            "Team Stark",
            "Team Stark",
            "Team Stark",
            "Team Stark",
            "Team Stark",
            "Team Stark"
    };

    Integer[] imgid={
            R.drawable.nedstark,
            R.drawable.catelyn,
            R.drawable.robb,
            R.drawable.sansa,
            R.drawable.arya,
            R.drawable.branstark,
            R.drawable.jon,
            R.drawable.brienne,
            R.drawable.hodor
    };

    String[] honor={
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0"
    };
    NewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_profile);

        adapter=new NewAdapter(this, itemname, team, honor, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position] + " gained one honor.";
                honor[+position]= "" + (Integer.parseInt(honor[+position]) +1);
                adapter.run();
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}


