package com.example.mjc97.hackday16;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class RankActivity extends ListActivity {




    Employee a = new Employee(R.drawable.ic_launcher, "David", "Peachtree Stars", "Systems", 0);
    Employee b = new Employee(R.drawable.ic_launcher, "Allen", "Peachtree Stars", "Systems", 0);
    Employee c = new Employee(R.drawable.ic_launcher, "Chris", "Peachtree Stars", "Systems", 0);
    Employee d = new Employee(R.drawable.ic_launcher, "Joseph", "Peachtree Stars", "Systems", 0);
    Employee e = new Employee(R.drawable.ic_launcher, "Nick", "Peachtree Stars", "Systems", 0);

    Employee[] itemname = {a, b, c, d, e};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        populateListView();
    }

    private void populateListView() {


        this.setListAdapter(new ArrayAdapter<Employee>(
                this, R.layout.mylist,
                R.id.Itemname,itemname));


    }
}
