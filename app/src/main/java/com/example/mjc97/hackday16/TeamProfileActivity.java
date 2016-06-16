package com.example.mjc97.hackday16;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class TeamProfileActivity extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Trevor Underwood",
            "Thomas Clarkson",
            "Brian Buckland",
            "Jack MacLeod",
            "Nicholas Harris",
            "Sophie Robertson",
            "Chloe Rees",
            "David Chang",
            "Allen Wilson-Myers"
    };

    String[] team ={
            "Team Winter",
            "Team Winter",
            "Team Winter",
            "Team Winter",
            "Team Winter",
            "Team Winter",
            "Team Winter",
            "Team Winter",
            "Team Winter"

    };

    Integer[] imgid={
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
            R.drawable.pic10,
            R.drawable.pic11

    };

    Integer[] honorPic={
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star
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
        Toolbar myToolbar = (Toolbar) findViewById(R.id.team_toolbar);
        myToolbar.setTitle("Team");
        myToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(myToolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter=new NewAdapter(this, itemname, team, honor, honorPic, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    final int position, long id) {
                // TODO Auto-generated method stub
                AlertDialog.Builder builder = new AlertDialog.Builder(TeamProfileActivity.this);
                builder.setView(R.layout.dialog_honor).setMessage("Honor")
                        .setCancelable(true)
                        .setPositiveButton("Honor", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String Slecteditem= itemname[+position] + " gained one honor.";
                                honor[+position]= "" + (Integer.parseInt(honor[+position]) +1);
                                adapter.run();
                                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }).create().show();
            }
        });
    }
}


