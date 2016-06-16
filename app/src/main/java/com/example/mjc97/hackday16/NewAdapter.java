package com.example.mjc97.hackday16;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class NewAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] description;
    private final String[] honor;
    private final Integer[] honorpic;
    private final Integer[] imgid;

    public NewAdapter(Activity context, String[] itemname, String[] description, String[] honor, Integer[] honorpic, Integer[] imgid) {
        super(context, R.layout.mylist, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.description=description;
        this.honor = honor;
        this.honorpic = honorpic;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView myName = (TextView) rowView.findViewById(R.id.name_tv);
        ImageView myFace = (ImageView) rowView.findViewById(R.id.icon);
        TextView myTeam = (TextView) rowView.findViewById(R.id.team_tv);
        TextView myHonor = (TextView) rowView.findViewById(R.id.honor_tv);
        ImageView myHonorPic = (ImageView) rowView.findViewById(R.id.star_iv);

        myName.setText(itemname[position]);
        myFace.setImageResource(imgid[position]);
        myTeam.setText(description[position]);
        myHonorPic.setImageResource(honorpic[position]);
        myHonor.setText(honor[position]);
        return rowView;

    }

    public void run() {
        notifyDataSetChanged();
    }


}