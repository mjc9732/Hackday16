package com.example.mjc97.hackday16;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.widget.AdapterView.OnItemClickListener;



public class DepartmentProfileActivity extends Activity {

    ListView list;
    String[] itemname ={
            "Ned Stark",
            "Daenerys Targaryen",
            "Tyrion Lannister",
            "Ramsay Bolton",
            "Melisandre",
            "Brandon Stark",
            "Jon Snow",
            "Brienne of Tarth",
            "Gregor Clegane"
    };

    String[] team ={
            "Westeros",
            "Westeros",
            "Westeros",
            "Westeros",
            "Westeros",
            "Westeros",
            "Westeros",
            "Westeros",
            "Westeros"
    };

    Integer[] imgid={
            R.drawable.nedstark,
            R.drawable.danaerys,
            R.drawable.tyrion,
            R.drawable.ramsay,
            R.drawable.melisan,
            R.drawable.branstark,
            R.drawable.jon,
            R.drawable.brienne,
            R.drawable.gregor
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
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher
    };

    NewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_profile);

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


