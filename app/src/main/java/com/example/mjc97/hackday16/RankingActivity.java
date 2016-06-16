package com.example.mjc97.hackday16;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;



public class RankingActivity extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Brian Harris",
            "Richard Ferguson",
            "Brian Buckland",
            "Sophie Robertson",
            "Chloe Rees",
            "Trevor Underwood",
            "Thomas Clarkson",
            "Nicholas Harris",
            "Jack MacLeod"
    };

    String[] team ={
            "Systems",
            "Systems",
            "Systems",
            "Systems",
            "Systems",
            "Systems",
            "Systems",
            "Systems",
            "Systems"
    };

    Integer[] imgid={
            R.drawable.pic13,
            R.drawable.pic12,
            R.drawable.pic5,
            R.drawable.pic8,
            R.drawable.pic9,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic7,
            R.drawable.pic6
    };

    String[] honor={
            "56",
            "45",
            "43",
            "38",
            "36",
            "26",
            "22",
            "15",
            "13"
    };

    Integer[] honorPic={
            R.drawable.first,
            R.drawable.second,
            R.drawable.third,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star
    };

    NewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.rank_toolbar);
        myToolbar.setTitle("Leaderboard");
        myToolbar.setTitleTextColor(Color.WHITE);
        adapter=new NewAdapter(this, itemname, team, honor, honorPic, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        /*list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position] + " gained one honor.";
                honor[+position]= "" + (Integer.parseInt(honor[+position]) +1);
                adapter.run();
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });*/
    }
}


