package com.example.mjc97.hackday16;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;



public class DepartmentProfileActivity extends AppCompatActivity {

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

    NewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_profile);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.dep_toolbar);
        myToolbar.setTitle("Department");
        setSupportActionBar(myToolbar);

        adapter=new NewAdapter(this, itemname, team, honor, honorPic, imgid);
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


